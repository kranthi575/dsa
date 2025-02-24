package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicatesArray {


    //writing method to perform removing duplicate elements from an array ( of anytype int, string, char)

    //here we are using generics :: <T> is used to specify the variable type using inside the method
    //while array is passed as variable java automatically read the type of data is coming and it assign to the <T>
    // T will behave like that variable.
    public static <T> T[] removeduplicates(T[] array){

        int n=array.length;
        T[] newArray=(T[]) new Object[n];

        int uniqCount=0;

        for(int i=0;i<n;i++){
            boolean found=false;
            for(int j=0;j<uniqCount;j++){
                if(array[i]==array[j]){
                    found=true;
                    break;
                }
                if(!found){
                    newArray[uniqCount++]=array[i];
                }
            }
        }

        return newArray;


    }
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        Integer[] intarray = new Integer[n];
        Integer[] intarray2 = new Integer[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            intarray[i]=sc.nextInt();
        }
        System.out.println("entered array elements");
        for(int i=0;i<n;i++){
            System.out.print(intarray[i]);
        }
        int k=0;
        System.out.println("processing....");
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n && j!=i;j++){
                if(intarray[i]==intarray[j]){
                    count++;
                }
            }
            if(count==0){
                intarray2[k]=intarray[i];
                k++;
            }
        }

        for(int i=0;i<k;i++){
            System.out.println(intarray2[i]);
        }


    }
}
