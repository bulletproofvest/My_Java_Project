package ch02_control_statement;

public class While01 {
    public static void main(String[] args) {
        int i = 1;
        int total = 0;
        while(i <11){
            total += i;
            i++;
        }
        System.out.println(total);

        i = 1; total = 0;

        while(i<101){
            total += i;
            i += 3;
        }
        System.out.println(total);

        i = 97; total = 0;

        while(i>1){
            total += i;
            i -= 5;
        }
        System.out.println(total);

        i = 1; total = 0;

        while(i<97){
            total += i*i;
            i += 5;
        }
        System.out.println(total);

        i = 1; total = 0;

        while(i<6){
            total += i*(i+1);
            i++;
        }
        System.out.println(total);
    }
}
