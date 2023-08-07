package ravi_intellij;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers to be stored in a array:");
        int a[] = new int[5];
        for(int i = 0; i <a.length;i++){
            a[i] = sc.nextInt();
        }


        for(int i = 0; i<a.length;i++) {
            System.out.println(a[i]);

        }

        int z=   Arrays.binarySearch(a, 80);
        System.out.println("The index value of Binary Search output is:"+z);

        int b[] = Arrays.copyOf(a,4);
        for(int i = 0; i < b.length;i++){
            System.out.println(b[i]);
        }

        String str = "RAVI";
        char []c   = str.toCharArray();
        Arrays.sort(c);
        System.out.println(c);

        String[] fruits = {"apple", "banana", "orange", "grape", "kiwi"};

        // Sort the array of strings
        Arrays.sort(fruits);

        // Print the sorted array
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}
