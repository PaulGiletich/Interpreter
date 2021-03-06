package com.pgiletich.lang.nodes.operators.binary.compare;

import com.pgiletich.lang.values.LangValue;
import com.pgiletich.lang.exceptions.EvaluatingException;
import com.pgiletich.lang.exceptions.OperatorException;
import com.pgiletich.lang.nodes.LangNode;
import com.pgiletich.lang.nodes.operators.binary.BinaryOperatorNode;

public class GreaterNode extends BinaryOperatorNode {

    public GreaterNode(LangNode left, LangNode right) {
        super(left, right);
    }

    @Override
    public LangValue evaluate() throws EvaluatingException {
        LangValue leftValue = left.evaluate();
        LangValue rightValue = right.evaluate();
        try{
            return leftValue.greater(rightValue);
        }
        catch (OperatorException e){
            throw new OperatorException(">", leftValue.getClassName(), rightValue.getClassName(), getLine());
        }
    }
}
