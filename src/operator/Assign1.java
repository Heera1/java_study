package operator;

public class Assign1 {
    public static void main(String[] args) {
        int a = 5;
        a += 3; // 8 (5 + 3): a = a + 3
        a -= 2; // 6 (8 - 2): a = a - 2
        a *= 4;
        a /= 3;
        a %= 5;
        System.out.println(a);
    }
}
