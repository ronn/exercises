package com.ronn.basis;

public class VarArgs {

    public static void main(String[] args) {
        System.out.println("Average: " + calcAverage(2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("Average 2: " + Integer.MAX_VALUE);
    }

    public static int calcAverage(int... a){
        int average = 0;

        for (int x : a){
            average += x;
        }

        try {
            return average / a.length;
        } catch (ArithmeticException e){
            return 0;
        }
    }

    public static void appendStrings(String... s){
        StringBuffer stbr = new StringBuffer();

        for (String x : s){
            stbr.append(x);
            stbr.append(" ");
        }

        System.out.println(stbr);
    }
}
