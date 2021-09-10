package org.example;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your text : ");
        String input = scan.nextLine();
        String[] items = input.split(" ");

        for(String item : items) {
           // System.out.println(item);
            for (int i = 0; i <item.length() ; i++) {
               // char[] chars = new char[item.length()];
                char[] chars = item.toCharArray();
                if (Character.isDigit(chars[i]))
                    System.out.println(chars[i]);
            }
        }
      //  for (int i = 0; i <items.length ; i++) {
//            System.out.println(items[2]);

        //}
    }
}