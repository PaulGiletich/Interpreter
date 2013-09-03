package com.pgiletich.lang.values;

import com.pgiletich.lang.Scope;
import com.pgiletich.lang.exceptions.EvaluatingException;
import com.pgiletich.lang.exceptions.OperatorException;
import com.pgiletich.lang.operators.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LangValue implements LangValueOperators {
    public static final LangValue ObjectValue = new LangValue();
    public static final LangValue ClassValue = new LangValue();

    private Object value;
    private Operators operatorsStrategy;
    private Scope scope;

    private LangValue(){}

    public LangValue(Object obj){
        value = obj;
        scope = new Scope();
        this.operatorsStrategy = getOperatorStrategy(value);
        if(operatorsStrategy == null){
            scope.set("className", new LangValue(getTypeName(value)));
        }
    }

    private Operators getOperatorStrategy(Object obj) {
        if(obj == null) return NullOperators.getInstance();
        if(obj instanceof Integer) return IntegerOperators.getInstance();
        if(obj instanceof Double) return FloatOperators.getInstance();
        if(obj instanceof Boolean) return BooleanOperators.getInstance();
        if(obj instanceof List) return ListOperators.getInstance();
        if(obj instanceof String) return StringOperators.getInstance();
        if(obj == ObjectValue || obj == ClassValue) return null;
        throw new IllegalStateException();
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
        this.operatorsStrategy = getOperatorStrategy(value);
        scope.set("className", new LangValue(getTypeName(value)));
    }

    private String getTypeName(Object obj) {
        if(obj == null) return "null";
        if(obj instanceof Integer) return "integer";
        if(obj instanceof Double) return "float";
        if(obj instanceof Boolean) return "boolean";
        if(obj instanceof List) return "list";
        if(obj instanceof String) return "string";
        if(obj == ObjectValue) return "object";
        if(obj == ClassValue) return "class";
        throw new IllegalStateException();
    }

    @Override
    public String toString() {
        if(value == null) return "null";
        if(value == ObjectValue) return (String)scope.get("className").getValue() + " object";
        return value.toString();
    }

    public Scope getScope() {
        return scope;
    }

    public String getClassName() {
        if(operatorsStrategy != null){
            return getTypeName(value);
        }
        return (String)scope.get("className").getValue();
    }

    public LangValue copy(){
        LangValue newValue = new LangValue(this.value);
        newValue.getScope().fillFromPrototype(this.scope);
        return newValue;
    }

    public LangValue newObject() {
        LangValue newValue = new LangValue(ObjectValue);
        newValue.getScope().fillFromPrototype(this.scope);
        return newValue;
    }

    public static void assign(LangValue left, LangValue right){
        left.setValue(right.getValue());
        left.getScope().fillFromPrototype(right.getScope());
    }

    @Override
    public LangValue plus(LangValue other) throws OperatorException {
        if(operatorsStrategy != null){
            return new LangValue(operatorsStrategy.plus(this.getValue(), other.getValue()));
        }
        try{
            return scope.getFunction("_plus_|1").call(this, Arrays.asList(other));
        }
        catch (NullPointerException e){
            throw new OperatorException();
        }
        catch (EvaluatingException e){
            throw new OperatorException(e);
        }
    }

    @Override
    public LangValue minus(LangValue other) throws OperatorException {
        if(operatorsStrategy != null){
            return new LangValue(operatorsStrategy.minus(this.getValue(), other.getValue()));
        }
        try{
            return scope.getFunction("_minus_|1").call(this, Arrays.asList(other));
        }
        catch (NullPointerException e){
            throw new OperatorException();
        }
        catch (EvaluatingException e){
            throw new OperatorException(e);
        }
    }

    @Override
    public LangValue multiply(LangValue other) throws OperatorException {
        if(operatorsStrategy != null){
            return new LangValue(operatorsStrategy.multiply(this.getValue(), other.getValue()));
        }
        try{
            return scope.getFunction("_multiply_|1").call(this, Arrays.asList(other));
        }
        catch (NullPointerException e){
            throw new OperatorException();
        }
        catch (EvaluatingException e){
            throw new OperatorException(e);
        }
    }

    @Override
    public LangValue divide(LangValue other) throws OperatorException {
        if(operatorsStrategy != null){
            return new LangValue(operatorsStrategy.divide(this.getValue(), other.getValue()));
        }
        try{
            return scope.getFunction("_divide_|1").call(this, Arrays.asList(other));
        }
        catch (NullPointerException e){
            throw new OperatorException();
        }
        catch (EvaluatingException e){
            throw new OperatorException(e);
        }
    }

    @Override
    public LangValue power(LangValue other) throws OperatorException {
        if(operatorsStrategy != null){
            return new LangValue(operatorsStrategy.power(this.getValue(), other.getValue()));
        }
        try{
            return scope.getFunction("_power_|1").call(this, Arrays.asList(other));
        }
        catch (NullPointerException e){
            throw new OperatorException();
        }
        catch (EvaluatingException e){
            throw new OperatorException(e);
        }
    }

    @Override
    public LangValue greater(LangValue other) throws OperatorException {
        if(operatorsStrategy != null){
            return new LangValue(operatorsStrategy.greater(this.getValue(), other.getValue()));
        }
        try{
            return scope.getFunction("_greater_|1").call(this, Arrays.asList(other));
        }
        catch (NullPointerException e){
            throw new OperatorException();
        }
        catch (EvaluatingException e){
            throw new OperatorException(e);
        }
    }

    @Override
    public LangValue equal(LangValue other) throws OperatorException {
        if(operatorsStrategy != null){
            return new LangValue(operatorsStrategy.equal(this.getValue(), other.getValue()));
        }
        try{
            return scope.getFunction("_equal_|1").call(this, Arrays.asList(other));
        }
        catch (NullPointerException e){
            throw new OperatorException();
        }
        catch (EvaluatingException e){
            throw new OperatorException(e);
        }
    }

    @Override
    public LangValue lookup(LangValue other) throws OperatorException {
        if(operatorsStrategy != null){
            return (LangValue)operatorsStrategy.lookup(this.getValue(), other.getValue());
        }
        try{
            return scope.getFunction("_lookup_|1").call(this, Arrays.asList(other));
        }
        catch (NullPointerException e){
            throw new OperatorException();
        }
        catch (EvaluatingException e){
            throw new OperatorException(e);
        }
    }
}
