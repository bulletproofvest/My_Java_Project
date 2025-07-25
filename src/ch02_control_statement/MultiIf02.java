package ch02_control_statement;

import java.util.Scanner;

public class MultiIf02 {
    public static void main(String[] args) {
        int age;
        double ticket = 1000.0;
        double discount; //할인율
        int sum;
        // String comment; > 노인, 유아, 어린이 등

        System.out.print("나이를 입력하세요: ");

        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if(age < 8){
            discount = 100;
            System.out.println(age + "살 : 유아(무료입장)");

        } else if(age < 14){
            discount = 50;
            System.out.println(age + "살 : 어린이(50% 할인)");

        }else if(age < 20){
            discount = 30;
            System.out.println(age + "살 : 청소년(30% 할인)");

        }else if(age >= 65){
            discount = 40; // 0.4;
            System.out.println(age + "살 : 노인(40% 할인)");

        }else{
            discount = 0;
            System.out.println(age + "살 : 성인(정가)");
        }

        sum = (int)ticket - (int)(ticket*(discount/100));

        System.out.println("가격은 " + sum + "원입니다.");

        //String message = age + "살 : "+ comment;
        //System.out.println(comment);
        //String message = "가격은" + ticket * (1-discount) + "입니다.";
        //System.out.println(comment);
    }
}
