package ch06_abstract_interface.myshape;

public class Circle extends Shape{
    private double radius;
    private double xpos;
    private double ypos;


    public Circle(String linecolor, String fillcolor, double radius, double xpos, double ypos) {
        super(linecolor, fillcolor);
        this.radius = radius;
        this.xpos = xpos;
        this.ypos = ypos;
    }

    @Override
    public double calcArea(){
        return 3.14 * radius * radius;
    }

    @Override
    public double calcPerimeter() {
        return 2.0 * 3.14 * radius;
    }

    @Override
    public void display() {
        super.area = this.calcArea();
        super.perimeter = this.calcPerimeter();
        System.out.println("원 정보");
        System.out.println("면적 : " + super.area);
        System.out.println("둘레 : " + super.perimeter);

        System.out.println("원 중심 : " + xpos + ", "+ ypos);
    }
}
