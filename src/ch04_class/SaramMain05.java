package ch04_class;

import java.util.ArrayList;
import java.util.List;

public class SaramMain05 {
    public static void main(String[] args) {
        // List<Saram05> saramList = new ArrayList<>();

        int[] arr = new int[3];
        // Saram05 : 내가 만든 새로운 타입임
        Saram05[] saram = new Saram05[2]; // 배열 정의

        saram[0] = new Saram05("이순신", 180.5, 75.0, "농구", "AB"); // 0번째 객체 생성
        saram[1] = new Saram05("김유신", 180.2, 70.0, "0");

        for (int i = 0; i < saram.length; i++) {
            saram[i].display();
        }

        Saram05[] mylist = {
                new Saram05("박영희", 159.3, 13.0, "수영", "B"),
                new Saram05("최진철", 167.1, 54.2, "A")
        };
        for (int i = 0; i < mylist.length; i++) {
            mylist[i].display();
        }
    }
}
