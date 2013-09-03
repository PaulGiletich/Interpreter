package com.pgiletich.lang.nodes.operators.binary;

import com.pgiletich.lang.values.LangValue;
import com.pgiletich.lang.Scope;
import com.pgiletich.lang.exceptions.EvaluatingException;
import com.pgiletich.lang.exceptions.VarNotFoundException;
import com.pgiletich.lang.nodes.LangNode;
import com.pgiletich.lang.nodes.atoms.VarNode;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sfcpr_000
 * Date: 5/28/13
 * Time: 10:08 PM
 */
public class InsertOperatorNode extends BinaryOperatorNode {
    Scope scope;

    public InsertOperatorNode(LangNode left, LangNode right, Scope scope) {
        super(left, right);
        this.scope = scope;
    }

    @Override
    public LangValue evaluate() throws EvaluatingException {
        LangValue leftVal;
        LangValue rightValue = right.evaluate();
        try{
            leftVal = left.evaluate();
            if(leftVal.getValue() instanceof List){
                ((List<LangValue>)leftVal.getValue()).add(new LangValue(rightValue.getValue()));
            }
            else throw new EvaluatingException("There should be an array", getLine());
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
