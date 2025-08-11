package ch06_abstract_interface.sporttest;

public class FootBall extends Sport{
    private int goal;

    public FootBall(String name, int entry, int goal){
        super(name, entry);
        this.goal = goal;
    }

    public void scr(int goal){
        if(goal >= 20){
            System.out.println("excellent");
        } else if(goal >= 15){
            System.out.println("very good");
        } else if(goal >= 10){
            System.out.println("good");
        } else if(goal >= 3){
            System.out.println("not bad");
        } else{
            System.out.println("poor");
        }
    } // 골수 평가

    @Override
    public void display() {
        super.display();
        System.out.println("골수 : " + goal);
        scr(goal);
    }
}
