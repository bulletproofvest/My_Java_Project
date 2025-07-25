package ch01_variable_operator;

public class TernaryOperator {
    public static void main(String[] args) {
        int a =3, b = 5;
        int result = 0;

        result = a >= b ? a-b : b-a; // int result = 조건식 ? 참일때 : 거짓일때 ;

        System.out.println("result : " + result);

        int x = 5;

        result = x%2 == 0 ? x + 3 : x * x;
        System.out.println("result : " + result);

        x= 8;
        int y = 40;

        result = x>=y ? x : y;
        System.out.println("result : " + result);


        result = x<=y ? x : y;
        System.out.println("result : " + result);

        x = 5;
        y = 12;
        String d;

        // x가 12의 약수면 yes
        d = y%x==0 ? "yes" : "no";
        System.out.println(d);

        int su = 7;
        // 숫자 7은 홀수입니다.
        d =  7%2 == 0 ? "짝수" : "홀수";
        System.out.println("숫자 " + su +"은(는) " + d + "입니다.");

        int score = 85 ;
        // 60점 이상이면 합격
        // 85점이므로 합격입니다. 반대의 경우도 출력
        d = score >= 60 ? "합격" : "불합격" ;
        System.out.println(score +"점이므로 " + d + "입니다.");



    }
}
