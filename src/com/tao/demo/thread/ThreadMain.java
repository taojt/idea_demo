package com.tao.demo.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 线程执行类
 *
 * @author taojt
 * @create 2016-05-28
 */
public class ThreadMain {
//    ThreadA 实现方法
//    public static void main(String[] args) {
//        ThreadA threadA = new ThreadA();
//        threadA.start();
//        System.out.println("This is main thread: ");
//    }

//    ThreadB 实现方法
//    public static void main(String[] args) {
//        ThreadB threadB = new ThreadB();
//        new Thread(threadB).start();//注意这里的启动方式跟前面的不一样
//        System.out.println("This is main thread .");
//    }

    //    ThreadC 实现方法
    public static void main(String[] args) {
        ThreadC threadC = new ThreadC();
        // 后面会介绍  FutureTask
        FutureTask<String> feature = new FutureTask<String>(threadC);
        new Thread(feature).start();
        System.out.println("This is main thread begin.");
        try {
            System.out.println("the result is " + feature.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("This is main thread end.");
    }


}
