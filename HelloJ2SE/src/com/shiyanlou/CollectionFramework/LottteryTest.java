package com.shiyanlou.CollectionFramework;

import java.util.Scanner;

/**
 * lottery 测试类
 *
 * @author taojt
 * @create 2016-05-29
 */
public class LottteryTest {
    public static void main(String[] args){
        GenerateLottery l = new GenerateLottery();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the number of lottery group(s): ");
        String groupNum = scan.nextLine();
        l.generateLottery(groupNum);
    }
}
