package com.pgiletich.lang.nodes;

import com.pgiletich.lang.values.LangValue;
import com.pgiletich.lang.exceptions.EvaluatingException;

public abstract class LangNode {
    private int line;

    public abstract LangValue evaluate() throws EvaluatingException;
    public String toString(){
        return super.toString();
    }

    public void setLine(int line){
        this.line = line;
    }

    public int getLine(){
        return this.line;
    }
}