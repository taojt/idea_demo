package com.tao.demo;

/**
 * Created by taojt on 2016/5/27.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World !");
        System.out.println("Hello,Java World!");
        System.out.println("Hello,Java World!");
        System.out.println("HaHaHa!");
        int m = 3;
        int n = 0;

        int a = 0;
        a = add(m, n + 2);
        System.out.println("a is " + a);

    }

    public static int add(int a, int b) {
        return a + b;
    }
}
