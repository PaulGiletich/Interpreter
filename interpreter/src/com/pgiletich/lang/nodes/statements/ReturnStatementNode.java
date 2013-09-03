package com.pgiletich.lang.nodes.statements;

import com.pgiletich.lang.values.LangValue;
import com.pgiletich.lang.Scope;
import com.pgiletich.lang.exceptions.EvaluatingException;
import com.pgiletich.lang.nodes.LangNode;

/**
 * Created with IntelliJ IDEA.
 * User: sfcpr_000
 * Date: 5/28/13
 * Time: 3:20 AM
 */
public class ReturnStatementNode extends LangNode {
    private LangNode expression;
    private Scope scope;

    public ReturnStatementNode(LangNode expression, Scope scope) {
        this.expression = expression;
        this.scope = scope;
    }

    @Override
    public LangValue evaluate() throws EvaluatingException {
        if(scope.get("%retValue") == null){
            throw new EvaluatingException("Trying to return something from without a function", getLine());
        }
        else {
            scope.set("%retValue", expression.evaluate());
        }
        return null;
    }
}
