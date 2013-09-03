package com.pgiletich.helpers;

import java.util.Iterator;
import java.util.List;

public class ParallelIterable<T1, T2> implements Iterable<Pair<T1,T2>> {
    private final Iterable<T1> first;
    private final Iterable<T2> second;

    public ParallelIterable(Iterable<T1> first, Iterable<T2> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public Iterator<Pair<T1, T2>> iterator(){
        return new ParallelIterator<T1,T2>( first.iterator(), second.iterator() );
    }
}