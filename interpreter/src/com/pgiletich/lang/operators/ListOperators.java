package com.pgiletich.lang.operators;

import com.pgiletich.lang.values.LangValue;
import com.pgiletich.lang.exceptions.OperatorException;

import java.util.ArrayList;
import java.util.List;

public class ListOperators implements Operators {
    private ListOperators(){}

    private static final ListOperators instance = new ListOperators();

    public static ListOperators getInstance() {
        return instance;
    }
    
    @Override
    public Object plus(Object left, Object right) throws OperatorException {
        List<LangValue> reslist = new ArrayList<LangValue>((List<LangValue>)left);
        if(right instanceof List){
            reslist.addAll((List<LangValue>)right);
            return reslist;
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
        throw new OperatorException();  
    }

    @Override
    public Object lookup(Object left, Object right) throws OperatorException {
        if(right instanceof Integer){
            int index = (Integer)right;
            return ((List)left).get(index);
        }
        throw new OperatorException();
    }
}
