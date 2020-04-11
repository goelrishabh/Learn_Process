package com.goelrishabh.www.threadclass;

public class Thread0 extends Thread {

//    static {
//        System.out.println("static block starts!::t1");
//        System.out.println(currentThread());
//        System.out.println("static block ends!::t1");
//    }

    public Thread0(final String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("run block starts::" + currentThread().getName());
        try {
            sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        while (true) {
//            break;
//        }
        System.out.println("run block ends::" + currentThread().getName());
    }

}
