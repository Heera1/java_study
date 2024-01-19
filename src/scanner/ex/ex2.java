package scanner.ex;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        //사용자한테 정수 1개를 받고, 이 정수가 홀짝인지 판별

        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 하나 입력해 주세요: ");
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println("짝수입니다.");
        }else{
            System.out.println("홀수입니다.");
        }
    }
}
