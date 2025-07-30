package ch04_class;

public class Saram01 {
    String nationality;
    String name;
    double height;
    double weight;
    String hobby;
    String blood;

    String showGenderInfo(int a){
        String gender = "";
        if(a == 2 || a == 4){
            gender = "여자";
        }else {
            gender = "남자";
        }
        String messeage = name + "님은 " + gender + "이군요.";
        return messeage;
    }

    String showBmilnfo(){
        double newHeight = height/100.0; // cm -> m 변환
        double rate = weight/(newHeight*newHeight);
        String bmi = "";

        if(rate>=25.00){
            bmi = "비만";
        }else if(rate >= 23.00){
            bmi = "과체중";
        }else if(rate >= 18.50){
            bmi = "정상";
        }else{
            bmi = "저체중";
        }

        String messeage = name + "님은 " + bmi + "입니다.";
        return messeage;
    }

    void display(){

        System.out.println("국적 : " + nationality);
        System.out.println("이름 : " + name);
        System.out.println("키 : " + height);
        System.out.println("몸무게 : " + weight);
        System.out.println("취미 : " + hobby);
        System.out.println("혈액형 : " + blood);

    }
}

