package array.ex;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] number = new int[5];

        System.out.println("5개의 정수를 입력하세요: ");

        int sum = 0;

        for (int count = 0; count < number.length; count++) {
            number[count] = scanner.nextInt();
            sum += number[count];
        }
        double average = (double) sum / number.length;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 점수의 평균: " + average);
    }
}
