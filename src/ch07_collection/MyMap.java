package ch07_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {
    public static void main(String[] args) {
        Map<String, Integer> teamMap = new HashMap<String, Integer>();
        // String 타입의 Key와 Integer타입의 Val을 정의 -> Map이름은 teamMap임


        teamMap.put("lg", 1);
        teamMap.put("ssg", 2);
        teamMap.put("두산", 3);
        teamMap.put("kt", 4);
        // Map에 추가하려면 put을 써야함

        String findItem = "nc";
        boolean bool = teamMap.containsKey(findItem); // teamMap의 키들 중 findItem이 존재하는지 검색/ 반환값이 boolean값이므로 그 값을 넣어줌
        System.out.println(findItem + "팀이 목록에 있나요? " + bool);

        // 'nc'팀이 존재하는지 체크하고, 없으면 순위 5위로 추가

        if(!teamMap.containsKey(findItem)){
            teamMap.put(findItem, 5);
        }

        System.out.println(teamMap);

        // 순위가 6위인 팀이 존재하는지 체크하고, 존재하지 않으면 'kia'를 추가
        // 존재 여부를 적절한 문구로 출력

        final int pos = 6;

        // valus의 값들 중에서 pos값이 있는지 검색
        if(teamMap.containsValue(pos) == true){
            System.out.println(pos + "위 팀은 존재합니다.");
        }else{
            System.out.println(pos + "위 팀이 존재하지 않아 추가합니다.");
            teamMap.put("kia", pos);
        }
        System.out.println(teamMap);

        String[] teams = {"롯데", "한화", "키움", "삼성"};

        for (int i = 0; i < teams.length; i++) {
            teamMap.put(teams[i], i+7);
        }

        findItem = "한화";
        Integer rank = teamMap.get(findItem);

        if(rank == null){
            System.out.println(findItem + "팀은 존재하지 않습니다.");
        }else {
            String message = "팀명: " + findItem + ", 순위: " + rank;
            System.out.println(message);
        }

        System.out.println(teamMap.toString());

        System.out.println("다음 팀들의 순위 정보를 출력해주세요.");
        String[] findTeams = {"두산", "kt", "빙그레"};

        for(String one:findTeams){ // 찾고 있는 팀을 one에다가 하나씩 넣어서 돌림
            rank = teamMap.get(one); // teamMap에서 one의 값을 가져와 넣음

            if(rank != null){
                String message = "팀명: " + one + ", 순위: " + rank;
                System.out.println(message);
            }else{
                System.out.println(one + "팀이 존재하지 않아서 추가합니다.");
                teamMap.put(one, 11);
            }
        }

        System.out.println();
        System.out.println("전체 목록을 출력");
        Set<String> items = teamMap.keySet();

        for(String key:items){
            String message = key + " 팀은 순위가 " +  teamMap.get(key) + "위입니다.";
            System.out.println(message);
        }

        System.out.println(teamMap.toString());
        System.out.println("요소 크기 : " + teamMap.size());
        System.out.println();

        teamMap.clear();

        if(teamMap.isEmpty()){ // be동사는 boolean값 반환
            System.out.println("teamMap is empty");
        }else{
            System.out.println("teamMap is not empty");
        }
    }
}
