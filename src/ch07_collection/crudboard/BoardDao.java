package ch07_collection.crudboard;

import java.util.ArrayList;
import java.util.List;

// 데이터 베이스에게 데이터를추가/수정/삭제 등의 작업을 요청해주는 중간 <middle=ware> 성격의 크래스

/* DAO (Data Access Object) class
 데이터베이스와 직접 연결해서 데이터를 조작하는 클래스
 데이터를 추가, 조회, 수정, 삭제하는 기능을 담당
*/

public class BoardDao {

    private List<Board> boardList = null; // 게시물을 담는 톰 bottle
    public BoardDao(){
        this.boardList = new ArrayList<Board>();
    }

    public int insertData(Board board){
        System.out.println("게시물 번호 " + board.getNo() + "이(가) 추가됩니다. 0");
        boardList.add(board);
        return 1;
    }

    public int getSize() {
        return boardList.size();
    }

    public List<Board> selectAll() {
        return boardList;
    }

    public Board getOne(int findId) {
        Board findData = null;

        for(Board bean:boardList){
            if(bean.getNo() == findId){
                findData = bean;
                break;
            }
        }

        return findData;
    }

    public int removeData(int deleteId) {
        int cnt = -1; // -1은 '발견' 여부를 나타내는 flag 변수

        for(Board bean:boardList){
            if(deleteId == bean.getNo()){
                this.boardList.remove(bean);
                cnt = 1;
                break;
            }else{

            }
        }

        return cnt;
    }

    public void removeAllBoards() {
        this.boardList.clear();
    }
}
