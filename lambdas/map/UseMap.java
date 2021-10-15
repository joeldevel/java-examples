import java.util.List;

public class UseMap {
    public static void main(String[] args) {
      List<Integer> listA = List.of(10, 30, 2, 3, 14, 48, 9);
      List<String> listB = List.of("bobcat", "cat", "dog", "house", "concat","catherine", "outlaw", "bee", "add", "by");

      System.out.println("printing square of numbers in list");
      // Note the use of static method println
      listA.stream()
          .map(number -> number * number)
          .forEach(System.out::println);
      

      System.out.println("printing length of strings containing 'cat'");
      listB.stream()
          .filter( word -> word.contains("cat"))
          .map( word -> word.length())
          .forEach(System.out::println);

    }
}


