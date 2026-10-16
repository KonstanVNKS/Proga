package labo07;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends Shape{
    private final int width;
    private final int lenght;


    public Rectangle(Point point, int width, int length, Color color){
        super(point,color);
        this.lenght=length;
        this.width=width;
    }

    public int getWidth() {
        return width;
    }

    public int getLenght() {
        return lenght;
    }

    @Override
    public double getArea(){
        return (double)getLenght()*getWidth();
    }

    @Override
    public void paintOn(GraphicsContext g){
        g.setStroke(this.getColor());
        g.strokeRect(getX(), getY(), getWidth(),getLenght());
        g.strokeText(this.toString(), getX(), getY());
    }

    @Override
    public String toString(){
        return "Rectangle pos "+this.getOrigin().toString() +"width="+this.getWidth()+" height="+
                this.getLenght()+" area="+this.getArea();
    }
}
