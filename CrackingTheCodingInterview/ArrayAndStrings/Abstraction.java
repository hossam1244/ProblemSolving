package CrackingTheCodingInterview.ArrayAndStrings;

import java.awt.Shape;

public class Abstraction {
}

abstract class Hello {
    int sf = 0;
    public int ca() {
        return 0;
    }

    abstract void jump();

    public void fds() {
        System.out.println("nothing");
    }
}

 interface shape{
    public void draw();
    double getArea();
}


 class Circle extends Hello implements shape {

    private double radius;
    public Circle(double r){
        super.fds();
        this.radius = r;
    }
    public void draw(){
        System.out.println("Drawing Circle");
    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public double getRadius(){
        Hello d = new Hello() {

            @Override
            void jump() {

            }
        };
        shape c = new Circle(8);


        return this.radius;
    }

     @Override
     void jump() {

     }
 }
 class Test{
    public static void main (String args[]){
        shape c = new Circle(8);
        c.draw();
        System.out.println("Area="+c.getArea());
    }
}

