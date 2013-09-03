package com.pgiletich.lang.exceptions;

public class OperatorException extends EvaluatingException {
    private String operator;
    private String leftClass;
    private String rightClass;

    public OperatorException(){
        this(null, null, null, 0);
    }

    public OperatorException(EvaluatingException parent){
        super(parent);
    }

    public OperatorException(String operator, String leftClass, String rightClass, int line) {
        super(line);
        this.operator = operator;
        this.leftClass = leftClass;
        this.rightClass = rightClass;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + String.format("Binary operator %s is not defined for types: %s and %s",
                operator, leftClass, rightClass);
    }


}