package scanner.ex;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        // 사용자로부터 정수 1개 입력받아, 구구단 출력

        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자 1개를 입력해주세요 : ");
        int num = scanner.nextInt();

        for(int i = 1; i <= 9; i++){
            System.out.println(num + " x " + i + " = " +(num*i));
        }
    }
}
