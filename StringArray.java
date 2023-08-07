package ravi_intellij;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of names you want to enter:");
        int num = sc.nextInt();
        String[] names = new String[num];
        for(int i = 0; i<names.length;i++){
            names[i] = sc.next();
        }

        for(int i = names.length - 1; i >= 0; i--){
            System.out.println(names[i]);
        }
    }
}
