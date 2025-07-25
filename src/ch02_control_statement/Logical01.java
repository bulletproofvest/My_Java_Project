package ch02_control_statement;

import java.util.Scanner;

public class Logical01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        Integer num;

        System.out.print("1~12 사이의 정수 입력 : ");
        month = sc.nextInt();

         if(month > 12){
             System.out.println("잘못된 입력입니다.");
         }else if(month >= 3 && month <= 5){
            System.out.println(month + "월 은 봄입니다.");
        }else if(month >= 6 && month <= 8){
            System.out.println(month + "월 은 여름입니다.");
        }else if(month >= 9 && month <= 11){
            System.out.println(month + "월 은 가을입니다.");
        }else{
            System.out.println(month + "월 은 겨울입니다.");
        }
    }
}
