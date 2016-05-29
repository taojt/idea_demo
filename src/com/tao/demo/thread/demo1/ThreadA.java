package com.tao.demo.thread.demo1;

/**
 * 第一种创建线程的方式：直接通过extends Thread 覆盖run() 方法即可。
 *
 * @author BookClass
 * @create 2016-05-28
 */
public class ThreadA extends Thread {
    public void run() {
        super.run();
        try {
            // some exec sentence
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("This is Thread A!");
    }

}
