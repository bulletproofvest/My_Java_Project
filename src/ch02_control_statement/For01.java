package ch02_control_statement;

public class For01 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i <= 10; i++) {
            total += i;
        }

        System.out.println(total);

        total = 0;

        for (int i = 1; i <= 100; i += 3) {

            total += i;
            
        }
        System.out.println(total);

        total = 0;

        for (int i = 97; i >= 2 ; i -= 5) {

            total = total + i;

        }
        System.out.println(total);

        total = 0;

        for (int i = 1; i <= 96 ; i += 5) {

            total += i*i;

        }
        System.out.println(total);

        total = 0;

        for (int i = 1; i < 6 ; i++) {

            total += i* (i+1);

        }
        System.out.println(total);

    }
}
