package com.pgiletich.lang.nodes.conditional_statements;

import com.pgiletich.lang.values.LangValue;
import com.pgiletich.lang.exceptions.EvaluatingException;
import com.pgiletich.lang.nodes.LangNode;

public class IfStatementNode extends ConditionalStatementNode {
    private LangNode elseBlock;

    public IfStatementNode(LangNode expression, LangNode codeBlock, LangNode elseBlock) {
        super(expression, codeBlock);
        this.elseBlock = elseBlock;
    }

    @Override
    public LangValue evaluate() throws EvaluatingException{
        LangValue expressionValue = expression.evaluate();
        if(expressionValue.getValue() instanceof Boolean){
            if((Boolean)expressionValue.getValue()){
                codeBlock.evaluate();
            }
            else {
                if(elseBlock != null){
                    elseBlock.evaluate();
                }
            }
        }
        else throw new EvaluatingException("There should be a boolean value", getLine());
        return null;
    }

    @Override
    public String toString() {
        return "if(" + expression.toString() + ")" + codeBlock.toString() + "\nelse" + elseBlock.toString();
    }
}
