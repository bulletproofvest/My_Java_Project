package ch04_class;

public class OverloadMain {
    public static void main(String[] args) {
        int a = 3, b = 5, c = 7;
        double x = 1.1, y = 2.2;
        double z = 7.1;

        OverAdd obj = new OverAdd();

        obj.OverAdd(a, b);

        obj.OverAdd(x, y);

        obj.OverAdd(a, b, c);

        a = 100;
        b = 200;
        obj.OverAdd(a, b);

        x = 5.5;
        y = 3.3;
        obj.OverAdd(x, y);

        obj.OverAdd(a, x);


    }
}
