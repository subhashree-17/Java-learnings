package com.javalearnings.problems;

public class MultiThreading {
    public static void main(String[] args) {
        Thread thread1 = new MyThread("Thread 1");
        Thread thread2 = new MyThread("Thread 2");

        thread1.start();
        thread2.start();
    }
}

class MyThread extends Thread {
    private final String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
