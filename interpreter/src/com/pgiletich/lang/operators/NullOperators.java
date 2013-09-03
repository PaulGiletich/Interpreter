package com.pgiletich.lang.operators;

import com.pgiletich.lang.exceptions.OperatorException;

/**
 * Created with IntelliJ IDEA.
 * User: sfcpr_000
 * Date: 6/14/13
 * Time: 3:25 AM
 */
public class NullOperators implements Operators {
    private NullOperators(){}

    private static final NullOperators instance = new NullOperators();

    public static NullOperators getInstance() {
        return instance;
    }
    
    @Override
    public Object plus(Object left, Object right) throws OperatorException {
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
        throw new OperatorException();
    }

    @Override
    public Object lookup(Object left, Object right) throws OperatorException {
        throw new OperatorException();
    }
}
