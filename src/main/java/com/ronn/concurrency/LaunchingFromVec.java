package com.ronn.concurrency;

public class LaunchingFromVec extends Thread {

    private final int  id;

    public LaunchingFromVec(int id) {
        this.id = id;
    }

    public void run (){
        System.out.println("Im the thread: " + id);
    }

    public static void main(String[] args) {
        LaunchingFromVec[] vec = new LaunchingFromVec[5];

        for (int i = 0; i < vec.length; i++){
            vec[i] = new LaunchingFromVec(i +1);
            vec[i].start();
        }

        try {
            vec[4].join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main thread ;) ");
    }
}
