package com.pgiletich.lang.nodes.atoms;

import com.pgiletich.lang.values.LangValue;
import com.pgiletich.lang.exceptions.EvaluatingException;
import com.pgiletich.lang.nodes.LangNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sfcpr_000
 * Date: 4/30/13
 * Time: 10:37 PM
 */
public class ListNode extends LangNode {
    private List<LangNode> elements;

    public ListNode(List<LangNode> elements) {
        this.elements = elements == null ? new ArrayList<LangNode>() : elements;
    }

    @Override
    public LangValue evaluate() throws EvaluatingException {
        List<LangValue> array = new ArrayList<LangValue>();
        for(LangNode element: elements){
            array.add(element.evaluate());
        }
        return new LangValue(array);
    }
}
