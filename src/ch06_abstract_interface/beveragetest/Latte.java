package ch06_abstract_interface.beveragetest;

public class Latte extends Beverage {
    private String milkType;

    public Latte(String name, double price, String milkType) {
        super(name, price);
        this.milkType = milkType;
    }

    @Override
    public void drink() {
        System.out.println("부드럽고 크리미한 " + name + "를 마십니다.");
    }

    @Override
    public void make() {
        super.getProductName();
        System.out.println("우유넣고 알아서 잘");
    }

    @Override
    public String toString(){
        String message = "우유 : " + milkType;
        return super.toString() + message;
    }
}
