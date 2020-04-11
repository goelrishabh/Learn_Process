package com.goelrishabh.www.runnable;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("*************************Main Block starts!********************************");

        //region SingleTask | MultiThreading

        Thread thread = new Thread(new Runnable0());
        thread.setPriority(1);
        thread.start();


        thread = new Thread(new Runnable0());
        thread.setPriority(2);
        thread.start();

        //endregion

        //region MultiTask | MultiThreading

        thread = new Thread(new Runnable1());
        thread.setPriority(3);
        thread.start();

        thread = new Thread(new Runnable2());
        thread.setPriority(4);
        thread.start();

        //endregion

        //region Anonymous

        thread = new Thread(() -> {
            System.out.println("run block starts::" + currentThread().getName());
            try {
                sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("run block ends::" + currentThread().getName());
        });
        thread.setPriority(5);
        thread.start();

        //endregion


        System.out.println("**************************Main Block ends!*********************************");
    }
}