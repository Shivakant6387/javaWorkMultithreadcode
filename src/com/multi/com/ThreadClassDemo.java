package com.multi.com;

public class ThreadClassDemo {
    public static void main(String[] args) {
        Runnable hello=new DisplayMessage("Hello");
        Thread thread=new Thread(hello);
        thread.setDaemon(true);
        thread.setName("hello");
        System.out.println("Starting hello thread...");
        thread.start();
        Runnable bye=new DisplayMessage("GoodBye");
        Thread thread1=new Thread(bye);
        thread1.setPriority(thread.MIN_PRIORITY);
        thread1.setDaemon(true);
        System.out.println("Starting goodBye thread...");
        thread1.start();
        System.out.println("Starting thread3...");
        Thread thread2=new GuessANumber(27);
        thread2.start();
        try{
            thread2.join();
        }catch (Exception e){
            System.out.println("Thread interrupted");
        }
        System.out.println("Starting thread4...");
        Thread thread3=new GuessANumber(75);
        thread3.start();
        System.out.println("main() is ending");
    }
}
