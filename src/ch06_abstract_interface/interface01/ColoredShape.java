package ch06_abstract_interface.interface01;

public class ColoredShape implements Color, Shape{
    private String shape;
    private String color;

    public ColoredShape(String shape, String color){
        this.shape = shape;
        this.color = color;
    }


    @Override
    public void fill() {
        System.out.println(shape + "에 " + color + "색을 채웁니다.");
    }

    @Override
    public void draw() {
        System.out.println(color + "색으로 칠해진 " + shape + "을(를) 그립니다.");
    }
}
