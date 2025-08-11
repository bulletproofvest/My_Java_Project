package ch06_abstract_interface.cartest;

public abstract class Car implements Display, Radio, Speed{
    protected int speed; // 인스턴스의 기본값 = 0;
    private String name;
    private int price;
    private Key key;

    @Override
    public String toString() {
        String message = "이름 : " + this.name + "\n";
        message += "단가 : " + this.price + "\n";
        message += "열쇠 타입 : " + this.key + "\n";
        message += "한글 이름 : " + this.key.getName() + "\n";
        return message;
    }

    public Car(){}

    public Car(String name, int price, Key key){
        this.name = name;
        this.price = price;
        this.key = key;
    }

    public final void turnOn(){

        System.out.println("'" + this.key.getName() + "' 로 '" + this.name + "'의 시동을 켭니다.");

    }
    public final void turnOff(){

        System.out.println("'" + this.name + "'의 시동을 끕니다.");

    }


    public String getName(){
        return name;
    }

    //최고 속도를 초과하면 허용 최고 속도로 제한
    protected int checkSpeed(){
        int maxSpeed = Speed.ALLOWED_MAX_SPEED;

        if(this.speed >= maxSpeed){
            String message = maxSpeed + "km이상 과속하지 마세요.";
            System.out.println(message);
            return maxSpeed;
        }else {
            return this.speed;
        }
    }
}
