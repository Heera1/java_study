package operator;

public class OperatorAdd1 {
    public static void main(String[] args) {
        int a = 0;
        a = a + 1;

        System.out.println("a = " + a);
        
        a = a + 1;
        System.out.println("a = " + a);

        //위에가 귀찮아서 증감 연산자라는 걸 씀
            //증감연산자는 연산자의 위치에 따라 연산되는 시기가 달라짐
        ++a; //전위(Prefix) 증감 연산자
        System.out.println("a = " + a);
    }
}
