import java.util.List;

public class UseFilter {
    public static void main(String[] args) {
      List<Integer> listA = List.of(10, 30, 2, 3, 14, 48, 9);
      List<String> listB = List.of("bobcat", "cat", "dog", "house", "concat","catherine", "outlaw", "bee", "add", "by");

      System.out.println("printing all number in list");
      // Note the use of static method println
      listA.stream().forEach(System.out::println);
      

      System.out.println("printing only odd numbers");
      // inside filter there is a lambda expression
      listA.stream()
          .filter(number -> number % 2 != 0)
          .forEach(System.out::println);

      System.out.println("printing strings containing 'cat'");
      listB.stream()
          .filter( word -> word.contains("cat"))
          .forEach(System.out::println);

    }
}


