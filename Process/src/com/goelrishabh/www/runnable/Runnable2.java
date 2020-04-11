package com.goelrishabh.www.runnable;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class Runnable2 implements Runnable {

    @Override
    public void run() {
        System.out.println("run block starts::" + currentThread().getName());
        try {
            sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("run block ends::" + currentThread().getName());
    }

}
