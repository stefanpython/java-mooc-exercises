package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    @Override
    public void start(Stage window) {
        // First View
        BorderPane firstLayout = new BorderPane();
        Label firstLabel = new Label("First view!");
        Button toSecond = new Button("To the second view!");
        firstLayout.setTop(firstLabel);
        firstLayout.setCenter(toSecond);

        Scene firstScene = new Scene(firstLayout, 300, 200);

        // Second View
        VBox secondLayout = new VBox();
        Button toThird = new Button("To the third view!");
        Label secondLabel = new Label("Second view!");
        secondLayout.getChildren().addAll(toThird, secondLabel);

        Scene secondScene = new Scene(secondLayout, 300, 200);

        // Third View
        GridPane thirdLayout = new GridPane();
        Label thirdLabel = new Label("Third view!");
        Button toFirst = new Button("To the first view!");
        thirdLayout.add(thirdLabel, 0, 0);
        thirdLayout.add(toFirst, 1, 1);

        Scene thirdScene = new Scene(thirdLayout, 300, 200);

        // Button Actions
        toSecond.setOnAction((event) -> {
            window.setScene(secondScene);
        });

        toThird.setOnAction((event) -> {
            window.setScene(thirdScene);
        });

        toFirst.setOnAction((event) -> {
            window.setScene(firstScene);
        });

        // Initial Scene
        window.setScene(firstScene);
        window.setTitle("Multiple Views App");
        window.show();
    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }
}
