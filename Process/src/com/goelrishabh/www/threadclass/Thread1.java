package com.goelrishabh.www.threadclass;

public class Thread1 extends Thread0 {

//    static {
//        System.out.println("static block starts!::t1");
//        System.out.println(currentThread());
//        System.out.println("static block ends!::t1");
//    }

    public Thread1(final String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("run block starts::t1");
        try {
            sleep(401);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        while (true) {
//            break;
//        }
        System.out.println("run block ends::t1");
    }

}
