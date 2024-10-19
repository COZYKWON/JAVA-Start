package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int insertNum = scanner.nextInt();

        int[] number = new int[insertNum];

        int sum = 0;

        System.out.println(insertNum + "개의 정수를 입력하세요: ");

        for (int count = 0; count < number.length; count++) {
            number[count] = scanner.nextInt();
            sum += number[count];
        }
        double average = (double) sum / number.length;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 점수의 평균: " + average);
    }
}
