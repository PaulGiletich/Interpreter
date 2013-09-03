package com.pgiletich.lang.nodes.operators.binary.logic;

import com.pgiletich.lang.values.LangValue;
import com.pgiletich.lang.exceptions.EvaluatingException;
import com.pgiletich.lang.exceptions.OperatorException;
import com.pgiletich.lang.nodes.LangNode;
import com.pgiletich.lang.nodes.operators.binary.BinaryOperatorNode;

/**
 * Created with IntelliJ IDEA.
 * User: sfcpr_000
 * Date: 6/6/13
 * Time: 6:20 PM
 */
public class OrNode extends BinaryOperatorNode {

    public OrNode(LangNode left, LangNode right) {
        super(left, right);
    }

    @Override
    public LangValue evaluate() throws EvaluatingException {
        LangValue leftValue = left.evaluate();
        LangValue rightValue = right.evaluate();
        if(leftValue.getValue() instanceof Boolean && rightValue.getValue() instanceof Boolean){
            return new LangValue((Boolean)leftValue.getValue() || (Boolean)rightValue.getValue());
        }
        throw new OperatorException("or", leftValue.getClassName(), rightValue.getClassName(), getLine());
    }
}
