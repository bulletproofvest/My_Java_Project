package ch06_abstract_interface.beveragetest;

public class Americano extends Beverage{
    private double waterAmount;


    public Americano(String name, double price, double waterAmount) {
        super(name, price);
        this.waterAmount = waterAmount;
    }

    @Override
    public void drink() {
        System.out.println(name + "를(을) 홀짝 홀짝 마십니다.");
    }

    @Override
    public void make() {
        super.getProductName();
        System.out.println("물이랑 섞어서 잘");
    }

    @Override
    public String toString(){
        String message = "물의 양 : " + waterAmount;
        return super.toString() + message;
    }
}
