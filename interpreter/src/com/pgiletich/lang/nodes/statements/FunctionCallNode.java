package com.pgiletich.lang.nodes.statements;

import com.pgiletich.lang.Function;
import com.pgiletich.lang.Scope;
import com.pgiletich.lang.values.LangValue;
import com.pgiletich.lang.exceptions.EvaluatingException;
import com.pgiletich.lang.nodes.LangNode;

import java.util.ArrayList;
import java.util.List;

public class FunctionCallNode extends LangNode {
    private String name;
    private List<LangNode> args;

    public FunctionCallNode(String name, List<LangNode> args) {
        this.name = name;
        this.args = args == null ? new ArrayList<LangNode>() : args;
    }

    @Override
    public LangValue evaluate() throws EvaluatingException {
        if(name.equals("puts")){
            return puts();
        }
//        //moved to standard library
//        if(name.equals("size")){
//            return size();
//        }
        else {
            Function function = Scope.getGlobalScopeInstance().getFunction(name + "|" + args.size());
            if(function == null){
                throw new EvaluatingException("Function not found: " + name + "(" + args.size() + " args)", getLine());
            }
            List<LangValue> argValues = new ArrayList<LangValue>();
            for(LangNode arg: args){
                argValues.add(arg.evaluate());
            }
            return function.call(argValues);
        }
    }

    private LangValue puts() throws EvaluatingException {
        if(args.size() == 0){
            System.out.println();
        }
        for(LangNode arg: args){
            System.out.println(arg.evaluate());
        }
        return new LangValue(null);
    }

    private LangValue size() throws EvaluatingException {
        if(args.size() != 1){
            throw new EvaluatingException("size function must have one argument", getLine());
        }
        LangValue list = args.get(0).evaluate();
        if(!(list.getValue() instanceof List)){
            throw new EvaluatingException("argument of size() must be a list", getLine());
        }
        return new LangValue(((List)list.getValue()).size());
    }
}
