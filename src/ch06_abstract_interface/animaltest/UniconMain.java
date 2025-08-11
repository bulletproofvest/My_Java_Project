package ch06_abstract_interface.animaltest;

public class UniconMain {
    public static void main(String[] args) {
        Unicon unidol = new Unicon("유니돌", "M", "당근");
        // Unicon 클래스 타입 끌어와서 생성
        unidol.display();
        unidol.flutter();

        System.out.println();

        Unicon unisoon = new Unicon("유니순", "F", "건초");
        unisoon.display();

        //다형성 테스트
        //Unicon을 Animal, Horse, Brid 타입으로 다뤄봅니다.
        System.out.println();

        Unicon animal = new Unicon("다형성", "M", "사과");
        animal.eat();

        Horse horse = (Horse) animal;
        horse.run();

        Bird bird = (Bird) animal;
        bird.fly();
    }
}
