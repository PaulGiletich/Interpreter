package com.pgiletich.lang.nodes.operators.binary;

import com.pgiletich.lang.values.LangValue;
import com.pgiletich.lang.exceptions.EvaluatingException;
import com.pgiletich.lang.exceptions.OperatorException;
import com.pgiletich.lang.nodes.LangNode;

public class LookupNode extends BinaryOperatorNode {

    public LookupNode(LangNode lookupable, LangNode index) {
        super(lookupable, index);
    }

    @Override
    public LangValue evaluate() throws EvaluatingException {
        LangValue lookupableValue = left.evaluate();
        LangValue indexValue = right.evaluate();
        try{
            return lookupableValue.lookup(indexValue);
        }
        catch (OperatorException e){
            throw new OperatorException("[]", lookupableValue.getClassName(), indexValue.getClassName(), getLine());
        }
        catch (IndexOutOfBoundsException e){
            throw new EvaluatingException("Index " + (Integer)indexValue.getValue() + " is out of bounds", getLine());
        }
    }
}
