package eight;

import java.util.Arrays;
import java.util.List;

public class MethodRef {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5);

        list.forEach(MethodRef::Consumer);

        try{

            int a=100/0;
            //this is unchecked exception
            

        }catch(Exception e){
            System.out.println("catch exception :: "+e.getMessage());
        }

    }

    public static void Consumer(Integer val){

        System.out.print(val+"::");
    }

}
