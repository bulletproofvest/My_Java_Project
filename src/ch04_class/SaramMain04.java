package ch04_class;

public class SaramMain04 {
    public static void main(String[] args) {
        Saram04 soo = new Saram04();
        soo.display();

        Saram04 hee = new Saram04("박영희", 162.5, 52.5, "퀄트", "AB");
        hee.display();

        Saram04 yusin = new Saram04("김유신", 189.3, 43,"A");
        yusin.display();

        Saram04 choi = new Saram04();
        choi.display();
    }
}
