package com.shiyanlou.DynamicClass;

import java.io.File;
import java.lang.reflect.Constructor;

/**
 * 测试动态类生成实例
 *
 * @author taojt
 * @create 2016-05-29
 */
public class Test {
    public static void main(String[] args) {
        try {
            Constructor<File> constructor = File.class.getDeclaredConstructor(String.class);
            System.out.println("Created File Object with reflection.");
            File file = constructor.newInstance("MyFile.txt");
            System.out.println("Use File Object to create MyFile.txt.");
            file.createNewFile();
            System.out.println("File is created ? " + file.exists());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
