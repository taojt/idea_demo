package com.shiyanlou.CollectionFramework;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 利用Java中Map 集合创建简单电话簿
 *
 * @author taojt
 * @create 2016-05-29
 */
public class PhoneBookByMap {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<String, String>();

        Scanner scan = new Scanner(System.in);
        String keyword = new String();
        phoneBook = initPhoneBook(phoneBook);

        System.out.println("Please input the name that you want to search: ");

        keyword = scan.nextLine();
        scan.close();
        if (keyword.isEmpty()) {
            System.out.println("Please input a name !");
        } else {
            System.out.println("The result is : ");
            System.out.println(queryPhone(phoneBook, keyword));
        }
    }

    public static HashMap<String, String> initPhoneBook(HashMap<String, String> phoneBook) {
        phoneBook.put("Tom", "18812341213");
        phoneBook.put("Allen", "15356341213");
        phoneBook.put("James", "16743251954");
        phoneBook.put("Tony", "10086");
        return phoneBook;
    }

    public static String queryPhone(HashMap<String, String> phoneBook, String keyword){
        String result = new String();
        result = phoneBook.get(keyword);
        if (result == null){
            return "Can't find this user !";
        }else{
            return result;
        }
    }
}

