package ch05_package_inheritance.nopolymorphism;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void ride(CarManager car) {
        System.out.println("차주 : " + name);
        car.showCarInfo();
    }
}
