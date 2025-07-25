package ch02_control_statement;
import java.util.Scanner;

public class If04 {
    public static void main(String[] args) {
        int scr;
        Scanner sc = new Scanner(System.in);
        System.out.print("시험 점수 입력 : ");
        scr = sc.nextInt();

        System.out.println("점수 : " + scr);

        if(scr>=90){
            System.out.println("A 학점");
        }else if(scr >= 80){
            System.out.println("B 학점");
        }else if(scr >= 70){
            System.out.println("C 학점");
        }else if(scr >= 60){
            System.out.println("D 학점");
        }else if(scr < 60){
            System.out.println("F 학점");
        }

    }
}
