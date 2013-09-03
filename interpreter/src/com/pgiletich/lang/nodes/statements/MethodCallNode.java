package com.pgiletich.lang.nodes.statements;

import com.pgiletich.lang.Function;
import com.pgiletich.lang.Scope;
import com.pgiletich.lang.exceptions.EvaluatingException;
import com.pgiletich.lang.nodes.LangNode;
import com.pgiletich.lang.values.LangValue;

import java.util.ArrayList;
import java.util.List;

public class MethodCallNode extends LangNode {
    private String name;
    private LangNode object;
    private List<LangNode> args;

    public MethodCallNode(String name, LangNode object, List<LangNode> args) {
        this.name = name;
        this.object = object;
        this.args = args == null ? new ArrayList<LangNode>() : args;
    }

    @Override
    public LangValue evaluate() throws EvaluatingException {
        String functionFullName = name + "|" + args.size();
        LangValue objectValue;
        if(functionFullName.contains("new|")){
            objectValue = object.evaluate().newObject();
        }
        else{
            objectValue = object.evaluate();
        }
        Function method = objectValue.getScope().getFunction(functionFullName);
        if(method == null){
            throw new EvaluatingException("Method not found: " + name + "(" + args.size() + " args)", getLine());
        }
        List<LangValue> argValues = new ArrayList<LangValue>();
        for(LangNode arg: args){
            argValues.add(arg.evaluate());
        }
        if(functionFullName.contains("new|")){
            method.call(objectValue, argValues);
            return objectValue;
        }
        return method.call(objectValue, argValues);
    }

    private LangValue newMethodEvaluate() throws EvaluatingException{
        LangValue prototypeValue = object.evaluate();
        return prototypeValue.copy();
    }
}
