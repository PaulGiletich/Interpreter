package com.pgiletich.lang.exceptions;

public class EvaluatingException extends Exception {
    private int line;

    public EvaluatingException(int line){
        this("", line);
    }

    public EvaluatingException(String message, int line) {
        super(message);
        this.line = line;
    }

    public EvaluatingException(EvaluatingException other) {
        super(other.getMessage());
        this.line = other.line;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    @Override
    public  String getMessage() {
        return line + ":" + super.getMessage();
    }
}
