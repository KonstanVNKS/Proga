package labo07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class ShapeApp extends Application {

    private final List<Shape> shapes = new ArrayList<>();
    private GraphicsContext context;

    @Override
    public void start(Stage primaryStage) {

        Canvas canvas = new Canvas(800, 600);
        context = canvas.getGraphicsContext2D();

        Pane root = new Pane();
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("DemoGraphicsFX");
        primaryStage.show();


        var red = new Color(1,0,0,1);
        var green =new Color(0,1,0,1);
        var blue = new Color(0,0,1,1);
        /* complétez / remplacez le code à partir d'ici */
        Circle c = new Circle(new Point(40,40), 20, blue );
        Circle c1 = new Circle(new Point(150,150), 50, blue);
        Circle c2 = new Circle(new Point(100,400), 50,green);

        Rectangle r = new Rectangle(new Point(200,200),40,40,red);
        Rectangle r1 = new Rectangle(new Point(300,300),80,40,red);
        r.translate(40,40);
        shapes.add(c);
        shapes.add(c1);
        shapes.add(c2);
        shapes.add(r);
        shapes.add(r1);
        paint();
    }

    private void paint() {
        for (Shape shape : shapes) {
            shape.paintOn(context);
        }
    }

    static void main(String[] args) {
        launch(args);
    }

}
