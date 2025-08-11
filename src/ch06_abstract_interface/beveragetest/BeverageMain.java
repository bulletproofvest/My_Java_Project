package ch06_abstract_interface.beveragetest;

public class BeverageMain {
    public static void main(String[] args) {
        Beverage[] beverages = {new Americano("아메리카노", 4000.0, 250.0),
                new Espresso("마이뿌레소", 2000.0, 1),
                new Latte("latte", 3000.0, "바나나 우유")
        };

        for (int i = 0; i < beverages.length; i++) {
            System.out.println("==========================");
            beverages[i].showData();
            beverages[i].drink();
            beverages[i].make();
        }

        for (int i = 0; i < beverages.length; i++) {
            System.out.println("==========================");
            System.out.println(beverages[i].toString());
        }

    }
}
