package ravi_intellij;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        String country;
        switch(n){
            case 1:
                country = "India";
                break;

            case 2:
                country = "Australia";
                break;

            case 3:
                country = "America";
                break;

            default:
                country = "Japan";
        }
        System.out.println("The country is :"+country);
    }
}
