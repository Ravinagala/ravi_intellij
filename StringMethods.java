package ravi_intellij;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.next();
        System.out.println(s.length());
        String reverse = "";
        for(int i = s.length()-1;i>=0;i--){
//            System.out.print(s.charAt(i));
            reverse += s.charAt(i);
        }
        System.out.println(reverse);
        String st = s.substring(0,4);
        System.out.println(st.toUpperCase());

        String str = s.trim();
        System.out.println(str);
    }
}
