package dsa;


//arr = [3, 1, 2, 7, 4, 2, 1, 1, 5]
//possible max sum = 8

//find the length of the longest subarray length

import java.util.Arrays;

public class LongestValidSubarray {

    public static void main(String[] args) {

        int n = (int) Math.pow(10, 6);  // Define size as 10^6
        int[] arr = new int[n];  // Create an array of size 10^6
        Arrays.fill(arr, 1);

        int maxsum = (int) Math.pow(10, 6);
        int maxsubarrayLen=0;

        //using sliding window concept to find the solution
        // i,j ;  start looping array with i, thier will be j send loop
        // i points the starting of the subarray,
        // j moves forward by calculating total sum until j -- sum=sum+arr[j];
        // if sum > maxsum, i moves forward , stores maxsubarrayLen= j-i+1;  -- sum=sum-arr[i]; i++;
        // if sum < maxsum, j moves forward -- j++
        // if i==j, makes i=j and j++

        int sum=0;
        int k=0;
        //points starting of array
        for(int i=0; i<arr.length; i++){

            while(k<arr.length){


                //calculating sum
                sum+=arr[k];

                System.out.println("calculated sum :"+sum+"from "+i+" :: "+k);
                if(sum<=maxsum){
                    //do nothing
                    maxsubarrayLen=k-i+1;
                    System.out.println("max subarray length :"+maxsubarrayLen);
                    k++;
                }
                if(sum>maxsum){

                    sum=sum-arr[i];
                    k++;
                    break;
                }
                if(i==k){
                    i=k;
                    k++;
                    break;
                }


            }

            if(k==arr.length-1){

                System.out.println(" pointer "+i+" : "+k);
                sum=sum-arr[i];
                if(sum<=maxsum){
                    //do nothing
                    System.out.println(sum);
                    System.out.println("k-pointer reached to last element ");
                    maxsubarrayLen=k-i+1;

                }else{
                    break;
                }

            }

        }

        System.out.println("maxminmum possible subarray length ::"+maxsubarrayLen);

    }
}
