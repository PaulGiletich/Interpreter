package com.pgiletich.lang.nodes.statements;

import com.pgiletich.lang.values.LangValue;
import com.pgiletich.lang.Scope;
import com.pgiletich.lang.exceptions.EvaluatingException;
import com.pgiletich.lang.exceptions.VarNotFoundException;
import com.pgiletich.lang.nodes.LangNode;
import com.pgiletich.lang.nodes.atoms.VarNode;

public class AssignmentNode extends LangNode {
    LangNode left;
    LangNode right;
    Scope scope;

    public AssignmentNode(LangNode left, LangNode right, Scope scope) {
        this.left = left;
        this.right = right;
        this.scope = scope;
    }

    @Override
    public LangValue evaluate() throws EvaluatingException{
        LangValue rightValue = right.evaluate();
        try{
            LangValue leftValue = left.evaluate();
            LangValue.assign(leftValue, rightValue);
        }
        catch (VarNotFoundException e){
            if(left instanceof VarNode){
                scope.set(((VarNode)left).getName(), rightValue);
            }
            else throw new EvaluatingException("There should be a modifiable lvalue", getLine());
        }
        return rightValue;
    }
}
