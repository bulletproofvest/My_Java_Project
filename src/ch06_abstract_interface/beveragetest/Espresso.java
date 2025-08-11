package ch06_abstract_interface.beveragetest;

public class Espresso extends Beverage {
    private int shot;

    public Espresso(String name, double price, int shot) {
        super(name, price);
        this.shot = shot;
    }

    @Override
    public void drink() {
        System.out.println("맛이 진하고 강렬한 " + name + "를 마십니다.");
    }

    @Override
    public void make() {
        super.getProductName();
        System.out.println("기계가 알아서 만들어 줌");
    }

    @Override
    public String toString(){
        String message = "샷 개수 : " + shot;
        return super.toString() + message;
    }
}
