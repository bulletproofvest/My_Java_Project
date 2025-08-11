package ch05_package_inheritance.mysport;

public class BaseBall extends Sport{
    private int innings;
    private double hitrate;

    public BaseBall(String name, int entry, int innings, double hitrate){
        super(name, entry);
        this.innings = innings;
        this.hitrate = hitrate;
    }

    public void display() {
        super.show();
        System.out.println("이닝 : " + innings);
        System.out.println("타율 : " + hitrate);
    }
}
