package scanner.ex;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        //상품의 가격, 수량 입력받고 총 비용 출력
        //price(가격) * 수량(quantity) = 총비용
            // -1 입력 시 가격입력 종료

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("상품의 가격을 입력하세요(-1 입력시 종료) : ");
            int price = scanner.nextInt();

            if(price == -1){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("구매하려는 수량을 입력하세요 : ");
            int quantity = scanner.nextInt();

            int result = price * quantity;
            System.out.println("총 비용: " + result);

        }
    }
}
