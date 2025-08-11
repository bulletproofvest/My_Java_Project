package ch06_abstract_interface.sporttest;

public class Sport {
    protected String name;
    protected int entry;


    public Sport(String name, int entry){
        this.name = name;
        this.entry = entry;
    }

    public void display(){
        System.out.println("종목 이름 : " + name);
        System.out.println("엔트리 : " + entry);
    }
}
