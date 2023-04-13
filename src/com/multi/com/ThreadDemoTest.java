package com.multi.com;
class ThreadDemo extends Thread{
    private Thread thread;
    private String threadName;
    ThreadDemo(String name){
        threadName=name;
        System.out.println("Creating "+threadName);
    }
    public void run(){
        System.out.println("Running "+threadName);
        try{
            for (int i=5;i>0;i--){
                System.out.println("Thread:"+threadName+","+i);
                thread.sleep(50);
            }
        }catch (InterruptedException exception){
            System.out.println("Thread"+threadName+"interrupted.");
        }
        System.out.println("Thread"+threadName+"exiting.");
    }
    public void start(){
        System.out.println("Starting"+threadName);
        if (thread==null){
            thread=new Thread(this,threadName);
            thread.start();
        }
    }
}
public class ThreadDemoTest {
    public static void main(String[] args) {
        ThreadDemo threadDemo=new ThreadDemo("Thread-1");
        threadDemo.start();
        ThreadDemo threadDemo1=new ThreadDemo("Thread-2");
        threadDemo1.start();
    }
}
