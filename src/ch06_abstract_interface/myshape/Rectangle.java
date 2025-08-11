package ch06_abstract_interface.myshape;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String linecolor, String fillcolor, double width, double height) {
        super(linecolor, fillcolor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea(){
        return width * height;
    }

    @Override
    public double calcPerimeter() {
        return (width + height) * 2.0;
    }

    @Override
    public void display() {
        super.area = this.calcArea();
        super.perimeter = this.calcPerimeter();
        System.out.println("사각형 정보");
        System.out.println("면적 : " + super.area);
        System.out.println("둘레 : " + super.perimeter);
    }
}
