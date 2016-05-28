package com.tao.demo.thread.demo4;

/**
 * 第二种实现多线程的方式：通过继承Runnable接口，实现run() 方法
 * 优点，JAVA里面只有单继承，但是可以实现多个接口，解决extends 的缺点
 *
 * @author taojt
 * @create 2016-05-28
 */

// 新建5个线程，模拟多线程
public class ThreadB implements Runnable {
    public void run() {
        try {
            //exec some sentences
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread curThread = Thread.currentThread(); //返回当前正在执行的对象的引用
        String curThreadName = curThread.getName(); //get thread name
        System.out.println("This is the name of thread： " + curThread.getName());
        System.out.println("Return the curret thread name : " + curThreadName + "'s number of thread groups : " + Thread.activeCount());
        System.out.println("Return the curret thread name : " + curThreadName + "'s name : " + curThread.getId());
        System.out.println("Return the curret thread name : " + curThreadName + "'s priority : " + curThread.getPriority());
        System.out.println("");

    }
}

