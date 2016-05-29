package com.shiyanlou.CollectionFramework;

import java.util.*;

/**
 * ArrayList 实例与用法
 *
 * @author taojt
 * @create 2016-05-29
 */
public class ArrayListTraversal {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++){
            list.add(i);
        }
        System.out.println("Items in the list: ");
        System.out.println(list);

        System.out.println("Items in the list with odd index: ");
        for (int i = 1; i < 10; i += 2){
            System.out.print(list.get(i) + "  ");
        }
        System.out.println();

    }

}
