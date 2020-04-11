package com.goelrishabh.www;

public class Main {

//    static {
//        System.out.println("\nstatic block starts!\n");
//        System.out.println("\nstatic block ends!\n");
//    }

    public static void main(String[] args) {
        // write your code here
        System.out.println("*************************Main Block starts!********************************");

        //region SingleTask | MultiThreading

        Thread0 thread0 = new Thread0("t0");
        thread0.setPriority(1);
        /**
         *
         * < Calling Thread.run() DOESN'T creates any Thread and invokes this method on the Main Thread itself! >
         *
         * */
        thread0.run();

        Thread0 thread01 = new Thread0("t01");
        thread0.setPriority(2);
        thread01.start();

        /**
         *
         * Calling this again will cause java.lang.IllegalThreadStateException
         * < But this will not effect the Process/sub-Process(threads) execution >
         *     cz Each Thread/sub-process has it's own STACK Frame to execute
         *     but have COMMON Heap & Method etc... Area assigned by JVM on start of [Process]
         *
         * */
//        thread01.start();

        //endregion


        //region MultiTask | MultiThreading

        Thread1 thread1 = new Thread1("t1");
        thread1.setPriority(3);
        thread1.start();

        Thread2 thread2 = new Thread2("t2");
        thread2.setPriority(4);
        thread2.start();

        //endregion

        System.out.println("**************************Main Block ends!*********************************");
    }
}

/**
 * Thread Priority DOESN'T mean the execution priority by SCHEDULER
 * < It basically sets the "execution cycle time" assigned by the SCHEDULER >
 * - Higher priority means more cycle time is devoted to the thread and vice-versa
 */