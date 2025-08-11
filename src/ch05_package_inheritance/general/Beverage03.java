package ch05_package_inheritance.general;

public class Beverage03 { // 슈퍼클래스
    private String name;
    private double price;


    public Beverage03(String name, double price) { // 접근지정자 반환타입 생성자이름(매개변수){...}
        this.name = name;
        this.price = price;
    }

    protected void showInfo() {
        System.out.println("음료 이름 : " + name);
        System.out.println("가격 : " + price);
    }
}
