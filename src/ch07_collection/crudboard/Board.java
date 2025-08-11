package ch07_collection.crudboard;

// 이 클래스는 객체 1개를 생성해 내기 위한 탬플릿 클래스로써 웹 프로그래밍에서는 이를 bean 클래스라고 부릅니다.

/* bean class
맴버 변수는 private으로 선언
기본 생성자(매개 변수가 없는 생성자)를 가짐
getter/setter 메서드 존재
 */
public class Board {

    private int no;
    private String title;
    private String writer;
    private String regdate;
    private int readcount;

    // 생성자, getter, setter, toStraing, apthn


    public Board() {} // 기본 생성자

    public Board(int no, String title, String writer, String regdate, int readcount) {
        this.no = no;
        this.title = title;
        this.writer = writer;
        this.regdate = regdate;
        this.readcount = readcount;
    }

    // Object 클래스에 기본으로 정의된 메서드 : toString
    // 객체를 문자열로 표현할 때 호출
    @Override
    public String toString() {
        return "Board{" +
                "no=" + no +
                ", title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                ", regdate='" + regdate + '\'' +
                ", readcount=" + readcount +
                '}';
    }

    public int getNo() {
        return no;
    }

    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;
    }

    public String getRegdate() {
        return regdate;
    }

    public int getReadcount() {
        return readcount;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public void setReadcount(int readcount) {
        this.readcount = readcount;
    }
}
