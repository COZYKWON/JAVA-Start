package cond.ex;

public class EvenOddEx {

    public static void main(String[] args) {

        int x = 3;
        int evenOdd = x % 2;

        String result = (evenOdd == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + result);
    }
}
