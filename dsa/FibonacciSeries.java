package dsa;

import java.util.HashMap;
import java.util.Scanner;



//1. Fibonacci series (solution)
//Write a simple Java program which will print Fibonacci series, e.g. 1 1 2 3 5 8 13 ... . up to a given number.
// We prepare for cross questions like using iteration over recursion and how to optimize the solution using caching and memoization.
public class FibonacciSeries {

    public static HashMap<Integer,Integer> memo = new HashMap<>();

    //lets try implement memorizing and optimizing the below recursion method
    public static int fibbrecmem(int n){

        //checking memorizing using the hashmap
        if(memo.containsKey(n)){
            System.out.println("fib"+n+" ::  "+memo.get(n)+":: this function already solved");
            return memo.get(n);
        }

        //base condition
        if(n==1 || n==2){
            memo.put(n,1);
            System.out.println("calculated fibbmem "+n+ "result : "+1+ "\n and result stored in hashmap");
            return 1;
        }

        int res=fibbrecmem(n-1) + fibbrecmem(n-2);
        memo.put(n,res);
        System.out.println("calculated fibbmem "+n+ "result : "+res+ "\n and result stored in hashmap");
        return res;
    }

    //lets try using recursion
    //here duplicate problems were solved here and  it is wasting of tym
    //the time complexity of this method is O(2^n) and space complexity is O(1)
    public static int fibbrec(int n) {

        //this is not base condition || this is for  validation check
        if(n==0)
                return 0;

        //this is the base condition
        if(n==1 || n==2)
            return 1;

        // Recursive case
        int result = fibbrec(n - 1) + fibbrec(n - 2);

        // Print the result of the current computation
        System.out.println("Result of fibbrec(" + n + ") = " + result);

        return result;
    }


    //using regular loop
    public static void fibb(int n){
        if(n==0) {
            System.out.println("fibb series is not possible");
            return;
        }
        if(n==1) {
            System.out.println("1");
            return;
        }

        int[] fib=new int[n];
        fib[0]=1;
        fib[1]=1;
        for(int i=2;i<n;i++) {

            fib[i]=fib[i-1]+fib[i-2];

        }

        System.out.println("here is the fib series:");
        for(int i =0;i<n;i++){
            System.out.print(" "+fib[i]);
        }







    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int size;
        System.out.println("Enter the size of the fibonacci sequence: ");
        size = sc.nextInt();

       // FibonacciSeries.fibb(size);
        System.out.println(FibonacciSeries.fibbrecmem(size));



    }
}
