package com.pgiletich.lang.values;

import com.pgiletich.lang.values.LangValue;
import com.pgiletich.lang.exceptions.OperatorException;

public interface LangValueOperators {
    public LangValue plus(LangValue other) throws OperatorException;

    public LangValue minus(LangValue other) throws OperatorException;

    public LangValue multiply(LangValue other) throws OperatorException;

    public LangValue divide(LangValue other) throws OperatorException;

    public LangValue power(LangValue other) throws OperatorException;

    public LangValue greater(LangValue other) throws OperatorException;

    public LangValue equal(LangValue other) throws OperatorException;

    public LangValue lookup(LangValue other) throws OperatorException;
}
