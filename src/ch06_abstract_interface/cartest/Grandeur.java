package ch06_abstract_interface.cartest;

public class Grandeur extends Car{
    protected double fuel;
    protected String remark;

    public Grandeur(String name, int price, Key key, double fuel) {
        super(name, price, key);
        this.fuel = fuel;

        if(this.fuel >= 20.0){
            this.remark = "excellent";
        }else if(this.fuel >= 15.0){
            this.remark = "good";
        }else{
            this.remark = "poor";
        }
    }

    //
    @Override
    public String toString() {
        String message = "연비 : " + fuel;
        message += "\n연비 메모 : " + remark;
        return super.toString() + message;
    }

    @Override
    public void display() {
        String message = getName() + "의 현재 속도 : " + super.speed * 1/1.6 + "mile";
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
