package dsa;

import java.util.Scanner;

public class PrimeNumber {

    //check the number divisible by any number till it's square root value
    public static boolean isPrime(int n) {

        if(n==1 || n==2 || n==3)
            return true;

        for(int i=2;i<=Math.sqrt(n);i++) {

            if(n%i==0)
                return false;
        }

        return true;
    }
    public static void main(String[] args) {

        //checking if the given number is prime or not
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number to identify the prime number");
        n=sc.nextInt();

        if(isPrime(n)){
            System.out.println("Prime number");
        }else{
            System.out.println("Not a prime number");
        }

    }
}
