package ch02_control_statement;

import java.util.Scanner;

public class Switch07 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        a = sc.nextInt();

        switch (a){
            case 1: case 3: case 5:
                System.out.println("홀수");
                break;
            case 2, 4, 6:
                System.out.println("짝수");
                break;
            default:
                System.out.println("오류");
        }

    }
}
