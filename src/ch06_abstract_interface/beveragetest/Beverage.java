package ch06_abstract_interface.beveragetest;

public abstract class Beverage {
    protected String name;
    protected double price;

    public abstract void drink();
    public abstract void make();

    public Beverage(String name, double price){
        this.name = name;
        this.price = price;
    }

    protected final void showData(){
        System.out.println("음료 " + name + "의 단가는 " + price + "입니다.");
    }

    public final void getProductName(){
        System.out.println(name + " 제조법");
    }

    @Override
    public String toString(){
        String message = "이름 : " + name;
        message += "단가 : " + price;
        return message;
    }
}
