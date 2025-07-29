package ch02_control_statement;

import java.util.Scanner;

public class WhileTest4 {
    public static void main(String[] args) {
        int scr = 0;
        int count = 0;
        double ave = 0;

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("점수 입력 : ");
            scr = sc.nextInt();

            if(scr < -10){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (scr<0) {
                scr = -scr;
            }
            count++;
            ave += scr;
        }

        System.out.println("총 시험 빈도(회수) : " + count);
        System.out.println("총점 : " + (int)ave);
        System.out.println("평균 : " + ave/count);
    }
}
