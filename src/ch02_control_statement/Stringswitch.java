package ch02_control_statement;

import java.util.Scanner;

public class Stringswitch {
    public static void main(String[] args) {
        String month;
        int month_num = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("month : ");
        month = sc.next();

        switch (month){
            case "January":
                month_num = 1;
                break;
            case "February":
                month_num = 2;
                break;
            case "March":
                month_num = 3;
                break;
            case "April":
                month_num = 4;
                break;
            case "May":
                month_num = 5;
                break;
            case "June":
                month_num = 6;
                break;
            case "July":
                month_num = 7;
                break;
            case "August":
                month_num = 8;
                break;
            case "Sepember":
                month_num = 9;
                break;
            case "October":
                month_num = 10;
                break;
            case "November":
                month_num = 11;
                break;
            case "December":
                month_num = 12;
                break;
            default:
                System.out.println("오류");
                System.exit(0);

        }

        String message = month + "는(은) " + month_num + "월 입니다.";
        System.out.println(message);
    }
}
