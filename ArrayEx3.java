package array.ex;

import java.util.Scanner;

public class ArrayEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[5];

        System.out.println("5개의 정수를 입력하세요:");
        for (int count = 0; count < num.length; count++) {
            num[count] = scanner.nextInt();
        }

        System.out.println("입력한 정수를 역순으로 출력:");
        for (int count = 4; count > -1; count--) {
            if (count == 0) {
                System.out.println(num[count]);
            } else {
                System.out.print(num[count] + ", ");
            }
        }

//        int temp1 = num[0];
//        num[0] = num[4];
//        num[4] = temp1;
//
//        int temp2 = num[1];
//        num[1] = num[3];
//        num[3] = temp2;
//
//        System.out.println("입력한 정수를 역순으로 출력:");
//        int count = 1;
//
//        for (int i : num) {
//            if (count == num.length) {
//                System.out.println(i);
//            } else {
//                System.out.print(i + ", ");
//            }
//            count++;
//        }
    }
}
