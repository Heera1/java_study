package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        int num = 2;
        /*int count = 1;*/

/*        while (count <= 10) {
            System.out.println(num);
            num += 2;
            count++;
        }*/

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(num);
            num += 2;
        }

        //정답
        for (int number = 2, count = 1; count <= 10; num += 2, count++) {
            System.out.println(num);
        }
    }
}
