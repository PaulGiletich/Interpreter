package com.pgiletich.lang.nodes.conditional_statements;

import com.pgiletich.lang.nodes.LangNode;

/**
 * Created with IntelliJ IDEA.
 * User: sfcpr_000
 * Date: 5/27/13
 * Time: 9:11 PM
 */
public abstract class ConditionalStatementNode extends LangNode {
    protected LangNode expression;
    protected LangNode codeBlock;

    public ConditionalStatementNode(LangNode expression, LangNode codeBlock) {
        this.expression = expression;
        this.codeBlock = codeBlock;
    }
}
