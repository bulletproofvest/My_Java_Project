package ch05_package_inheritance.mysport;

public class Sport {
    private String name;
    private int entry;

    public Sport(String name, int entry){
        this.name = name;
        this.entry = entry;
    }

    protected void show() {
        System.out.println(name + " 경기");
        System.out.println("엔트리 : " + entry);
    }
}
