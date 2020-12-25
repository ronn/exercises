package com.ronn.basis.staticthings;

public class Statics {
     public static void main(String[] args){
         Widget w1 = new Widget();
         Widget w2 = new Widget();
         System.out.printf("How many widgets are available? %s", Widget.getAvailableWidgets());
     }
}