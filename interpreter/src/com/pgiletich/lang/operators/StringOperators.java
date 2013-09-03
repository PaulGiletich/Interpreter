package com.pgiletich.lang.operators;

import com.pgiletich.lang.exceptions.OperatorException;

public class StringOperators implements Operators {
    private StringOperators(){}

    private static final StringOperators instance = new StringOperators();

    public static StringOperators getInstance() {
        return instance;
    }
    
    @Override
    public Object plus(Object left, Object right) throws OperatorException {
        if(right instanceof Integer || right instanceof String || right instanceof Double){
            return left.toString() + right.toString();
        }
        throw new OperatorException();
    }

    @Override
    public Object minus(Object left, Object right) throws OperatorException {
        throw new OperatorException();
    }

    @Override
    public Object multiply(Object left, Object right) throws OperatorException {
        throw new OperatorException();
    }

    @Override
    public Object divide(Object left, Object right) throws OperatorException {
        throw new OperatorException();
    }

    @Override
    public Object power(Object left, Object right) throws OperatorException {
        throw new OperatorException();
    }

    @Override
    public Object greater(Object left, Object right) throws OperatorException {
        throw new OperatorException();
    }

    @Override
    public Object equal(Object left, Object right) throws OperatorException {
        if(right instanceof String){
            return ((String)left).equals((String)right);
        }
        throw new OperatorException();
    }

    @Override
    public Object lookup(Object left, Object right) throws OperatorException {
        throw new OperatorException();
    }
}
