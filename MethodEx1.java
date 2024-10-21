package method.ex;

public class MethodEx1 {

    public static void main(String[] args) {
        avg(1, 2, 3);
        avg(15, 25, 35);
    }

    public static void avg(double a, double b, double c) {
        double average = (a + b + c) / 3.0;
        System.out.println("평균값: " + average);
    }
}
