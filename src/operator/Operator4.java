package operator;

public class Operator4 {
    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3;
        int sum4 = (2 * 2) + (3 * 3); //복잡한 우선순위를 가지고 있는 경우 괄호를 명시적으로 보여주는 게 낫다

        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
    }
}
