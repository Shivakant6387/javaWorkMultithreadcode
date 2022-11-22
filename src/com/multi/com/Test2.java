package com.multi.com;
class MyThread1 extends Thread{
    public void run(){
        int count=1;
        while(true){
            System.out.println(count++);
        }
    }
}
public class Test2 {
    public static void main(String[]args) throws Exception{
    MyThread1 myThread1=new MyThread1();
    myThread1.setDaemon(true);
    myThread1.start();
    try
    {
        Thread.sleep(100);}
    catch (Exception e){
        System.out.println(e);
    }
    }
}
