package com.goelrishabh.www;

public class Main {

    static {
        System.out.println("\nstatic block starts!\n");
        System.out.println(Thread.currentThread().getThreadGroup());
        System.out.println("\nstatic block ends!\n");
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println("\nMain Block starts!\n");
        System.out.println(Thread.currentThread().getThreadGroup());
        System.out.println("\nMain Block ends!\n");
    }
}
