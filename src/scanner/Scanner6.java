package scanner;

import java.util.Scanner;

public class Scanner6 {
    public static void main(String[] args) {
        //프로그램을 종료하려면 0을 입력
            //프로그램을 종료하기 전까지의 모든 숫자를 합산하여 출력

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요 (0 입력 시 종료)");
        int sum = 0;

        while(true){
            int num = scanner.nextInt();

            if(num == 0) {
                break;
            }
            sum += num;
        }
        System.out.println("프로그램을 종료합니다: " + sum);
    }
}
