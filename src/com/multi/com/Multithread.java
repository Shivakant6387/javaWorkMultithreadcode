package com.multi.com;
class MyThread extends Thread{
    public MyThread(String name){
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }
}
public class Multithread {
    public static void main(String[] args) {
    MyThread myThread=new MyThread("My thread 1");
        System.out.println(myThread.getId());
        System.out.println(myThread.getName());
        System.out.println(myThread.getThreadGroup());
        System.out.println(myThread.getPriority());
        System.out.println(myThread.getContextClassLoader());
        System.out.println(myThread.getState());
        System.out.println(myThread.isAlive());
        myThread.start();
    }
}
