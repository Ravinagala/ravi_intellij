package ravi_intellij;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a email address :");
        String input = sc.nextLine();
        String regex = "^[a-z_.-]+[\\d]*@[\\w]+[.][a-z]+$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if(matcher.matches()){
            System.out.println("It is a valid email address");
        }
        else
            System.out.println(("Not a valid email address"));


//        while(matcher.find()){
//            String captured = matcher.group(0);
//            String replaced = matcher.replaceAll("nagalaravi@gmail.com");
//            //System.out.println("Captured String :"+captured);
//            System.out.println("Replaced String:"+replaced);
//        }

    }
}
