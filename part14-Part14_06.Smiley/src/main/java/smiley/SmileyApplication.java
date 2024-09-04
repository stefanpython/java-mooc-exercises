package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application {

    @Override
    public void start(Stage stage) {

        // Create a BorderPane layout
        BorderPane borderPane = new BorderPane();
        
        // Create a Canvas and add it to the center of the BorderPane
        Canvas canvas = new Canvas(400, 400); // Set canvas size
        borderPane.setCenter(canvas);
        
        // Get the GraphicsContext from the Canvas
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        // Draw a white background
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        // Draw a black smiley face
        gc.setFill(Color.BLACK);

        // Draw the face (a circle)
        gc.fillOval(50, 50, 300, 300); // Parameters: x, y, width, height

        // Draw the eyes (two small circles)
        gc.fillOval(125, 125, 50, 50); // Left eye
        gc.fillOval(225, 125, 50, 50); // Right eye

        // Draw the mouth (a semi-circle)
        gc.strokeArc(125, 200, 150, 100, 0, -180, javafx.scene.shape.ArcType.OPEN);

        // Set up the Scene and Stage
        Scene scene = new Scene(borderPane, 400, 400);
        stage.setScene(scene);
        stage.setTitle("Smiley Face");
        stage.show();
    }

    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }
}
