package com.multi.com;
class MyThreads extends Thread{
    public MyThreads(String name){
    super(name);
    }
    public void  run(){
        int count=1;
        while(true){
            System.out.println(count++);
            try{
            Thread.sleep(5000);
            break;
            }
           catch (InterruptedException e){
               System.out.println(e);

           }
        }
    }
}
public class Test1 {
public static void main(String[]args)throws Exception{
    MyThreads t=new MyThreads("my thread 1");
    t.start();
    t.interrupt();
}
}
