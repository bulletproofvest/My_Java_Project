package ch05_package_inheritance.animalpkg02;

public class Eagle02 extends Animal02{
    private int wing;

    public Eagle02(String name, int lifespan, String habitat, int speed, int wing) {
        super(name, lifespan, habitat, speed);
        this.wing = wing;
    }

    public void fly(){
        System.out.println(getName() + "가 " + getSpeed() + "의 속도로 날아 다닙니다.");
    }

    @Override
    public void showInfo(){
        super.showInfo();
        String message = getName() + "의 날개 개수는 " + wing + "개 입니다.";
        System.out.println(message);
    }
}
