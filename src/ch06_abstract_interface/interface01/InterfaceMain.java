package ch06_abstract_interface.interface01;

public class InterfaceMain {
    public static void main(String[] args) {
        ColoredShape coloredRectangle = new ColoredShape("사각형", "빨간");
        coloredRectangle.draw();
        coloredRectangle.fill();
        System.out.println();
        ColoredShape coloredCircle = new ColoredShape("원", "파란");
        coloredCircle.draw();
        coloredCircle.fill();
    }
}
