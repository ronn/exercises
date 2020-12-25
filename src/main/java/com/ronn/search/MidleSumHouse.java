package com.ronn.search;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MidleSumHouse {

    @Test
    public void probar(){
        long startTime = System.nanoTime();
        int foundHouse = searchHouse(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        long endTime = System.nanoTime();

        System.out.println("Duration: " + (endTime - startTime));

        assertEquals(6, foundHouse);
    }

    private int searchHouse(int[] houses) {
        int length = houses.length;

        if (length < 3) return -1;

        int i = (length ^ 2 + length) / 2;

        double ronnie = Math.sqrt(i);

        return ronnie % 1 == 0
                ? (int) ronnie
                : -1;
    }
}