package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        //1부터 max까지 합을 출력하는 프로그램
            //sum이라는 변수사용 //i라는 변수를 사용하여 1부터 max까지 증가는 변수를 카운트

        int max = 100;
        int sum = 0;

        /*for (int i = 1; i <= max; i++){
            sum += i;
        }
        System.out.println(sum);*/

        int j = 1;
        while (j <= max) {
            sum += j;
            j++;
        }
        System.out.println(sum);
    }
}
