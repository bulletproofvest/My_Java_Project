package ch05_package_inheritance.nopolymorphism;

public class Avante extends CarManager {
    private String comment;

    public Avante(String model, int price, String comment) {
        super(model, price);
        this.comment = comment;
    }

    @Override
    public void showCarInfo() {
        super.showCarInfo();
        System.out.println("코멘트 : " + comment);
    }
}
