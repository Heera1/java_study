package loop.ex;

public class WhileEx5 {
    public static void main(String[] args) {
        int rows = 5;

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*"); //라인을 넘기지 않음
            }
            System.out.println(); //출력 후 다음라인으로 넘김
        }
    }
}
