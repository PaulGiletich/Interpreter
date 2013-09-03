package com.pgiletich.lang.nodes.operators.binary;

import com.pgiletich.lang.values.LangValue;
import com.pgiletich.lang.exceptions.EvaluatingException;
import com.pgiletich.lang.nodes.LangNode;
import com.pgiletich.lang.nodes.atoms.VarNode;

public class IsOperatorNode extends BinaryOperatorNode {


    public IsOperatorNode(LangNode left, LangNode right) {
        super(left, right);
    }

    @Override
    public LangValue evaluate() throws EvaluatingException {
        LangValue exprValue = left.evaluate();
        if(exprValue.getClassName().equals(((VarNode)right).getName())){//TODO:change right part
            return new LangValue(true);
        }
        return new LangValue(false);
    }
}
