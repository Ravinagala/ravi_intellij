package ravi_intellij;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        if(number <= 1){
            System.out.println("Not a prime number");
        }else{
              boolean isPrime = true;
            for(int i = 2; i < Math.sqrt(number); i++){
                if(number%i==0){
                    break;
                }


            }if(isPrime){
                System.out.println("It is not a prime number:"+number);
            }else{
                System.out.println("It is a prime number:"+number);
            }


        }

    }
}
