package variable;
//변수를 초기화하지 않고 사용할 경우, 컴파일 에러 발생
    //초기화를 하지 않으면 이상한 값이 출력될 수 있는데, 이런 문제를 해결하기 위해 자바는 강제로 변수를 초기화한다.
public class Var6 {
    public static void main(String[] args) {
        int a;
        //System.out.println(a);
    }
}
