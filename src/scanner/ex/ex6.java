package scanner.ex;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        //숫자 2개를 입력 받고, 그 사이에 정수를 모두 출력
            //첫번째 숫자 num1
            //두번째 숫자 num2
        //num1이 num2보다 크면 두 숫자를 교환하시오
        //그렇지 않다면 num1, num2까지 각 숫자를 출력

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요 : ");
        int num2 = scanner.nextInt();


        if(num1 > num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.print("두 숫자 사이의 모든 정수: ");
        for(int i = num1; i <= num2; i++){
            if(i == num2){
                System.out.print(i);
            } else {
                System.out.print(i + ",");
            }
        }
    }
}
