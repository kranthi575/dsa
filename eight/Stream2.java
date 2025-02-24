package eight;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class Stream2 {

    public static void main(String[] args) {

        List<Integer> nums= Arrays.asList(1,2,3,4,5,6,7,8,9);

        //stream has two kinds of methods :
        // 1.Intermediate methods like map,filter ; these won't print any output but it will pass to next method
        //2. Terminate methods like forEach,reduce,findFirst; these will return the output

        //Function is functinal interface which used by the map method in stream
        //it will input and return the value with performing neccessary operations
        //need to mention input type and return type
        Function<Integer,Integer> function=new Function<Integer, Integer>(){
            public Integer apply(Integer val){
                return val*2;
            }
        };

        //BinaryOperator is also a functional interface used by reduce method in stream
        //it helps to perform the summation :: carry, value return the total sum
        BinaryOperator<Integer> binaryOperator=new BinaryOperator<Integer>(){
            public Integer apply(Integer a, Integer b){
                return a+b;
            }
        };

        Stream<Integer> stream=nums.stream();

        Stream<Integer> stream1=stream.map(function);

        Integer sum=stream1.reduce(binaryOperator).orElse(0);

        System.out.println(sum);

        //we can write all that code in single line using lambda expressions

        Integer sumVal=nums.stream().map(i->i*2).reduce(0,(carry,sumvalue)->carry+sumvalue);

        System.out.println(sumVal);
    }
}
