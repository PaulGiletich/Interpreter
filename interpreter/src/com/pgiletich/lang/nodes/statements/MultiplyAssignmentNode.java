package com.pgiletich.lang.nodes.statements;

import com.pgiletich.helpers.ParallelIterable;
import com.pgiletich.helpers.Pair;
import com.pgiletich.lang.values.LangValue;
import com.pgiletich.lang.Scope;
import com.pgiletich.lang.exceptions.EvaluatingException;
import com.pgiletich.lang.exceptions.VarNotFoundException;
import com.pgiletich.lang.nodes.LangNode;
import com.pgiletich.lang.nodes.atoms.VarNode;

import java.util.ArrayList;
import java.util.List;

public class MultiplyAssignmentNode extends LangNode {
    List<LangNode> leftNodes = new ArrayList<LangNode>();
    LangNode right;
    Scope scope;

    public MultiplyAssignmentNode(LangNode right, Scope scope) {
        this.right = right;
        this.scope = scope;
    }

    public void addLeftValue(LangNode node){
        leftNodes.add(node);
    }

    @Override
    public LangValue evaluate() throws EvaluatingException{
        LangValue rightValue = right.evaluate();
        if(!(rightValue.getValue() instanceof List)){
            throw new EvaluatingException("Right part of multiply assignment must be a list", getLine());
        }
        for(Pair<LangNode, LangValue> p: new ParallelIterable<LangNode, LangValue>(leftNodes, (Iterable)rightValue.getValue())){
            try{
                p.left().evaluate().setValue(p.right().getValue());
            }
            catch (VarNotFoundException e){
                if(p.left() instanceof VarNode){
                    scope.set(((VarNode) p.left()).getName(), p.right());
                }
            }
        }
        return rightValue;
    }
}
