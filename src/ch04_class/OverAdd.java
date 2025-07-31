package ch04_class;

public class OverAdd {


    public int OverAdd(int a, int b){
        int num = a + b;
        System.out.println("정수형 : " + num);
        return num;
    }
    public double OverAdd(double a, double b){
        double num = a + b;
        System.out.println("실수형 : " + num);
        return num;
    }
    public int OverAdd(int a, int b, int c){
        int num = a + b + c;
        System.out.println("반환 결과 : " + num);
        return num;
    }

}
