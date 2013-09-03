package com.pgiletich.lang.operators;

import com.pgiletich.lang.exceptions.OperatorException;

public interface Operators{
    public Object plus(Object left, Object right) throws OperatorException;

    public Object minus(Object left, Object right ) throws OperatorException;

    public Object multiply(Object left, Object right ) throws OperatorException;

    public Object divide(Object left, Object right ) throws OperatorException;

    public Object power(Object left, Object right ) throws OperatorException;

    public Object greater(Object left, Object right ) throws OperatorException;

    public Object equal(Object left, Object right ) throws OperatorException;

    public Object lookup(Object left, Object right ) throws OperatorException;
}

