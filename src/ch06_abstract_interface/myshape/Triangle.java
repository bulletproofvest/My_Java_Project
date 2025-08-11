package ch06_abstract_interface.myshape;

public class Triangle extends Shape{
    private double width;
    private double height;

    public Triangle(String linecolor, String fillcolor, double width, double height) {
        super(linecolor, fillcolor);
        this.width = width;
        this.height = height;
    }

    // Implementation : 구체화
    @Override
    public double calcArea(){ // 각 클래스는 각자 맏은 역할을 여기에 구현
        return width * height / 2.0;
    }

    @Override
    public double calcPerimeter() {
        // 삼각형의 둘레 길이를 구하려면, 삼각함수
        return 20.0;
    }

    @Override
    public void display() {
        super.area = this.calcArea();
        super.perimeter = this.calcPerimeter();
        System.out.println("삼각형 정보");
        System.out.println("면적 : " + super.area);
        System.out.println("둘레 : " + super.perimeter);
    }
}
