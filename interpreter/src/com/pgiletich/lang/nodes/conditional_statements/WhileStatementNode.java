package com.pgiletich.lang.nodes.conditional_statements;

import com.pgiletich.lang.values.LangValue;
import com.pgiletich.lang.exceptions.EvaluatingException;
import com.pgiletich.lang.nodes.LangNode;

/**
 * Created with IntelliJ IDEA.
 * User: sfcpr_000
 * Date: 5/27/13
 * Time: 9:11 PM
 */
public class WhileStatementNode extends ConditionalStatementNode {
    public WhileStatementNode(LangNode expression, LangNode codeBlock) {
        super(expression, codeBlock);
    }

    @Override
    public LangValue evaluate() throws EvaluatingException {
        while(true){
            LangValue expressionValue = expression.evaluate();
            if(expressionValue.getValue() instanceof Boolean){
                if ((Boolean)expressionValue.getValue()){
                    codeBlock.evaluate();
                }
                else break;
            }
            else throw new EvaluatingException("There should be a boolean value", getLine());
        }
        return null;
    }
}
