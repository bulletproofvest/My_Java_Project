package ch05_package_inheritance.nopolymorphism;

public class CarManager {
    protected String model;
    protected int price;

    public CarManager(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public void showCarInfo() {
        System.out.println("가격 : " + price + "원");
        System.out.println("차량 : " + model + " 시승");
        double tax = price >= 150 ? price * 0.1 : price * 0.05;
        System.out.println("세금 : " + tax + "원");
    }
}