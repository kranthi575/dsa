package dsa;

import java.util.*;

//finding maximum subarray sum in the array
// {1,3,-1,2,4,-5,6,13}
public class maxsubarray {

    public static void main(String[] args) {


        int[] nums={-19,-2,-16,-3,-10,-2,-14};
        HashMap<Integer,List> maxMap=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int max=nums[i];
            int startindex=i;
            int endindex=i;
            boolean flag=false;
            for(int j=i;j<nums.length;j++){
                int sum=nums[j]+max;
                if(sum>max){
                    max=sum;
                }

                if(sum<max){
                    break;
                }
                endindex= j;
                i=j;

                if(j==nums.length-1){flag=true;}
            }
            System.out.println("max value as of now ::"+max+"with indices "+startindex+" and "+endindex);
            if(maxMap.containsKey(max)){
                //maxMap.get(max).add(Arrays.asList(startindex,endindex));
                System.out.println("already exists:");
            }else {
                maxMap.put(max, Arrays.asList(nums, i, endindex));
            }

            if(flag){
                System.out.println("end of loop :: terminating from the both loops");
                break;
            }

        }

        if (!maxMap.isEmpty()) {  // Ensure the map is not empty
            int maxKey = Collections.max(maxMap.keySet());
            System.out.println("Max Key: " + maxKey);
            System.out.println(maxMap.get(maxKey));
        } else {
            System.out.println("Map is empty!");
        }




    }
}
