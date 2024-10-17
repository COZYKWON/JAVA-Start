package casting;

public class Casting3 {

    public static void main(String[] args) {

        long maxIntValue = 2147483647L;
        long maxIntOver = 2147483650L;
        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println("maxIntValue casting= " + intValue);

        intValue = (int) maxIntOver;
        System.out.println("maxIntOver casting= " + intValue);
    }
}
