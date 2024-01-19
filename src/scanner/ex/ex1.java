package scanner.ex;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        //이름, 나이 입력 받아 출력
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력해 주세요.: ");
        String name = scanner.nextLine();

        System.out.print("나이를 입력해 주세요.: ");
        int age = scanner.nextInt();

        System.out.println("당신의 이름은 [" + name + "]이고, 나이는 [" + age + "]살입니다.");
    }
}
