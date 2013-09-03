package com.pgiletich.lang.exceptions;

/**
 * Created with IntelliJ IDEA.
 * User: sfcpr_000
 * Date: 5/1/13
 * Time: 9:58 AM
 */
public class VarNotFoundException extends EvaluatingException {
    private String name;
    public VarNotFoundException(String name, int line) {
        super(line);
        this.name = name;
    }

}
