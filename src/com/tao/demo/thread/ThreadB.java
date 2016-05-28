package com.tao.demo.thread;

/**
 * 第二种实现多线程的方式：通过继承Runnable接口，实现run() 方法
 *优点，JAVA里面只有单继承，但是可以实现多个接口，解决extends 的缺点
 *
 * @author taojt
 * @create 2016-05-28
 */
public class ThreadB implements Runnable{
    public void run(){
        try{
            //exec some sentences
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("This is Thread B!");
    }
}
