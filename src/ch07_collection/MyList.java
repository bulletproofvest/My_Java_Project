package ch07_collection;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<String> coffeeList = new ArrayList<String>();
        // 요소를 String으로 받아들이겠다는 뜻

        coffeeList.add("아메리카노");
        coffeeList.add("카페라떼");
        coffeeList.add("에스프레소");
        coffeeList.add("마키야또");
        coffeeList.add("카페라떼");
        // list에 add(추가) 한 거

        int idx = -1; // 인덱스 값 -1로 초기화
        String findData = "카페라떼"; // findData 초기화

        idx = coffeeList.indexOf(findData); // coffeeList의 findData 인덱스 값을 idx에 넣음
        System.out.println(idx);

        idx = coffeeList.lastIndexOf(findData);
        System.out.println(idx);

        findData = "카푸치노";
        idx = coffeeList.indexOf(findData);
        System.out.println(idx);

        if(coffeeList.indexOf(findData) == -1){ // 만약 coffeeList의 findData인덱스 값이 -1이 아니라면
            // 왜? -1이면 초기화한 값이 변하지 않은 것이기 때문에 List에 findData가 없다는 뜻
            coffeeList.add(2,findData); // 없으면 2인덱스에 findData 삽입
        }

        System.out.println("확장 for 구문을 이용한 출력");
        // 확장 for은 list의 타입에 해당되는 변수 하나를 만듦. 그 변수에 list의 값을 하나씩 다 넣어서 돌림 -> list size 만큼 돌아간다는 뜻임
        for(String coffee:coffeeList){
            System.out.print(coffee + "\t");
        }
        System.out.println();

        findData = "콜드 브루";
        coffeeList.set(5, findData); // list에서 set은 다시 재정의 하겠다는 뜻. add는 추가/ set은 재정의

        findData = "카푸치노";
        coffeeList.remove(findData); // list에서 remove는 리스트에 있는값을 지우겠다는 뜻

        coffeeList.add(findData);

        for(String coffee:coffeeList){
            System.out.print(coffee + "\t"); // coffee에 coffeList값을 죄다 넣어서 돌리겠다. -> 출력을 위해
        }
        System.out.println();

        System.out.println("일반 for 구문으로 요소 출력하기");
        // list의 size만큼 for문을 돌리고 그걸 출력. 어떻게? -> 인덱스 번호를 붙여서 List값을 가져옴
        for (int i = 0; i < coffeeList.size(); i++) {
            System.out.print(coffeeList.get(i) + "\t");
            // 오키 이햏
        }
        System.out.println();
        System.out.println("요소 크키 : " + coffeeList.size());
    }
}
