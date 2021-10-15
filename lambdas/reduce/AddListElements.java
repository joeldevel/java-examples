import java.util.List;

public class AddListElements {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);

        int sum =list.stream()
            .reduce(0, AddListElements::add);
            //.reduce(0, (x, y) -> x + y); // or use a lambda expression
            //.reduce(0, Integer::sum); // or use build-in method

        System.out.println("The sum from 1 to 9 is " + sum);
    }
    private static int add(int x, int y) {
        return x + y;
    }
}
