package dsa;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//finding the unique triplets who sum is equal to zero.
public class ThreeSum {

    public static void main(String args[]){

        int[] nums=new int[]{-1,0,1,2,-1,-4};

        int n=nums.length;
        //creating hashmap
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
                map.put(nums[i],i);
        }
        List triplets=new ArrayList();
        List valArray=new ArrayList();

        //fix the first element
        for(int i=0;i<n;i++){
            //skipping the duplicate value
            if(i>0 && nums[i]==nums[i-1])continue;
            //calc leftover value
            int leftover1=-nums[i];
            for(int j=0;j!=i && j<n;j++){
                if(j>0 && nums[j]==nums[j-1]) continue;
                int leftover2=-nums[i]-nums[j];
                //find leftover2 present in the nums
                if(map.containsKey(leftover2) && map.get(leftover2)!=j && map.get(leftover2)!=i){

                    triplets.add(List.of(i,j,map.get(leftover2)));
                    valArray.add(List.of(nums[i],nums[j],nums[map.get(leftover2)]));

                }
            }
        }

        for(int i=0;i<valArray.size();i++){
           System.out.println(valArray.get(i));
           // System.out.println(triplets.get(i));
        }



    }
}
