package ch05_package_inheritance.aimalpkg01;

public class GoldFish01 extends Animal01{
    private int gill;

    public GoldFish01(String name, int lifespan, String habitat, int speed, int gill) {
        super(name, lifespan, habitat, speed);
        this.gill = gill;
    }
    // swim

    @Override
    public String toString(){
        String message = "\n" + getName() + "의 아가미수는 " + gill + "개 입니다.";
        return super.toString() + message;
    }
    /*
    @Override
    public void showInfo(){
        showInfo();
        String message = getName() + "의 아가미수는 " + gill + "개 입니다.";
        System.out.println(message);
    }
    */

    public void swim(){
        System.out.println(getName() + "이(가) " + getSpeed() + "이 속도로 헤엄칩니다.");
    }


}
