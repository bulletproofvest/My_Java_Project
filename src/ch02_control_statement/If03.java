package ch02_control_statement;

import java.util.Scanner;

public class If03 {
    public static void main(String[] args) {
        int su = 3;
        System.out.print("정수 1개 입력: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a%su == 0){
            System.out.println(a+"는(은 "+su+"의 배수 입니다.");
            System.out.println(a*a);
        }else{
            System.out.println(a+"는(은 "+su+"의 배수가 아닙니다.");
            System.out.println(a+5);
        }

    }
}
