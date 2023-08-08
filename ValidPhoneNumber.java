package ravi_intellij;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPhoneNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        String n = sc.next();
        String regex = "^[\\d]{10}+$";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(n);

        if(matcher.matches()){
            System.out.println("Valid phone number");
        }
        else
            System.out.println("Not a valid phone number");
    }
}
