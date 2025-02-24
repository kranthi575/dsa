package eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream3 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5,10,12,13,25,30);

        //now I need to perform sum of value which is divisible by the 5

        Integer sumVal=list.stream().filter(val->val%5==0).reduce(0,(c,e)->c+e);
        System.out.println(sumVal);
    }
}
