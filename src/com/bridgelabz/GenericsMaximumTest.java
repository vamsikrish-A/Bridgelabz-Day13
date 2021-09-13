package com.bridgelabz;

public class GenericsMaximumTest {
    /*
    * @Author: VamsiKrishna A.
    *
    * @purpose: Find maximum Problem using Generics
    *
    * @date: 07/09/2021.
    * */
    public static <Integer extends Comparable<Integer>> Integer maximum(Integer x, Integer y, Integer z) {
        Integer max = x; //Assuming x is initially the largest

        if (y.compareTo(max) > 0)
            max = y; // y is the largest so far

        if (z.compareTo(max) > 0)
            max = z; // z is the largest

        return  max;

    }
    public static <Float extends Comparable<Float>> Float maximumFloat(Float x, Float y, Float z) {
        Float max = x; //Assuming x is initially the largest

        if (y.compareTo(max) > 0)
            max = y; // y is the largest so far

        if (z.compareTo(max) > 0)
            max = z; // z is the largest

        return  max;

    }
    public static <String extends Comparable<String>> String maximumString(String x, String y, String z) {
        String max = x; //Assuming x is initially the largest

        if (y.compareTo(max) > 0)
            max = y; // y is the largest so far

        if (z.compareTo(max) > 0)
            max = z; // z is the largest

        return  max;

    }
    //Generic method to find the maximum of three number
    public static <T extends Comparable<T>> T maximumWithGenerics(T x, T y, T z) {
        T max = x; //Assuming x is the initially largest

        if (y.compareTo(max) > 0)
            max = y; //y is the largest so far
        if (z.compareTo(max) > 0)
            max = z; //z is the largest
        return max;
    }

    public static void main(String[] args) {
        System.out.println(" `Welcome to Generics` ");
        //calling out  Integer method.
        int maximumIntNumber = maximum(6,7,5);
        System.out.println("maximum integer number:"+maximumIntNumber);
        //calling out Float method.
        double maximumFloatNumber = maximumFloat(6.6, 7.7, 5.5);
        System.out.println("maximum float number:"+maximumFloatNumber);
        //calling out String method.
        String maximumStringVariable = maximumString("Apple","Cherry","Peach");
        System.out.println("maximum String variable: "+maximumStringVariable);
        //Generic Method
        System.out.println("======/Finding the Maximum number with Generic Method./====");
        int maxGenericInt = maximumWithGenerics(6,7,8);
        double maxGenericDouble = maximumWithGenerics(6.6,7.7,5.5);
        String maxGenericString = maximumWithGenerics("Apple","Banana","Peach");
        System.out.println("maximum Integer number with Generic method is: "+maxGenericInt);
        System.out.println("maximum Float number with Generic method is: "+maxGenericDouble);
        System.out.println("maximum String with Generic method is: "+maxGenericString);

    }
    
}
