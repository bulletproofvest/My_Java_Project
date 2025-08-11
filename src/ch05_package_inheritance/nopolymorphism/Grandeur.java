package ch05_package_inheritance.nopolymorphism;

public class Grandeur extends CarManager {
    private double fuel;

    public Grandeur(String model, int price, double fuel) {
        super(model, price);
        this.fuel = fuel;
    }

    @Override
    public void showCarInfo() {
        super.showCarInfo();
        System.out.println("연비 : " + fuel);

        String comment;
        if (fuel >= 20) {
            comment = "excellent";
        } else if (fuel >= 15) {
            comment = "good";
        } else {
            comment = "poor";
        }

        System.out.println("연비 멘트 : " + comment);
    }
}
