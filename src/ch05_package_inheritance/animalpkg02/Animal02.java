package ch05_package_inheritance.animalpkg02;

public class Animal02 {
    private String name;
    private int lifespan;
    private String habitat;
    private int speed;

    public Animal02(String name, int lifespan, String habitat, int speed) {
        this.name = name;
        this.lifespan = lifespan;
        this.habitat = habitat;
        this.speed = speed;
    }

    public void showInfo(){
        String message =  "평균 수명이 " + lifespan + "인 " + name + "의 서식지는 " + habitat +"입니다.";
        System.out.println(message);
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }


}
