
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;

public class AddMethod {
    public static void main(String[] args) {
        
        //Collection is an interface
        //ArrayList is an implementation of
        //List interface which extends Collection
        Collection<String> c = new ArrayList<>();

        // add is a method from Collection
        c.add("cat");
        c.add("dog");
        c.add("parrot");
        c.add("cat");

        System.out.println(c);

        // Create a set from a collection
        // a set does not have duplicate elements
        // so cat is just once
        // HashSet is an implementation of Set interface
        // which extends Collection
        Collection<String> animals = new HashSet<>(c);

        System.out.println(animals);

    }
}
