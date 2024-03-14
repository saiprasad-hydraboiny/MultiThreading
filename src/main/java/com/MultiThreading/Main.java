package com.MultiThreading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main is Starting");//Main thread is also a User Thread
        Thread thread1=new Thread1("thread1");//program will only run if there is only At least one User Thread
//        thread1.setDaemon(true);//Making a thread a Daemon Thread,Daemon thread has no existence without User Thread
        thread1.start();
        System.out.println("Main is Exiting");
    }
}