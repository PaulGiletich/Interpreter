package com.pgiletich.helpers;

public class Pair<T1, T2>{
    private final T1 v1;
    private final T2 v2;

    public Pair(T1 v1, T2 v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public T1 left(){
        return v1;
    }

    public T2 right(){
        return v2;
    }
}
