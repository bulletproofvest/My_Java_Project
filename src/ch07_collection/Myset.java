package ch07_collection;

import java.util.HashSet;
import java.util.Set;

public class Myset {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<Object>();

        set.add("아메리카노");
        set.add(123);
        set.add(false);
        set.add("아메리카노");

        set.clear();


        set.add("아메리카노");
        set.add("에스프레소");
        set.add("믹스커피");
        set.add("카페라떼");

        String findData = "카푸치노";
        System.out.println(findData + "존재여부 : " + set.contains(findData));
        System.out.println("요소 크키 : " + set.size());

        if(set.contains(findData)){
            System.out.println(findData + "있음");
        }else {
            System.out.println("없음");
        }

        findData = "마키아또";

        // '마키아또'가 존재하늕 확인하고, 없으면 추가
        if(set.contains(findData)){
            System.out.println(findData + "있음");
        }else {
            System.out.println("없음");
            set.add("마키아또");
        }

        System.out.println("요소 크키 : " + set.size());

        // 믹스커피가 존재하면 삭제하고 '삭제 성공'이라는 문구 출력
        // 단, remove 사용
        String som = "믹스커피";

        if(set.contains(som)){
            set.remove("믹스커피");
            System.out.println("삭제 성공");
        }else {
            System.out.println("존재하지 않음");
        }

        // for(타입 단수이름:복수이름){...}

        for(Object item:set){
            System.out.println(item);
        }

    }
}
