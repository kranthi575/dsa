package eight;

@FunctionalInterface
interface Show{
    String show(String name);
}

public class LamdaPrac{

    public static void main(String args[]){
        System.out.println("Print hello world!!");

         Show show=(String name)->{return "Hello World!!"+name;
            };

        System.out.println(show.show("kranthi"));
    }
}
