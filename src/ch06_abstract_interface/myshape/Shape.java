package ch06_abstract_interface.myshape;

public abstract class Shape {
    // 일반화 : 모든 도형에서 사용하는 면적, 둘레, 라인 색상, 채우기 생각 등은 슈퍼 클래스에서 사용
    protected double area; // protected :
    protected double perimeter;
    private String linecolor;
    private String fillcolor;

    // 내용이 정의되지 않는 모델 개념으로, 불완전한 메소드
    public abstract double calcArea(); // 추상 메소드를 담고있는 클래스는 반드시 추상 클래스여야 함
    public abstract double calcPerimeter();
    public abstract void display();

    // 오버라이팅을 하지 못하도록 막고자 할 때 final 사용
    protected final void draw(){
        System.out.println("라인 색상 : " + linecolor);
        System.out.println("채우기 색상 : " + fillcolor);
    }


    public Shape(String linecolor, String fillcolor) {
        this.linecolor = linecolor;
        this.fillcolor = fillcolor;
    }

    public Shape(){

    }

}
