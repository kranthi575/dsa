package eight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5);

        //printing using method reference
        //here println is a method of out
        //list.forEach(System.out::println);
        //System.out.println(list.stream());
        Stream<Integer> stream = list.stream();
        Stream<Integer> stream2 = list.stream();
        stream.forEach(System.out::print);
        System.out.println(":::");
        stream2.forEach(System.out::print);
    }
}
