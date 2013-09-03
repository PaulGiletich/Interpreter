package com.pgiletich.lang.nodes.conditional_statements;

import com.pgiletich.lang.values.LangValue;
import com.pgiletich.lang.Scope;
import com.pgiletich.lang.exceptions.EvaluatingException;
import com.pgiletich.lang.nodes.LangNode;
import com.pgiletich.lang.nodes.atoms.VarNode;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sfcpr_000
 * Date: 5/28/13
 * Time: 11:52 AM
 */
public class ForStatementNode extends ConditionalStatementNode {
    private LangNode variable;
    private Scope scope;

    public ForStatementNode(LangNode variable, LangNode expression, LangNode codeBlock, Scope scope){
        super(expression, codeBlock);
        this.variable = variable;
        this.scope = scope;
    }

    @Override
    public LangValue evaluate() throws EvaluatingException {
        LangValue list = expression.evaluate();
        if(list.getValue() instanceof List){
            for(LangValue item: (List<LangValue>)list.getValue()){
                scope.set(((VarNode)variable).getName(), item);
                codeBlock.evaluate();
            }
        }
        else throw new EvaluatingException("Right part of for statement should be a list", getLine());
        return null;
    }
}
