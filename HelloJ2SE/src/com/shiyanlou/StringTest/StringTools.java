package com.shiyanlou.StringTest;

import java.util.Scanner;

/**
 * @author taojt
 * @create 2016-05-29
 */
public class StringTools {
    public static void main(String[] args){
        String a = new String();
        String b = new String();
        String c = new String();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a sentence :");

        a = scan.nextLine();
        scan.close();

        b = a.trim();
        if (b.equals("Hello,Java!")){
            c = b.substring(3,7);
        }else {
            c = "";
        }
        System.out.println("a: " + a);
        System.out.println("The length of a is: " + a);
        System.out.println("b: " + b);
        System.out.println("The length of b is: " + b);
        System.out.println("c: " + c);
        System.out.println("The length of c is: " + c);

    }
}
