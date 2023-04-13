package com.multi.com;
class RunnableDemo implements Runnable{
    private Thread thread;
    private String threadName;
    RunnableDemo(String name){
        threadName=name;
        System.out.println("Creating"+threadName);
    }
    @Override
    public void run() {
        System.out.println("Running"+threadName);
        try {
            for (int i=4;i>0;i--){
                System.out.println("Thread:"+threadName+" ,"+i);
                Thread.sleep(50);
            }
        }catch (InterruptedException e){
            System.out.println( "Thread"+threadName+"interrupted.");
        }
        System.out.println("Thread"+threadName+"Exiting.");
    }
    public void start(){
        System.out.println("Starting "+threadName);
        if (thread==null){
            thread=new Thread(this,threadName);
            thread.start();
        }
    }
}
public class TesThread {
    public static void main(String[] args) {
        RunnableDemo runnableDemo=new RunnableDemo("Thread-1");
        runnableDemo.start();
        RunnableDemo runnableDemo1=new RunnableDemo("Thread-2");
        runnableDemo1.start();
    }
}
