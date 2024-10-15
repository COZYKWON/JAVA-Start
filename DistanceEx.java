package cond.ex;

public class DistanceEx {

    public static void main(String[] args) {

        int distance = 150;

        String transport;
        if (distance <= 1) {
            transport = "도보";
        }
        else if (distance <= 10) {
            transport = "자전거";
        }
        else if (distance <= 100) {
            transport = "자동차";
        }
        else {
            transport = "비행기";
        }
        System.out.println(transport + "를 이용하세요.");
    }
}
