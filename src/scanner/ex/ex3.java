package scanner.ex;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        //음식 이름, 가격, 수량을 입력 받아
            //주문한 음식의 총 가격을 계산 후 출력
        // 음식의 총 가격은 foodPrice(음식가격) * foodQuantity(음식수량) = totalPrice(토탈)

        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름을 입력해 주세요: ");
        String name = scanner.nextLine();

        System.out.print("음식 가격을 입력해 주세요: ");
        int foodPrice = scanner.nextInt();

        System.out.print("음식 수량을 입력해 주세요: ");
        int foodQuantity = scanner.nextInt();

        int totalPrice = foodPrice * foodQuantity;

        System.out.println(name + foodQuantity + "개를 주문하셨습니다. 총 가격은" + totalPrice + "입니다.");
    }
}
