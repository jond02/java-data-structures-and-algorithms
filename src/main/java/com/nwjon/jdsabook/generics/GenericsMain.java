package com.nwjon.jdsabook.generics;

import java.util.Arrays;

/**
 * Created by jondann on 7/19/16.
 */
public class GenericsMain {

    public static void main(String[] args) {

        //Pair<String, Double> bid = new Pair<>("ORCL", 32.07);
        //System.out.println(bid.getFirst());


        Pair<String, Double>[] holdings;

        holdings = new Pair[25];

        holdings[0] = new Pair<>("Orcl", 32.07);

        String[] data = new String[] {"one", "two", "three"};

        System.out.println(Arrays.toString(data));

        reverse(data);

    }

    public static <T> void reverse(T[] data){

        int low = 0;
        int high = data.length - 1;

        while(low < high){
            T temp = data[low];
            data[low++] = data[high];
            data[high--] = temp;
        }

        System.out.println(Arrays.toString(data));

    }
}
