package com.ronn.concurrency;

//Threads gets launched from objects that extends from Thread
///method start = launch, method run = execute
// Maybe is not executed when is launched, depends on availability
public class StartingThreads extends Thread {

    private final int id;

    public StartingThreads(int id) {
        this.id = id;
    }

    public void run() {//Threads execute only what is in this method
        System.out.println("Soy el hilo: " + this.id);
    }

    public static void main(String[] args) {
        StartingThreads st1 = new StartingThreads(1);
        StartingThreads st2 = new StartingThreads(2);
        StartingThreads st3 = new StartingThreads(3);

        st1.start();//new thread is created and executes what is in run() method
        st2.start();
        st3.start();
        System.out.println("Soy el hilo ppal");
    }
}
