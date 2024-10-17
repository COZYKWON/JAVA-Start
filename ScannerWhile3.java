package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("사용자 입력을 받아 그 합계를 계산하는 프로그램");
        System.out.println("한 번에 한 개의 정수만 입력할 수 있으며, 0을 입력하면 프로그램은 종료됩니다.");
        System.out.println();

        int sum = 0;

        while (true) {

            System.out.print("정수를 입력하시오: ");
            int num = scanner.nextInt();
            sum += num;

            if (num == 0) {
                System.out.println("합계: " + sum);
                System.out.println("프로그램 종료");
                break;
            }

        }
    }
}
