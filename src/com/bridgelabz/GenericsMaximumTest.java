package com.bridgelabz;

public class GenericsMaximumTest {
    public static <Integer extends Comparable<Integer>> Integer maximum(Integer x, Integer y, Integer z) {
        Integer max = x; //Assuming x is initially the largest

        if (y.compareTo(max) > 0)
            max = y; // y is the largest so far

        if (z.compareTo(max) > 0)
            max = z; // z is the largest

        return  max;

    }

    public static void main(String[] args) {
        System.out.println(" `Welcome to Generics` ");
        //call out function
        int maximumIntNumber = maximum(6,7,5);
        System.out.println(maximumIntNumber);
    }


}
