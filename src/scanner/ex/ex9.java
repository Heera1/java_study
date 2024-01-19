package scanner.ex;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        //여러 숫자를 입력받고, 그 숫자들의 합계와 평균을 구함
            //마지막 숫자가 -1 이면 숫자입력이 종료됨
        //모든 숫자 입력이 끝난 후 합계 sum과 평균 average 출력
            //소숫점 아래까지 출력

        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요 : ");

        int count = 0;
        int sum = 0;
        while(true){
            int num = scanner.nextInt();
            if(num == -1){
                break;
            }
            sum += num;
            count++;
        }

        double average = (double) sum / count;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);
    }
}
