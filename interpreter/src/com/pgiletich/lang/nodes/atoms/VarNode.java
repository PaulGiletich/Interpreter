package com.pgiletich.lang.nodes.atoms;

import com.pgiletich.lang.values.LangValue;
import com.pgiletich.lang.Scope;
import com.pgiletich.lang.exceptions.EvaluatingException;
import com.pgiletich.lang.exceptions.VarNotFoundException;
import com.pgiletich.lang.nodes.LangNode;

/**
 * Created with IntelliJ IDEA.
 * User: sfcpr_000
 * Date: 4/30/13
 * Time: 2:44 PM
 */
public class VarNode extends LangNode {
    private String name;
    private Scope scope;

    public VarNode(String name, Scope scope) {
        this.name = name;
        this.scope = scope;
    }

    @Override
    public LangValue evaluate() throws EvaluatingException{
        LangValue result = scope.get(name);
        if(result == null){
            throw new VarNotFoundException(name, getLine());
        }
        return result;
    }

    public String getName() {
        return name;
    }
}
