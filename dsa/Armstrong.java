package dsa;


import java.util.Scanner;

//checking the given number is armstrong or not.
//153 is armstrong bcs it is equal to sum of cube of each digit of the number
public class Armstrong {

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to check the palindrome");
        n = sc.nextInt();

        int sum=0;
        int temp=n;
        while(n>0){
            int val=n%10;
            sum+=val*val*val;

            n=n/10;
        }

        System.out.println("total calculated sum is "+sum);
        System.out.println("validating armstrong number");
        if(sum==temp){
            System.out.println("the given number is armstrong");
        }else{
            System.out.println("the given number is not armstrong");
        }



    }
}
