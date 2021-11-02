import java.util.List;
import java.util.function.*;
/*
 * lamba expressions are objects of a specific type, FunctionalInterface
 *
 * 
 *
 */
public class FunctionalInterfaceInAction {
  public static void main(String[] args) {
    List<Integer> numbers = List.of(12, 3, 4, 5, 2, 7, 29, 15);
    
    // The equivalente of:` x -> x%2 == 0` lambda expression
    Predicate<Integer> isEvenPredicate = new Predicate<Integer>() {
      @Override
      public boolean test(Integer x) {
          return x % 2 == 0;
      }
    }; // Be careful with the ';'

    // The equivalente of:` x -> x * x` lambda expression
    Function<Integer, Integer> squareFunction = new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer x) {
            return  x * x;
        }
    };

    // The equivalente of:` x -> System.out.println(x)` lambda expression
    // or calling static reference System.out::println 
    Consumer<Integer> sysoutConsumer = new Consumer<Integer>() {
        @Override
        public void accept(Integer x) {
          System.out.println(x);
        }
    };

    // Print the square of even numbers in list 'numbers'
    numbers.stream()
        .filter(isEvenPredicate)
        .map(squareFunction)
        .forEach(sysoutConsumer);


  } // end main
} // end class
