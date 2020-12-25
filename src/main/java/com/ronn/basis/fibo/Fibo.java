package com.ronn.basis.fibo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Fibo {

    private int getRecursiveFibo(int n){
        return n == 0
        ? 0
        : n == 1
                ? 1
                : getRecursiveFibo(n-1 ) + getRecursiveFibo(n - 2);
    }

    private int getDynamicFibo(int n){
        int cont1 = 1;
        int cont2 = 1;

        for (int i = 2; i < n; i ++){
            int aux = cont2;
            cont2 = cont1 + cont2;
            cont1 = aux;
        }

        return cont2;
    }

    @Test
    public void probar2(){
        long startTime2 = System.nanoTime();
        int dynamicFibo = getDynamicFibo(1000);
        long endTime2 = System.nanoTime();
        System.out.println("Dynamic Duration: " + (endTime2 - startTime2));

        assertEquals(102334155, dynamicFibo );
    }

    @Test
    public void probar(){
        long startTime2 = System.nanoTime();
        int recursiveFibo = getRecursiveFibo(45);
        long endTime2 = System.nanoTime();
        System.out.println("Recursive Duration: " + (endTime2 - startTime2));

        assertEquals(102334155, recursiveFibo );
    }
}