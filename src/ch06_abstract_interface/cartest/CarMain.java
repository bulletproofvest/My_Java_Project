package ch06_abstract_interface.cartest;

public class CarMain {
    public static void main(String[] args) {
        Car[] mycar = {
            new Avante("아반떼", 100, Key.KET, "가장 많은 판매"),
            new Sonata("소나타", 300, Key.SMART, "Hyundai"),
            new Grandeur("그랜져", 200, Key.SMART, 9.5)
        };

        for (int i = 0; i < mycar.length; i++) {
            System.out.println("======================");

            mycar[i].turnOn();

            Radio.play(Frequency.FM, 91.9);

            mycar[i].sayHello(mycar[i].getName(),2);
            // 객체 출력한다는 의미는 암시적으로 toString() 메소드를 호출

            System.out.println(mycar[i].toString());

            mycar[i].display();

            mycar[i].speedUp(20);
            mycar[i].display();

            mycar[i].speedUp(Speed.ALLOWED_MAX_SPEED);
            mycar[i].display();

            mycar[i].speedDown(15);
            mycar[i].display();

            mycar[i].turnOff();
        }
    }
}
