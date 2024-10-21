package method.ex;

import java.util.Scanner;

public class MethodEx3_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 10000; //잔액

        System.out.println("*** 입출금 프로그램 ***");
        System.out.println();

        while (true) {
            System.out.println("1. 입금 | 2. 출금 | 3. 종료");
            System.out.print("이용하실 메뉴를 선택하세요: ");
            int menu = scanner.nextInt();

            if (menu == 1) {
                System.out.print("입금하실 금액을 입력해주세요: ");
                int depositAmount = scanner.nextInt();

                balance += depositAmount;

                System.out.println(depositAmount + "원을 입금하였습니다.");
                System.out.println("현재 잔액: " + balance + "원");

            } else if (menu == 2) {
                System.out.println("출금하실 금액을 입력해주세요: ");
                int withdrawAmount = scanner.nextInt();

                if (withdrawAmount > balance) {
                    System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
                    System.out.println("현재 잔액: " + balance + "원");
                    continue;
                } else {
                    balance -= withdrawAmount;
                    System.out.println(withdrawAmount + "원을 출금하였습니다.");
                    System.out.println("현재 잔액: " + balance + "원");
                }

            } else if (menu == 3) {
                System.out.println("현재 잔액: " + balance);
                System.out.println("이용해주셔서 감사합니다.");
                break;

            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
            System.out.println();
        }
    }

    public static void deposit(int depositAmount) {
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: ");
    }
}
