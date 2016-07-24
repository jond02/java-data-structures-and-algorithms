package com.nwjon.jdsabook.generics;

/**
 * Created by jondann on 7/23/16.
 */
public class C extends B {

    private int x = 3;

    private int y = super.getX();


    public int getX3() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }
}
