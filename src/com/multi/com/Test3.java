package com.multi.com;
class MyThread2 extends Thread{
    public void run(){
        int count=1;
        while(true){
            System.out.println(count++ +"My thread");
        }
    }
}
public class Test3 {
    public static void main(String[]args)throws Exception{
    MyThread2 t=new MyThread2();
    t.setDaemon(true);
    t.start();

//    Thread mainThread=Thread.currentThread();
//    mainThread.join();
        int count=1;
        while(true){
            System.out.println(count++ +"Main");
            Thread.yield();
        }
    }
}
