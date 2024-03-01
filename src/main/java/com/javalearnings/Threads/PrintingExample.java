package com.javalearnings.Threads;

public class PrintingExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MessagePrinter("Hello", 6));
        Thread thread2 = new Thread(new MessagePrinter("World", 5));

        thread1.start();
        thread2.start();
    }
}

class MessagePrinter implements Runnable {
    private String message;
    private int count;

    public MessagePrinter(String message, int count) {
        this.message = message;
        this.count = count;
    }

    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
