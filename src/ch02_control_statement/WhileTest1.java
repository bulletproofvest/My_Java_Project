package ch02_control_statement;

import java.util.Scanner;

public class WhileTest1 {
    public static void main(String[] args) {
        int dan = 0;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 단을 출력할까요? : ");
        dan = sc.nextInt();
        
        while(i<10){
            System.out.println(dan + " * " + i + " = " + dan * i);
            i++;
        }
    }
}
