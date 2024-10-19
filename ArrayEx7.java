package array.ex;

import java.util.Scanner;

public class ArrayEx7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] studentScore = new int[4][3];
        int[] sum = new int[4];
        double[] average = new double[4];

        for (int row = 0; row < studentScore.length; row++) {
            System.out.println((row + 1) + "번 학생의 성적을 입력하세요:");
            for (int column = 0; column < studentScore[row].length; column++) {
                if (column == 0) {
                    System.out.print("국어 점수: ");
                } else if (column == 1) {
                    System.out.print("수학 점수: ");
                } else {
                    System.out.print("영어 점수: ");
                }
                studentScore[row][column] = scanner.nextInt();
                sum[row] += studentScore[row][column];
                average[row] = (double) sum[row] / studentScore[row].length;
            }
        }
            for (int column = 0; column < sum.length; column++) {
                System.out.print((column + 1) + "번 학생의 ");
                System.out.print("총점: " + sum[column] + ", ");
                System.out.println("평균: " + average[column]);
            }
    }
}
