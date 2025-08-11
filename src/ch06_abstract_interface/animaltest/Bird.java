package ch06_abstract_interface.animaltest;

public interface Bird {
    // interface에 들어가는 접근 지정자는 무조건 public
    // 즉, 인터페이스에서 정의시 final이 자동적으로 정의 => public static final

    final int speed = 300;

    void fly();
    // = public abstract void fly();

    default void flutter(){
        System.out.println("날개를 펄럭입니다.");
    }
}
