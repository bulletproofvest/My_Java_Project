package ch05_package_inheritance.animalpkg02;

public class Lion02 extends Animal02{
    private int leg;
    public Lion02(String name, int lifespan, String habitat, int speed, int leg) {
        super(name, lifespan, habitat, speed);
        this.leg = leg;
    }

    public void run(){
        System.out.println(getName() + "가 " + getSpeed() + "의 속도로 달려 갑니다.");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        String message =  getName() + "의 다리 개수는 " + leg + "개 입니다.";
        System.out.println(message);
    }
}
