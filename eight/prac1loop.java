package eight;

import javax.xml.transform.stream.StreamSource;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class prac1loop {

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 2, 3, 4, 5, 6);

        //here accepts the consumer :: consumer is a functional interface, which has single method called accept(<T> val)

        Consumer<Integer> consumer=new Consumer<Integer>(){

            public void accept(Integer x){
                //we can perform any action on that variable x
                System.out.println(x);
            }
        };
        array.forEach(consumer);

        array.forEach(val-> System.out.println(val));
        System.out.println(array.stream());

    }

}
