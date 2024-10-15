package cond.ex;

public class GradeSwitchEx_2 {

    public static void main(String[] args) {

        String grade = "F";

        String coment;
        switch (grade) {
            case "A":
                coment = "탁월한 성과입니다!";
                break;
            case "B":
                coment = "좋은 성과입니다!";
                break;
            case "C":
                coment = "준수한 성과입니다!";
                break;
            case "D":
                coment = "향상이 필요합니다.";
                break;
            case "F":
                coment = "불합격입니다.";
                break;
            default:
                coment = "잘못된 학점입니다.";
        }
        System.out.println(coment);
    }
}
