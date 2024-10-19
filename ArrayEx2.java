package array.ex;

import java.util.Scanner;

public class ArrayEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numBox = new int[5];

        System.out.println("5개의 정수를 입력하세요:");

        for (int count = 0; count < numBox.length; count++) {
            numBox[count] = scanner.nextInt();
        }

        System.out.println("출력"); //점검 필요. 너무 효율성 떨어짐
//        int count = 1;
//        for (int num : numBox) {
//            if (count == numBox.length) {
//                System.out.println(num);
//            } else {
//                System.out.print(num + ", ");
//            }
//            count++;
        for (int count = 0; count < numBox.length; count++) {
            if (count == numBox.length - 1) {
                System.out.print(numBox[count]);
            } else {
                System.out.print(numBox[count] + ", ");
            }
        }
    }
}
