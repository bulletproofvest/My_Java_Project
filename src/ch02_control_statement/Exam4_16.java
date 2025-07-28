package ch02_control_statement;

import java.util.Scanner;

public class Exam4_16 {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("별 출력 개수 입력 : ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            if(i%5==0){
                System.out.println();
            }
        }

        int a;
        System.out.print("\n한줄에 별 몇 개씩 출력할까요? : ");
        a = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            if(i%a==0){
                System.out.println();
            }
        }

    }
}
