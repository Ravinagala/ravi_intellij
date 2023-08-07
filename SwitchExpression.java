package ravi_intellij;

import java.util.Scanner;

public class SwitchExpression {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print no of days in a month:");
        int month = sc.nextInt();

        int days = switch (month){
            case 1, 3, 5, 7, 8,10,12 -> 31;
            case 4,6,9,11 -> 30;
            case 2 ->{
                System.out.print("Enter Year: ");
                int year = sc.nextInt();
                if(year%4==0 && year%100!=0 || year%400==0)
                    yield 29;
                else yield  28;
            }
            default -> 0;

        };
        System.out.println("No of days in month :"+days);
    }
}
