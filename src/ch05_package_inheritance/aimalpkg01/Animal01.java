package ch05_package_inheritance.aimalpkg01;

public class Animal01 {
    private String name;
    private int lifespan;
    private String habitat;
    private int speed;

    public Animal01(String name, int lifespan, String habitat, int speed){
        this.name = name;
        this.lifespan = lifespan;
        this.habitat = habitat;
        this.speed = speed;
    }

    public String getName(){
        return name;
    }

    public int getSpeed(){
        return speed;
    }

    @Override
    public String toString(){
        String message = "평균 수명이 " + lifespan + "인 " + name + "의 서식지는 " + habitat +"입니다.";
        return message;
    }
    /*
    @Override
    public void showInfo(){
        String message =  "평균 수명이 " + lifespan + "인 " + name + "의 서식지는 " + habitat +"입니다.";
        System.out.println(message);
    }
    */



}
