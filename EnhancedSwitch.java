package ravi_intellij;

import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find which day:");
        int day = sc.nextInt();
        String dayname = switch(day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";

        };
        System.out.println("The day is:"+dayname);
    }
}
