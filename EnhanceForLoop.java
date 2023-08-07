package ravi_intellij;

import java.util.Scanner;

public class EnhanceForLoop {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the how many elements you want:" );
        int a  = sc.nextInt();
        int[] n = new int[a];
        for(int i = 0; i < n.length;i++){
            n[i] = sc.nextInt();
        }
        int total = 0;
        for(int number : n){
            total += number;

        }
        System.out.println("The total of  elements is:"+total);
    }
}
