package com.ronn.concurrency;

public class Indeterminism extends Thread {

    private static int cont = 0;

    public void run() {
        for (int i = 0; i < 1000; i++) {
            cont++;
        }
    }

    public static void main(String[] args) {
        Indeterminism[] vec = new Indeterminism[1000];

        for (int i = 0; i < vec.length; i++) {
            vec[i] = new Indeterminism();
            vec[i].start();
        }

        System.out.println(cont);
    }
}

// Indeterminismo
// Exclusión mutua
// Sección crítica: Bloque del código donde se va a producir indeterminismo
