package cond.ex;

public class ScoreEx4 {
    public static void main(String[] args) {
        double rating = 7.1;
        String a = "어바웃타임을 추천합니다.";
        String b = "토이 스토리를 추천합니다";
        String c = "고질라를 추천합니다";


        if(rating <= 9 ){
            System.out.println(a);
        }
        if (rating <= 8) {
            System.out.println(b);
        }
        if (rating <= 7) {
            System.out.println(c);
        }
    }
}
