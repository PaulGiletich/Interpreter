package com.pgiletich.lang;

import com.pgiletich.lang.values.LangValue;

import java.util.HashMap;
import java.util.Map;

public class Scope {
    private static final Scope globalScopeInstance = new Scope();
    private Scope parent;
    private Map<String, LangValue> variables;
    private Map<String, Function> functions;

    public Scope(){
        this(null);
    }

    public Scope(Scope parent){
        this.parent = parent;
        variables = new HashMap<String, LangValue>();
        functions = new HashMap<String, Function>();
    }

    public static Scope getGlobalScopeInstance() {
        return globalScopeInstance;
    }

    public void set(String name, LangValue value){
        if(get(name) == null){
            variables.put(name, value);
        }
        else if(variables.containsKey(name)){
            variables.put(name, value);
        }
        else if(parent != null){
            parent.set(name, value);
        }
    }

    public LangValue get(String name){
        LangValue value = variables.get(name);
        if (value != null){
            return value;
        }
        else if (parent != null){
            return parent.get(name);
        }
        else if(this != globalScopeInstance){
            return getGlobalScopeInstance().get(name);
        }
        return null;
    }

    public Scope parent() {
        return parent;
    }

    public void addFunction(Function function){
        functions.put(function.getName(), function);
    }

    public Function getFunction(String name){
        return functions.get(name);
    }

    public void fillFromPrototype(Scope scope) {
        for(String key: scope.variables.keySet()){
            this.variables.put(key, new LangValue(scope.variables.get(key).getValue()));
        }
        this.functions = new HashMap<String, Function>(scope.functions);
    }
}
