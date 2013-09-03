package com.pgiletich.lang;

import com.pgiletich.helpers.Pair;
import com.pgiletich.helpers.ParallelIterable;
import com.pgiletich.lang.exceptions.EvaluatingException;
import com.pgiletich.lang.nodes.LangNode;
import com.pgiletich.lang.nodes.atoms.VarNode;
import com.pgiletich.lang.parser.langAstTreeWalker;
import com.pgiletich.lang.values.LangValue;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import java.util.ArrayList;
import java.util.List;

public class Function {
    private final String name;
    private List<LangNode> args;
    private CommonTree codeTree;

    public Function(String name, Object args, Object codeTree) throws RecognitionException {
        this.codeTree = (CommonTree)codeTree;
        this.args = args == null ? null : new langAstTreeWalker(new CommonTreeNodeStream(args)).idList().treeNode;
        if (this.args == null){
            this.args = new ArrayList<LangNode>();
        }
        this.name = name + "|" + this.args.size();
    }

    public LangValue call(List<LangValue> args) throws EvaluatingException {
        Scope scope = new Scope();
        for(Pair<LangNode, LangValue> p: new ParallelIterable<LangNode,LangValue>(this.args, args)){
            scope.set(((VarNode)p.left()).getName(), new LangValue(p.right().getValue()));
        }
        scope.set("%retValue", new LangValue(null));

        LangNode codeBlock;
        langAstTreeWalker walker = new langAstTreeWalker(new CommonTreeNodeStream(codeTree));
        walker.setScope(scope);
        try {
            codeBlock = walker.codeBlock().treeNode;
        } catch (RecognitionException e) {
            e.printStackTrace();  //TODO
            return null;
        }
        codeBlock.evaluate();
        return scope.get("%retValue");
    }

    public LangValue call(LangValue selfObject, List<LangValue> args) throws EvaluatingException {
        Scope scope = new Scope();
        for(Pair<LangNode, LangValue> p: new ParallelIterable<LangNode,LangValue>(this.args, args)){
            scope.set(((VarNode)p.left()).getName(), p.right().copy());
        }
        scope.set("%retValue", new LangValue(null));
        scope.set("this", selfObject);

        LangNode codeBlock;
        langAstTreeWalker walker = new langAstTreeWalker(new CommonTreeNodeStream(codeTree));
        walker.setScope(scope);
        try {
            codeBlock = walker.codeBlock().treeNode;
        } catch (RecognitionException e) {
            e.printStackTrace();  //TODO
            return null;
        }
        codeBlock.evaluate();
        return scope.get("%retValue");
    }

    public String getName() {
        return name;
    }
}