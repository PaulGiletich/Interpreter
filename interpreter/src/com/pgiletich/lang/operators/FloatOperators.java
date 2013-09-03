package com.pgiletich.lang.operators;

import com.pgiletich.lang.exceptions.OperatorException;

/**
 * Created with IntelliJ IDEA.
 * User: sfcpr_000
 * Date: 6/14/13
 * Time: 3:24 AM
 */
public class FloatOperators implements Operators {
    private FloatOperators(){}

    private static final FloatOperators instance = new FloatOperators();

    public static FloatOperators getInstance() {
        return instance;
    }

    @Override
    public Object plus(Object left, Object right) throws OperatorException {
        if(right instanceof Integer){
            return (Double)left + (double)(Integer) right;
        }
        else if(right instanceof Double){
            return (Double)left + (Double)right;
        }
        throw new OperatorException();
    }

    @Override
    public Object minus(Object left, Object right) throws OperatorException {
        if(right instanceof Integer){
            return (Double)left - (double)(Integer) right;
        }
        else if(right instanceof Double){
            return (Double)left - (Double)right;
        }
        throw new OperatorException();
    }

    @Override
    public Object multiply(Object left, Object right) throws OperatorException {
        if(right instanceof Integer){
            return (Double)left * (double)(Integer) right;
        }
        else if(right instanceof Double){
            return (Double)left * (Double)right;
        }
        throw new OperatorException();
    }

    @Override
    public Object divide(Object left, Object right) throws OperatorException {
        if(right instanceof Integer){
            return (Double)left / (double)(Integer)right;
        }
        else if(right instanceof Double){
            return (Double)left / (Double)right;
        }
        throw new OperatorException();
    }

    @Override
    public Object power(Object left, Object right) throws OperatorException {
        if(right instanceof Integer){
            return Math.pow((Double)left, (double)(Integer)right);
        }
        else if(right instanceof Double){
            return Math.pow((Double)left, (Double)right);
        }
        throw new OperatorException();
    }

    @Override
    public Object greater(Object left, Object right) throws OperatorException {
        if(right instanceof Integer){
            return (Double)left > (double)(Integer)right;
        }
        else if(right instanceof Double){
            return (Double)left > (Double)right;
        }
        throw new OperatorException();
    }

    @Override
    public Object equal(Object left, Object right) throws OperatorException {
        if(right instanceof Integer){
            return (Double)left == (double)(Integer)right;
        }
        else if(right instanceof Double){
            return ((Double) left).equals((Double) right);
        }
        throw new OperatorException();
    }

    @Override
    public Object lookup(Object left, Object right) throws OperatorException {
        throw new OperatorException();
    }
}
