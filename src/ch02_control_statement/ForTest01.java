package ch02_control_statement;

import java.util.Scanner;

public class ForTest01 {
    public static void main(String[] args) {
        int a = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 단을 출력할까요? : ");
        a = sc.nextInt();


        for (int i = 1; i < 10; i++) {
            sum = a * i;
            System.out.println(a + " * " + i + " = " + sum);
        }
    }
}
