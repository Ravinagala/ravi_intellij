package ravi_intellij;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTotalAverage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            al.add(num);
        }

        int total = 0;
        int count = 0;
        for(int num : al){
            total += num;
        }

        double average = (double) total/n;
        System.out.println("The Total of numbers:"+total);
        System.out.println("Average of numbers:"+average);

        System.out.println("Enter another element");
        int element = sc.nextInt();
        al.add(element);
        System.out.println("Updated Total:"+(total+element));
        System.out.println("Average of numbers:"+(double)(total+element)/(n+1));
        System.out.println(al);
    }
}
