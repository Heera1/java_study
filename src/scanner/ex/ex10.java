package scanner.ex;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        // 사용자로부터 상품명, 가격, 수량 입력 받고 => 총 가격 출력
            //여러 상품을 추가하고 결제할 수 있음 //언제든지 프로그램 종료 가능
        // option : 상품입력, 결제, 프로그램 종료
            // 상품입력을 선택한 경우, 사용자에게 상품명, 가격, 수량을 입력 받으시오
            // 결제 옵션을 선택한 경우, 총 비용을 출력 / 총 비용 0으로 초기화
            // 프로그램 종료 옵션을 선택하면, "프로그램을 종료합니다" 메세지 출력
            // 세가지 옵션 외의 다른 옵션을 선택하면, "올바른 옵션을 선택해주세요." 메세지 출력

        Scanner scanner = new Scanner(System.in);
        int totalPrice = 0;



        while (true) {
            System.out.print("1: 상품입력, 2: 결제, 3: 종료 : ");
            int option = scanner.nextInt();

            if (option == 1) {
                scanner.nextLine(); //이전에 입력된 개행문자 제거

                System.out.print("상품명: ");
                String name = scanner.nextLine();

                System.out.print("가격: ");
                int price = scanner.nextInt();

                System.out.print("수량: ");
                int num = scanner.nextInt();

                totalPrice += price * num;

                System.out.println("상품명: " + name + ",  가격: " + price + ", 수량: " + num + ", 합계 : " + price*num);
            } else if (option == 2) {
                System.out.println("총 비용: " + totalPrice);
                totalPrice = 0;
            } else if(option == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
