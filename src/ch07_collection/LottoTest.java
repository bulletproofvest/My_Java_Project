package ch07_collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoTest {
    public static void main(String[] args) {
        Set<Integer> lotto = new HashSet<Integer>();
        // 중복 없는 정수 집합을 만들고 싶을 때 : Integer
        Random rand = new Random();
        // random 코드 사용
        int secondno  = 0;


        // 가독성, 간결성, 효율성, 유지보수성, 확장성

        // 숫자 6개 lotto 저장
        while (lotto.size() < 6){
            lotto.add(rand.nextInt(45) + 1);
        }

        // lotto에 없는 숫자일 경우?
        do{
            secondno = rand.nextInt(45) + 1;
        }while (lotto.contains(secondno));


        System.out.println(lotto);
        System.out.println(secondno);

    }
}
