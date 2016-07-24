package com.nwjon.jdsabook.generics;

/**
 * Created by jondann on 7/19/16.
 */
public class Pair<A,B> {

    A first;
    B second;

    public Pair(A a, B b){
        first = a;
        second = b;
    }

    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }
}
