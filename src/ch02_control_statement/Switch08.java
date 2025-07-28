package ch02_control_statement;

import java.util.Scanner;

public class Switch08 {
    public static void main(String[] args) {
        int month;
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력:");
        month = sc.nextInt();

        switch (month){
            case 3, 4, 5:
                System.out.println("봄");
                break;
            case 6, 7, 8:
                System.out.println("여름");
                break;
            case 9, 10, 11:
                System.out.println("가을");
                break;
            case 12, 1, 2:
                System.out.println("겨울");
                break;
            default:
                System.out.println("오류");
        }
    }
}
