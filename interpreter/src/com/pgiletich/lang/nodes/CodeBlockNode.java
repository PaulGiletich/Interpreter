package com.pgiletich.lang.nodes;

import com.pgiletich.lang.values.LangValue;
import com.pgiletich.lang.exceptions.EvaluatingException;
import com.pgiletich.lang.nodes.statements.ReturnStatementNode;

import java.util.ArrayList;
import java.util.List;

public class CodeBlockNode extends LangNode {
    private List<LangNode> statements;

    public CodeBlockNode() {
        statements = new ArrayList<LangNode>();
    }

    @Override
    public LangValue evaluate() throws EvaluatingException {
        for(LangNode st: statements){
            st.evaluate();
            if(st instanceof ReturnStatementNode) break;
        }
        return null;
    }

    @Override
    public String toString() {
        return statements.toString();
    }

    public void addStatement(LangNode node){
        statements.add(node);
    }
}
