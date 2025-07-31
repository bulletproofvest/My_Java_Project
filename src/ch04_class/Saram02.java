package ch04_class;

public class Saram02 {
    // static 변수 = 클래스 변수 = 정적 변수
    static String nationality = "대한민국";

    // 멤버 변수들
    String name;
    double height;
    double weight;
    String hobby;
    String blood;

    final double PI = 3.14; // 상수
    // double PI = 3.14; // 인스턴스변수
    //fianl = 변수가 아니고 상수

    public void display(){
        int total = 0;
        for (int i = 0; i < 11; i++) {
            total += i;
        }

        System.out.println("총합 : " + total);
        System.out.println("국적 : " + nationality);
        System.out.println("이름 : " + name);
        System.out.println("키 : " + height);
        System.out.println("몸무게 : " + weight);
        System.out.println("취미 : " + hobby);
        System.out.println("혈액형 : " + blood);
    }
}
