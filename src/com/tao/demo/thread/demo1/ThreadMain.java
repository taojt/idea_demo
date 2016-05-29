package com.tao.demo.thread.demo1;

/**
 * 线程执行类
 *
 * @author BookClass
 * @create 2016-05-28
 */
public class ThreadMain {


    // ThreadB 实现方法
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        new Thread(threadA).start();//注意这里的启动方式跟前面的不一样
        System.out.println("This is main thread .");
    }

}
