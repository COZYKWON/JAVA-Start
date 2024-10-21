package method.ex;

import java.util.Scanner;

public class MethodEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("문장을 입력해주세요:");
        String message = scanner.nextLine();

        System.out.println("반복하고싶은만큼 숫자를 입력하세요:");
        int num = scanner.nextInt();

        message(message, num);
    }

    public static void message(String message, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(message);
        }
    }
}
