package com.ronn.basis.staticthings;

public class Widget {

    static {
        System.out.println("Executing static block...");
    }

    private int id;
    private static int numberOfWidgets = 0;

    public Widget() {
        id = ++numberOfWidgets;
    }

    public int getId() {
        return id;
    }

    public static int getAvailableWidgets() {
        return numberOfWidgets;
    }
}
