package ravi_intellij;

import java.util.Scanner;

public class Switch {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int day = sc.nextInt();
        String dayname;
        switch(day){
            case 1 :
                dayname = "Monday";
                break;

            case 2:
                dayname = "Tuesday";
                break;

            default:
                dayname = "Noday";
        }

        System.out.println("Day:"+dayname);


    }

}
