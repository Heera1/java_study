package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxValue = 2147483647;
        long maxIntOver = 2147483648L;
        int intValue = 0;
        
        intValue = (int) maxValue;
        System.out.println("intValue = " + intValue);

        intValue = (int) maxIntOver;
        System.out.println("intValue = " + intValue);
    }
}
