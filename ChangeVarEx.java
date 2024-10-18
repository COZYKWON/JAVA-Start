package scanner.ex;

public class ChangeVarEx {

    public static void main(String[] args) {

        System.out.println("*** 변수 값 교환 ***");

        int a = 10;
        int b = 20;

        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
