package loop.ex;

public class NestedEx2 {

    public static void main(String[] args) {

        int rows = 5;

        for (int p1 = 1; p1 <= rows; p1++) {
            for (int p2 = 1; p2 <= p1; p2++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
