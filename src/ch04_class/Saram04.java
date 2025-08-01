package ch04_class;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Saram04 {
    // 기본생성자 : 초기화
    private String name;
    private double height;
    private double weight;
    private String hobby;
    private String blood;

    Scanner scan = null;
    // scan = new Scanner(System.in); (생성자 class에 추가) /null 체크를 하는 이유 ?

    // 생성자
    // class 이름과 동일, 반환타입 명시 x

    public Saram04(){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = hobby;
        this.blood = blood;
    }
    public Saram04(String name, double height, double weight, String hobby, String blood){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = hobby;
        this.blood = blood;
    }

    public Saram04(String name, double height, double weight, String blood) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = "볼링";
        this.blood = blood;
    }

    // 가독성을 위해 this를 붙임 ex) System.out.println("이름 : " + this.name);
    public void display() {
        System.out.println("이름 : " + name);
        System.out.println("키 : " + height);
        System.out.println("몸무게 : " + weight);
        System.out.println("취미 : " + hobby);
        System.out.println("혈액형 : " + blood);

        /* if(scan == null){
            System.out.print("정수 입력 : ");
            int su = scan.nextInt();
            System.out.println("입력된 정수 : " + su);
        } */
    }
}
