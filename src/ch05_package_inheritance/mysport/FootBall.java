package ch05_package_inheritance.mysport;

import javax.swing.*;

public class FootBall extends Sport{
    private int halves;
    private int golas;

    public FootBall(String name, int entry, int halves, int golas){
        super(name, entry);
        this.halves = halves;
        this.golas = golas;
    }

    public void display(){
        super.show();
        System.out.println("하프타임 : " + halves);
        System.out.println("골 : " + golas);
    }
}
