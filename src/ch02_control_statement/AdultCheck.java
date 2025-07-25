package ch02_control_statement;

import java.util.Scanner;

public class AdultCheck {
    public static void main(String[] args) {
        String name;
        int age;
        int gender;
        String ag;
        String gen;

        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        name = sc.next();
        System.out.print("나이 입력 : ");
        age = sc.nextInt();
        System.out.print("주민번호 뒷자리 성별(1, 2, 3, 4) 입력 : ") ;
        gender = sc.nextInt();

        if(age>=19){
            ag = "성인";
        }else{
            ag = "미성년자";
        }

        if(gender==2 || gender == 4){
            gen = "여자";
        }else{
            gen = "남자";
        }

        System.out.println(name + "님, 나이 : " + age + "세, 성인 체크 : " + ag + ", 성별 : " + gen);


    }
}
