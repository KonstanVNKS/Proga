package labo07;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape extends Point {
    private final Point origin;
    private final javafx.scene.paint.Color color;

    public Shape(Point origin, Color color){
        super(origin.getX(), origin.getY());
        this.color= color;
        this.origin = origin;
    }

    public Point getOrigin(){
        return this.origin;
    }
    public Color getColor(){return this.color;}

    public abstract double getArea();

    public abstract void paintOn(GraphicsContext g);

    public void translate(int dx, int dy){
        this.setX(this.getX()+dx);
        this.setY(this.getY()+dy);
    }

}
