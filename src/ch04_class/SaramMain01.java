package ch04_class;

public class SaramMain01 {
    public static void main(String[] args) {
        Saram01 yusin = new Saram01();

        yusin.nationality = "대한민국";
        yusin.name = "김유신";
        yusin.height = 172.5;
        yusin.weight = 75.0;
        yusin.hobby = "당구";
        yusin.blood = "AB";

        yusin.display();

        String message = yusin.showGenderInfo(1);
        System.out.println(message);

        message = yusin.showBmilnfo();
        System.out.println(message);



    }
}
