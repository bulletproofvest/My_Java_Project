package ch02_control_statement;

import java.util.Scanner;

public class WhileTest2 {
    public static void main(String[] args) {
        int scr;
        int count = 0;
        double ave = 0;

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("점수 입력 : ");
            scr = sc.nextInt();
            if(scr <= 0){
                System.out.println("음수 또는 0이어서 종료합니다.");
                break;
            }
            ave += scr;
            count++;
        }

        System.out.println("총 시험 빈도(회수) : " + count);
        System.out.println("총점 : " + (int)ave);
        System.out.println("평균 : " + ave/count);
    }
}
