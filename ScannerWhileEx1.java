package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** 반복하여 이름과 나이를 출력하는 프로그램 ***");
        System.out.println();

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = scanner.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("나이를 입력하세요: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }
    }
}
