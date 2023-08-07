package ravi_intellij;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a email address :");
        String input = sc.nextLine();
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if(matcher.matches()){
            System.out.println("It is a valid email address");
        }
        else
            System.out.println(("Not a valid email address"));

    }
}