package ravi_intellij;


import java.util.Scanner;

public class MathFuncs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
//        System.out.println(Math.abs(n));
        int i = sc.nextInt();
        System.out.println(Math.pow(n,i));

        double z = Math.round(Math.random()*25);
        System.out.println(z);

    }
}
