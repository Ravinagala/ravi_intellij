package ravi_intellij;

import java.util.Scanner;

public class AvgofNumbersUsingBreak {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements[zero to stop]:");

        int total = 0, count = 0;
        while (true){
            int n = sc.nextInt();
            if(n==0){
                break;
            }
            total += n;
            count++;

        }
        double average = (double) total / count;
        System.out.println("Total:"+total);
        System.out.println("Count:"+count);
        System.out.println(average);
    }
}
