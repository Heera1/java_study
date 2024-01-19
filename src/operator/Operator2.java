package operator;

public class Operator2 {
    public static void main(String[] args) {
        //문자열 + 문자열
        String result1 = "hello" + "world";
        System.out.println("result1 = " + result1);
        
        String s1 = "string1";
        String s2 = "string2";
        System.out.println("s1 + s2 = " + s1 + s2);

        //문자열 + 숫자열
        String result2 = "a + b = " + 10;
        System.out.println(result2);
        
        int num = 20;
        String str = "a + b = ";
        String result3 = str + num;
        System.out.println(result3);
    }
}
