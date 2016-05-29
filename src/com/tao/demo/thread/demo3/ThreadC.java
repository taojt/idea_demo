package com.tao.demo.thread.demo3;

import java.util.concurrent.Callable;

/**
 * 第三种实现多线程的方式：通过实现Callable接口，实现call() 方法
 *
 * @author BookClass
 * @create 2016-05-28
 */
public class ThreadC implements Callable<String> {
    public String call() throws  Exception{
        try{
            // exec some sentences
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("This is Thread B!");
        return "Thread B.";
    }

}
