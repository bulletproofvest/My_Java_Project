package ch05_package_inheritance.animalpkg02;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal02[] animal02 = {
                new GoldFish02("금붕어", 2, "거실 어항", 10, 2),
                new Lion02("라이언", 15, "세렝게티", 10, 4),
                new Eagle02("독수리", 20, "푸른 창공", 50, 2)};

        for (int i = 0; i < animal02.length; i++) {
            animal02[i].showInfo();

            if(animal02[i] instanceof GoldFish02){
                ((GoldFish02)animal02[i]).swim();
                System.out.println();

            } else if (animal02[i] instanceof Lion02) {
                ((Lion02) animal02[i]).run();
                System.out.println();

            } else if (animal02[i] instanceof Eagle02) {
                ((Eagle02) animal02[i]).fly();
                System.out.println();

            } else {

            }
        }
    }
}
