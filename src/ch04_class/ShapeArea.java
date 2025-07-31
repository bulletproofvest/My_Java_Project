package ch04_class;

public class ShapeArea {
    final double PI = 3.141593;

    public void area(int i) {
        double num = i * i * PI;
        System.out.println("원의 면적 : " + num);
    }

    public void area(int i, int i1) {
        int num = i * i1;
        System.out.println("사각형의 면적 : " + num);
    }

    public void area(int i, int i1, int i2) {
        double num = (i + i1) * i2 / 2;
        System.out.println("사다리꼴의 면적 : " + num);
    }
}
