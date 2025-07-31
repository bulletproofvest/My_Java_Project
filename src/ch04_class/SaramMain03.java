package ch04_class;

public class SaramMain03 {
    public static void main(String[] args) {
        Saram03 yusin = new Saram03();

        Saram03 soon = new Saram03();
        yusin.setName("김유신");
        yusin.setHeight(185.3);
        yusin.setWeight(75);
        yusin.setHobby("축구");
        yusin.setBlood("A");

        soon.setName("유관순");
        soon.setHeight(165.2);

        System.out.println("이름 : " + yusin.getName());
        System.out.println("키 : " + yusin.getHeight());
        System.out.println("몸무게 : " + yusin.getWeight());

        System.out.println("이름 : " + soon.getName());
        System.out.println("키 : " + soon.getHeight());

    }
}
