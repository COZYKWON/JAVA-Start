package loop.ex;

public class NestedEx1 {

    public static void main(String[] args) {

        for (int num1 = 1; num1 <= 9; num1++) {
            for (int num2 = 1; num2 <= 9; num2++) {
                int multiple = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + multiple);
            }
        }
    }
}
