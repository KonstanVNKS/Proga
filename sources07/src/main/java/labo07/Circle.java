package labo07;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Shape{
    private final int radius;

    public Circle(Point center, int radius, Color color){
        super(center,color);
        this.radius = radius;
    }

    public int getRadius(){return this.radius;}

    @Override
    public double getArea(){
        return Math.PI*getRadius()*getRadius();
    }

    @Override
    public void paintOn(GraphicsContext g){
        g.setStroke(this.getColor());
        g.strokeText(this.toString(),getX(),getY());
        g.strokeOval(getX()-radius,getY()-radius,2*getRadius(),2*getRadius());

    }

    @Override
    public String toString(){
        return "Circle center="+this.getOrigin().toString()+" radius="+getRadius()+" area="+getArea();
    }
}
