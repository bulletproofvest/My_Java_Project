package ch02_control_statement;

import java.util.Scanner;

public class Exam4_18 {
    public static void main(String[] args) {
        int n = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("단, 정수 n은 2이상의 임의의 정수라고 가정하고\n\n임의의 정수 입력 : ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + "의 제곱은 "+i*i+"입니다.");
        }

        int su01 = 3;
        int su02 = 7;
        int sum = 0;

        for (int i = su01; i <= su02; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}
