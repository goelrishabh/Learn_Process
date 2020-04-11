package com.goelrishabh.www.threadclass;

public class Thread2 extends Thread0 {

//    static {
//        System.out.println("static block starts!::t2");
//        System.out.println(currentThread());
//        System.out.println("static block ends!::t2");
//    }

    public Thread2(final String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("run block starts::t2");
        try {
            sleep(402);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        while (true) {
//            break;
//        }
        System.out.println("run block ends::t2");
    }

}
