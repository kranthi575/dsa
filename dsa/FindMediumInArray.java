package dsa;


import java.util.*;
import java.util.stream.IntStream;


class FindMediumInArray {

    public void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }



    public void sortedArray(int[] nums3,int low,int high){

        if(low<high){

            int mid=(low+(high-1))/2;


            //sorting first half and second half
            sortedArray(nums3,low,mid);
            sortedArray(nums3,mid+1,high);

            //merging both sorted array
            //sorted halves
            merge(nums3, low, mid, high);

        }


    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {


        //concating two arrays
        int[] nums3= IntStream.concat(IntStream.of(nums1),IntStream.of(nums2)).toArray();
        //find the length
        sortedArray(nums3,0,nums3.length-1);

        System.out.println(Arrays.toString(nums3));
        //find the element, if  (len1+len2)%2 ===0 then sum((len1+len2)/2 ,(len1+len2)/2 +1 )/2 else ceil(len1+len2)/2
        int len=nums3.length;
        double median;
        System.out.println("values of the summation to find medium is "+(nums3[len/2]+nums3[len/2+1]));
        if(len%2==0){
            median=(nums3[len/2 - 1]+nums3[len/2])/2.0;
            }

        else{
            median=nums3[len/2];
            }
        return median;



    }
    public static void  main(String[] args) {

        FindMediumInArray fma=new FindMediumInArray();
        int[] nums1={1,2};
        int[] nums2={3,4};
        double res=fma.findMedianSortedArrays(nums1,nums2);
        System.out.printf("Try programiz.pro : %.5f%n",res);
    }
}