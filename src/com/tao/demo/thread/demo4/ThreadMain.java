package com.tao.demo.thread.demo4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 线程执行类
 *
 * @author taojt
 * @create 2016-05-28
 */
public class ThreadMain {

    // ThreadB 实现方法
    public static void main(String[] args) {
        ThreadB threadB = new ThreadB();
        new Thread(threadB).start();//注意这里的启动方式跟前面的不一样
        System.out.println("This is main thread .");
    }

}
