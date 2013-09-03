package com.pgiletich.lang.nodes.operators.unary;

import com.pgiletich.lang.nodes.LangNode;

public abstract class UnaryOperatorNode extends LangNode {
    protected LangNode expr;

    protected UnaryOperatorNode(LangNode expr){
        this.expr = expr;
    }
}
