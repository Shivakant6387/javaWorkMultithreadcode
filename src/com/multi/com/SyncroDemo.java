package com.multi.com;
class MyData{
    synchronized public void display(String str){
        //synchronized (this){
            for (int i=0;i<str.length();i++){
                System.out.print(str.charAt(i));
                try{Thread.sleep(100);}catch (Exception e){
                    System.out.println(e);
                }
            }
        }
    }
//}
class MyThread3  extends Thread{
    MyData d;
    public  MyThread3(MyData d){
        this.d=d;
    }
    public void run(){
        d.display("Hello World");
    }
}
    class MyThread4 extends Thread{
        MyData d;
public  MyThread4(MyData d){
        this.d=d;
        }
public void run(){
        d.display("Welcome All");
        }
        }
public class SyncroDemo {
    public static void main(String[]args){
    MyData data=new MyData();
    MyThread3 t1=new MyThread3(data);
    MyThread4 t2=new MyThread4(data);
    t1.start();
    t2.start();
    }
}
