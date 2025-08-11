package ch05_package_inheritance.mybeverage;

// 슈퍼 클래스이기도 하지만 서브 클래스임
// object 클래스
// Beverage04의 상위가 object 클래스
public class Beverage04 {
    private String name;
    private double price;

    // 메소드 온닉화 : 오버라이딩시, 본의 아니게 수퍼 클래스의 메소드가 숨겨 지는 현상을 일컫는 말
    @Override // @으로 시작하는 항목들을 어노테이션(Annotation)이라고 부름
    public String toString(){
        String message = "품명: " + this.name + ", 단가: " + this.price;
        return message;
    }

    public String getName() {
        return name;
    }

    public Beverage04(){}

    protected void showInfo(){
        System.out.println("이름 : " + name);
        System.out.println("단가 : " + price);
    }

    public Beverage04(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
