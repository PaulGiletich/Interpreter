package com.pgiletich.lang.nodes.operators.unary;

import com.pgiletich.lang.values.LangValue;
import com.pgiletich.lang.exceptions.EvaluatingException;
import com.pgiletich.lang.nodes.LangNode;

public class UnaryNegationNode extends UnaryOperatorNode {
    public UnaryNegationNode(LangNode expr) {
        super(expr);
    }

    @Override
    public LangValue evaluate() throws EvaluatingException {
        LangValue exprValue = expr.evaluate();
        if(exprValue.getValue() instanceof Boolean){
            return new LangValue(!(Boolean)exprValue.getValue());
        }
        else throw new EvaluatingException("The value of negation cannot be a " + exprValue.getValue().getClass(), getLine());
    }
}
