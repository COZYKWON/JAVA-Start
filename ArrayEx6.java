package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int n = scanner.nextInt();

        int[] number = new int[n];

        System.out.println(n + "개의 정수를 입력하세요:");

        int bigNum = 0;
        int smallNum = 0;

        for (int i = 0; i < n; i++) {
            number[i] = scanner.nextInt();
            if (i == 0) {
                smallNum = bigNum = number[i];
            }
            if (bigNum <=  number[i]) {
                bigNum = number[i];
            } else if (smallNum >= number[i]) {
                smallNum = number[i];
            }
        }
        System.out.println("가장 작은 정수: " + smallNum);
        System.out.println("가장 큰 정수: " + bigNum);
    }
}
