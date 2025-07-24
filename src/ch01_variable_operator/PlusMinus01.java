package ch01_variable_operator;

public class PlusMinus01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c;


        c = ++a + b++;

        System.out.println("a : " +  a);
        System.out.println("b : " +  b);
        System.out.println("b : " +  b);
        System.out.println("c : " +  c);

        c = ++a + --b;

        System.out.println("a : " +  a);
        System.out.println("b : " +  b);
        System.out.println("c : " +  c);

        a = 15;
        b = 12;

        c = --a + --b;

        System.out.println("a : " +  a);
        System.out.println("b : " +  b);
        System.out.println("c : " +  c);

        a = 10;
        b = 20;

        ++a;
        b--;
        c = ++a + b--; //a = 12 / b = 19 (계산 후에 18) 답은 31


        System.out.println("a : " +  a);
        System.out.println("b : " +  b);
        System.out.println("c : " +  c);


    }
}
