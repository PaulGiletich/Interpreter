package com.pgiletich.lang.nodes.statements;

import com.pgiletich.lang.values.LangValue;
import com.pgiletich.lang.exceptions.EvaluatingException;
import com.pgiletich.lang.nodes.LangNode;

public class PropertyCallNode extends LangNode {
    private String name;
    private LangNode var;

    public PropertyCallNode(LangNode var, String name) {
        this.var = var;
        this.name = name;
    }

    @Override
    public LangValue evaluate() throws EvaluatingException {
        LangValue value = var.evaluate();
        LangValue result = value.getScope().get(name);
        if(result == null){
            LangValue newProp = new LangValue(null);
            value.getScope().set(name, newProp);
            return newProp;
        }
        return result;
    }
}
