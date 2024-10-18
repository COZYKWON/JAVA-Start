package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** 입력한 숫자 사이 출력 프로그램 ***");
        System.out.println();

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        System.out.print("두 숫자 사이의 모든 정수: ");

        if (num1 > num2) {
            int temp = num2;
            num2 = num1; //큰 수
            num1 = temp; //작은 수
        } else if (num1 == num2) {
            System.out.println("같은 숫자입니다.");
        }

        for (int count = num1 + 1; count < num2; count++) {
            if (count  + 1 == num2) {
                System.out.println(count);
            } else {
                System.out.print(count + ", ");
            }
        }
    }
}

