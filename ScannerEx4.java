package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** 구구단 프로그램 ***");
        System.out.println();

        System.out.print("구구단의 단 수를 입력해주세요: ");
        int n = scanner.nextInt();

        System.out.println(n + "단의 구구단: ");

        for (int count = 1; count <= 9; count++) {
            System.out.println(n + " x " + count + " = " + n * count);
        }
    }
}
