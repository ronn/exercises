package com.ronn.sorting.bubble;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class Bubble {

    private int[] orderArraySimple(int[] nums){
        int length = nums.length;
        int desordenados;

        do {
            desordenados = length - 1;

            for (int i = 0; i < length - 1; i++){
                if (desordenados == 0) break;

                if (nums[i] > nums[i + 1]){
                    int aux = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = aux;
                } else {
                    desordenados --;
                }
            }
        } while (desordenados > 0);

        return nums;
    }

    private int[] betterOrderArraySimple(int[] nums){
        int length = nums.length - 1;

        for (int i = 0; i < length; i ++){
            for (int j = 0; j < length - i; j ++){
                if (nums[j] < nums[j + 1]){
                    int aux = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = aux;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
        return nums;
    }

    @Test
    public void probar(){
        int[] numeros = {1, 8, 7, 6, 5, 4, 3, 2, 9, 10};

        long startTime2 = System.nanoTime();
        int[] orderedInts2 = betterOrderArraySimple(numeros);
        long endTime2 = System.nanoTime();
        System.out.println("Better Duration: " + (endTime2 - startTime2));

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, orderedInts2);
    }

    @Test
    public void probar2(){
        int[] numeros = {1, 8, 7, 6, 5, 4, 3, 2, 9, 10};

        System.out.println("Hola");


        long startTime = System.nanoTime();
        int[] orderedInts = orderArraySimple(numeros);
        long endTime = System.nanoTime();
        System.out.println("Bubble Duration: " + (endTime - startTime));

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, orderedInts);
    }
}