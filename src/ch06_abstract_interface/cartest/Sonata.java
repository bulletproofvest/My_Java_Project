package ch06_abstract_interface.cartest;

public class Sonata extends Car{
    protected String maker;

    public Sonata(String name, int price, Key key, String maker) {
        super(name, price, key);
        this.maker = maker;
    }

    @Override
    public String toString() {
        String message = "메이커 : " + maker;
        return super.toString() + message;
    }

    @Override
    public void display() {
        String message = getName() + "의 현재 속도 : " + super.speed + "km";
        System.out.println(message);
    }

    @Override
    public void speedUp(int speed) {
        super.speed += speed;
        super.speed = super.checkSpeed();
    }

    @Override
    public void speedDown(int speed) {
        super.speed -= speed;
    }
}
