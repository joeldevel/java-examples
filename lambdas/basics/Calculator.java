public class Calculator {
    interface IntegerMath {
        int operation(int a, int b);
    }

    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }

    public static void main(String[] args) {
        Calculator myApp = new Calculator();
        IntegerMath addition = (a, b) -> a + b;

        System.out.println("20 + 20 = " + myApp.operateBinary(20, 20, addition));
    }
}
