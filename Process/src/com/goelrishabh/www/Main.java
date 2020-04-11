package com.goelrishabh.www;

public class Main {

//    static {
//        System.out.println("\nstatic block starts!\n");
//        System.out.println("\nstatic block ends!\n");
//    }

    public static void main(String[] args) {
        // write your code here
        System.out.println("*************************Main Block starts!********************************");

        Thread1 thread1 = new Thread1("t1");
        thread1.setPriority(5);
        thread1.start();
//
        Thread2 thread2 = new Thread2("t2");
        thread2.setPriority(10);
        thread2.start();

        System.out.println("**************************Main Block ends!*********************************");
    }
}

/**
 * Thread Priority DOESN'T mean the execution priority by SCHEDULER
 * < It basically sets the "execution cycle time" assigned by the SCHEDULER >
 * - Higher priority means more cycle time is devoted to the thread and vice-versa
 */