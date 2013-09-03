package com.pgiletich.lang.operators;

import com.pgiletich.lang.exceptions.OperatorException;

public class IntegerOperators implements Operators {
    private IntegerOperators(){}

    private static final IntegerOperators instance = new IntegerOperators();

    public static IntegerOperators getInstance() {
        return instance;
    }

    @Override
    public Object plus(Object left, Object right) throws OperatorException{
        if(right instanceof Integer){
            return (Integer)left + (Integer)right;
        }
        if(right instanceof Double){
            return (Integer)left + (Double)right;
        }
        if(right instanceof String){
            return left.toString() + right;
        }
        throw new OperatorException();
    }

    @Override
    public Object minus(Object left, Object right) throws OperatorException {
        if(right instanceof Integer){
            return (Integer)left - (Integer)right;
        }
        throw new OperatorException();
    }

    @Override
    public Object multiply(Object left, Object right) throws OperatorException {
        if(right instanceof Integer){
            return (Integer)left * (Integer)right;
        }
        throw new OperatorException();
    }

    @Override
    public Object divide(Object left, Object right) throws OperatorException {
        if(right instanceof Integer){
            return (double)(Integer)left / (double)(Integer)right;
        }
        throw new OperatorException();
    }

    @Override
    public Object power(Object left, Object right) throws OperatorException {
        if(right instanceof Integer){
            return (int)Math.pow((double)(Integer)left, (double)(Integer)right);
        }
        if(right instanceof Double){
            return Math.pow((double)(Integer)left, (Double)right);
        }
        throw new OperatorException();
    }

    @Override
    public Object greater(Object left, Object right) throws OperatorException {
        if(right instanceof Integer){
            return (Integer)left > (Integer)right;
        }
        throw new OperatorException();
    }

    @Override
    public Object equal(Object left, Object right) throws OperatorException {
        if(right instanceof Integer){
            return ((Integer)left).equals((Integer)right);
        }
        throw new OperatorException();
    }

    @Override
    public Object lookup(Object left, Object right) throws OperatorException {
        throw new OperatorException();
    }
}
