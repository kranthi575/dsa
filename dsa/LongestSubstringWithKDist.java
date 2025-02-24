package dsa;

import java.util.HashMap;

public class LongestSubstringWithKDist {

    public static void main(String[] args) {

        //reading char array
        String input="bbcdbbb";
        char[] arr=input.toCharArray();
        int distN=1;

        //need to find the longest n dist subarray

        //will character and respective count
        HashMap<Character,Integer> map=new HashMap<>();
        int maxSize=0;

        //possible string
        String str="";

        int k=0;
        //iterating with i and k is sec pointer
        for(int i=0;i<arr.length;i++){

            while(k<arr.length) {
                    char ch = arr[k]; //k=3, ch=c   map{e:2,b:1}
                    //checking ch
                    if (map.size() < distN || map.containsKey(ch)) {
                        //adding ch to hm
                        map.put(ch, map.getOrDefault(ch, 0) + 1);
                        //concat to string
                        str = str + ch;
                        k++;
                        if(str.length()>maxSize) {
                            maxSize = str.length();
                        }
                        System.out.println("start index :"+i+":: end index :"+k);
                        System.out.println("string : "+str+" :: maxlen : "+maxSize);
                    }
                    else {

                        while(map.get(arr[i])>0) {

                            map.put(arr[i], map.get(arr[i]) - 1);
                            str=str.substring(1);
                            if (map.get(arr[i]) == 0) {
                                map.remove(arr[i]);
                            }
                            if(map.size()<distN) {
                                break;
                            }
                            i++;
                        }

                        break;
                    }

            }
        }





    }
}
