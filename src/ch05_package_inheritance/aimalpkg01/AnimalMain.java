package ch05_package_inheritance.aimalpkg01;

import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {
        Animal01 animal01 = new GoldFish01("금붕어", 2, "거실 어항", 10, 2);
        Animal01 animal02 = new Lion01("라이언", 15, "세렝게티", 10, 4);
        Animal01 animal03 = new Eagle01("독수리", 20, "푸른 창공", 50, 2);
        Animal01[] animal = {animal01, animal02, animal03};
        /*Animal01[] animal = {
        new GoldFish01("금붕어", 2, "거실 어항", 10, 2),
        new Lion01("라이언", 15, "세렝게티", 10, 4),
        new Eagle01("독수리", 20, "푸른 창공", 50, 2)
        };*/

        for (int i = 0; i < animal.length; i++) {
            System.out.println(animal[i].toString()); // 안쪽에서 출력하도록

            // instanceof
            if (animal[i] instanceof Lion01) {
                ((Lion01) animal[i]).run();
                System.out.println();
            } else if (animal[i] instanceof GoldFish01) {
                ((GoldFish01) animal[i]).swim();
                System.out.println();
            } else if (animal[i] instanceof Eagle01) {
                ((Eagle01) animal[i]).fly();
                System.out.println();
            } else {
            }
        }

    }
}
