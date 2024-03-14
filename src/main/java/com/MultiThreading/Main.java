package com.MultiThreading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main is Starting");//Main thread is also a User Thread
        Thread thread1=new Thread1("thread1");//program will only run if there is only At least one User Thread
//        thread1.setDaemon(true);//Making a thread a Daemon Thread,Daemon thread has no existence without User Thread
        thread1.start();

        //Implementing Runnable
        Thread thread2=new Thread(new Thread2());
        thread2.start();

        //Using LAMDAS
        Thread thread3=new Thread(()->{
            for(int i=0;i<5;i++)
            {
                System.out.println("inside "+Thread.currentThread()+" "+i);
            }
        },"thread3");
        thread3.start();

        System.out.println("Main is Exiting");
    }
}