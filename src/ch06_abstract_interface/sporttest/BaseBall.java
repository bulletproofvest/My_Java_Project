package ch06_abstract_interface.sporttest;

public class BaseBall extends Sport{
    private double hitrate;

    public BaseBall(String name, int entry, double hitrate){
        super(name, entry);
        this.hitrate = hitrate;
    }

    public void scr(double hitrate){
        if(hitrate >= 0.350){
            System.out.println("excellent");
        }else if(hitrate >= 0.320){
            System.out.println("very good");
        } else if(hitrate >= 0.280){
            System.out.println("good");
        } else if(hitrate >= 0.250){
            System.out.println("not bad");
        } else{
            System.out.println("poor");
        }
    }

    @Override
    public void display(){
        super.display();
        System.out.println("타율 : " + hitrate);
        scr(hitrate);
    }


}
