import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Greeting greeting = (name) -> {
            System.out.println("Hello " + name);
        };

        greeting.sayHello("Pruthvik");

        Runnable r = () -> {
            System.out.println("Running in thread: "
                    + Thread.currentThread().getName());
        };

        new Thread(r).start();

        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Mango");

        Collections.sort(list, (a, b) -> a.compareTo(b));

        System.out.println("Sorted List: " + list);
    }
}