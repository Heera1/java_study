package loop;

public class DoWhile1 {

    //최초 1번은 코드 블럭을 꼭 실행해야하는 경우 사용한다.
    public static void main(String[] args) {
        int  i = 10;
        do{
            System.out.println("현재 숫자는:" + i);
        }while(i < 3);
    }
}
