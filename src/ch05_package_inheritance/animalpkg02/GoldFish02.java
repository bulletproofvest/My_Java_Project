package ch05_package_inheritance.animalpkg02;

public class GoldFish02 extends Animal02{
    private int gill;

    public GoldFish02(String name, int lifespan, String habitat, int speed, int gill){
        super(name, lifespan, habitat, speed);
        this.gill = gill;
    }

    public void swim(){
        System.out.println(getName() + "가 " + getSpeed() + "의 속도로 헤엄칩니다.");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        String message =  getName() + "의 아가미수는  " + gill + "개 입니다.";
        System.out.println(message);
    }
}
