package ch01_variable_operator;


public class MyBox {
    public static void main(String[] args) {
        double width = 10.0;
        double height = 5.0;
        double area;
        double perimeter;

        area = width * height;
        perimeter = (width + height) *2;

        System.out.println("너비 : " + width);
        System.out.println("높이 : " + height);
        System.out.println("사각형의 넓이 : " + area);
        System.out.println("사각형의 둘레 : " + perimeter);
        System.out.println("대각선 길이 : " + Math.sqrt((width*width) + (height*height)));
    }
}
