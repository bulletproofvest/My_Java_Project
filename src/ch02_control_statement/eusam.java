import javax.swing.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

class Person{

    String name;
    int age;
    double height;
    double weight;
    String blood;
    char munja;
    boolean bool;

    public Person(String name, int age, double height, double weight, String blood, char munja, boolean bool){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.blood = blood;
        this.munja = munja;
        this.bool = bool;
    }

    public void printInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("키: " + height);
        System.out.println("몸무게: " + weight);
        System.out.println("혈액형: " + blood);
        System.out.println("문자: " + munja);
        System.out.println("논리값: " + bool);
    }
}

/*

public class InfoSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Person> personMap = new HashMap<>();

        while (true) {
            System.out.print("이름을 입력하세요 (종료하려면 'exit' 입력): ");
            String inputName = scanner.nextLine();

            if (inputName.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (personMap.containsKey(inputName)) {
                System.out.println("이미 등록된 이름입니다. 정보는 다음과 같습니다:");
                personMap.get(inputName).printInfo();
            } else {
                System.out.println("등록되지 않은 이름입니다. 정보를 입력해주세요.");

                System.out.print("나이: ");
                int age = scanner.nextInt();

                System.out.print("키: ");
                double height = scanner.nextDouble();

                System.out.print("몸무게: ");
                double weight = scanner.nextDouble();

                scanner.nextLine(); // 개행 문자 제거

                System.out.print("혈액형: ");
                String blood = scanner.nextLine();

                System.out.print("문자 1개 입력: ");
                char munja = scanner.nextLine().charAt(0);

                System.out.print("논리값 (true/false): ");
                boolean bool = scanner.nextBoolean();
                scanner.nextLine(); // 개행 제거

                Person p = new Person(inputName, age, height, weight, blood, munja, bool);
                personMap.put(inputName, p);

                System.out.println("정보가 저장되었습니다.");
            }

            System.out.println();
        }

        scanner.close();
    }
} */




public class eusam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Person> personMap = new HashMap<>();

        while(true){

            System.out.print("이름 입력:");
            String inputName = sc.nextLine();

            if(inputName.equalsIgnoreCase("exit")){
                System.out.println("종료합니다.");
                break;
            }

            if(personMap.containsKey(inputName)){
                System.out.println("이미 등록된 이름입니다. 정보는 다음과 같습니다.");
                personMap.get(inputName).printInfo();

                continue;

            }

            else{

                System.out.print("나이:");
                int age = sc.nextInt();
                System.out.print("키:");
                double height = sc.nextDouble();
                System.out.print("몸무게:");
                double weight = sc.nextDouble();
                System.out.print("혈액형:");
                String blood = sc.next();
                System.out.print("문자:");
                char munja = sc.next().charAt(0);
                System.out.print("true 또는 false:");
                boolean bool = sc.nextBoolean();

                sc.nextLine();

                Person p = new Person(inputName, age, height, weight, blood, munja, bool);
                personMap.put(inputName, p);


            }
        }

    }
}