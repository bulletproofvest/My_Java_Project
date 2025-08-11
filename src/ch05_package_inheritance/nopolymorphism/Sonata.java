package ch05_package_inheritance.nopolymorphism;

public class Sonata extends CarManager {
    private String maker;

    public Sonata(String model, int price, String maker) {
        super(model, price);
        this.maker = maker;
    }

    @Override
    public void showCarInfo() {
        super.showCarInfo();
        System.out.println("메이커 : " + maker);
    }
}
