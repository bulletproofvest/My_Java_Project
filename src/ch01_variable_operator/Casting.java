package ch01_variable_operator;

public class Casting {
    public static void main(String[] args) {
        double d = 100;
        int a = (int)12.5;

        System.out.println((double) (14/5));
        System.out.println('b'-'h');

        int kor = 50, eng = 60, math = 80;

        int total = kor + eng + math;
        double ave = total/3;

        System.out.println("총" + total);
        System.out.println('평' + ave);

        char ch1 = 'a';
        char ch2 = 'c';
        boolean bool1 = ch1 > ch2; // 암시적 형변환이 되므로 99 > 97 즐, ture
        int result;
        result = ch1 - ch2 + 5;
        System.out.println("bool1: " +  bool1);
        System.out.println("result: " + result);

        char ch3 = 'D';

// 대문자이면
        String re = 'A' <= ch3 && 'Z' >= ch3 ? "Yes" : "No";
        System.out.println(re);

        //대입, 수식, 관계, 삼항 연산자

        // 이론 파트 읽기

    }
}
