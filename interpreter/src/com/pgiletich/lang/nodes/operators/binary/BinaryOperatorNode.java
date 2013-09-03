package com.pgiletich.lang.nodes.operators.binary;

import com.pgiletich.lang.nodes.LangNode;

public abstract class BinaryOperatorNode extends LangNode {
    protected LangNode left;
    protected LangNode right;

    protected BinaryOperatorNode(LangNode left, LangNode right){
        this.left = left;
        this.right = right;
    }
}
