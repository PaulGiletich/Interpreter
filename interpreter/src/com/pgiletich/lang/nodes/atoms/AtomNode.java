package com.pgiletich.lang.nodes.atoms;

import com.pgiletich.lang.values.LangValue;
import com.pgiletich.lang.exceptions.EvaluatingException;
import com.pgiletich.lang.nodes.LangNode;

/**
 * Created with IntelliJ IDEA.
 * User: sfcpr_000
 * Date: 3/18/13
 * Time: 8:22 PM
 */
public class AtomNode extends LangNode {

    private LangValue value;

    public AtomNode(Object value){
        this.value = new LangValue(value);
    }

    @Override
    public LangValue evaluate() throws EvaluatingException {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
