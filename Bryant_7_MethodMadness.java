
package bryant_7_methodmadness;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Bryant_7_MethodMadness extends Application{

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Method Madness");
        Group root = new Group();
        Canvas canvas = new Canvas(300, 250);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawH(gc);
        drawI(gc);
        drawStrokes(gc);
        drawSun(gc);
        drawRays(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    
    private void drawH(GraphicsContext gc) {
        
        gc.setFill(Color.FORESTGREEN);
        gc.setLineWidth(5);
        gc.fillRect(20, 50, 25, 180);
        gc.fillRect(110, 50, 25, 180);
        gc.fillRect(72.5, 122.5, 10, 10);
    }
    
    private void drawI(GraphicsContext gc) {
        
        gc.setFill(Color.FORESTGREEN);
        gc.setLineWidth(5);
        gc.fillRect(180, 140, 25, 90);
        gc.fillRect(187.5, 92.5, 10, 10);
    }
    
    private void drawStrokes(GraphicsContext gc) {
        
        gc.setStroke(Color.DARKGREEN);
        gc.setLineWidth(5);
        gc.strokeRect(45, 115, 15, 25);
        gc.strokeRect(65, 115, 25, 25);
        gc.strokeRect(95, 115, 15, 25);
        gc.strokeRect(180, 85, 25, 25);
    }
    
    private void drawSun(GraphicsContext gc) {
        
        gc.setFill(Color.GOLD);
        gc.setLineWidth(5);
        gc.fillOval(-20, -40, 75, 75);
    }
    
    private void drawRays(GraphicsContext gc) {
        
        gc.setFill(Color.ORANGE);
        gc.setLineWidth(5);
        gc.fillRect(5, 40, 10, 20);
        gc.fillRect(60, 5, 20, 10);
        gc.fillRect(40, 30, 10, 10);
        gc.fillRect(45, 35, 10, 10);
    }
}
