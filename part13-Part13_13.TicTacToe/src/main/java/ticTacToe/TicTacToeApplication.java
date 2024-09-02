package ticTacToe;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    private boolean xTurn = true; // X starts first
    private boolean gameEnded = false;
    private Button[][] buttons = new Button[3][3];
    private Label statusLabel = new Label("Turn: X");

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        // Create GridPane for Tic-Tac-Toe buttons
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        // Initialize buttons and add them to GridPane
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Button button = new Button();
                button.setMinSize(100, 100);
                button.setOnAction(e -> handleButtonClick(button));
                buttons[i][j] = button;
                gridPane.add(button, i, j);
            }
        }

        // Add components to BorderPane
        root.setTop(statusLabel);
        root.setCenter(gridPane);

        // Create Scene and Stage
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setTitle("Tic-Tac-Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleButtonClick(Button button) {
        // Check if the game has ended or button is already used
        if (gameEnded || !button.getText().isEmpty()) {
            return;
        }

        // Set button text based on current turn
        if (xTurn) {
            button.setText("X");
            statusLabel.setText("Turn: O");
        } else {
            button.setText("O");
            statusLabel.setText("Turn: X");
        }

        // Switch turn
        xTurn = !xTurn;

        // Check for game end
        if (checkForWin()) {
            statusLabel.setText("The end!");
            gameEnded = true;
        } else if (isBoardFull()) {
            statusLabel.setText("The end!");
            gameEnded = true;
        }
    }

    private boolean checkForWin() {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if (buttons[i][0].getText().equals(buttons[i][1].getText()) &&
                buttons[i][1].getText().equals(buttons[i][2].getText()) &&
                !buttons[i][0].getText().isEmpty()) {
                return true;
            }
            if (buttons[0][i].getText().equals(buttons[1][i].getText()) &&
                buttons[1][i].getText().equals(buttons[2][i].getText()) &&
                !buttons[0][i].getText().isEmpty()) {
                return true;
            }
        }

        if (buttons[0][0].getText().equals(buttons[1][1].getText()) &&
            buttons[1][1].getText().equals(buttons[2][2].getText()) &&
            !buttons[0][0].getText().isEmpty()) {
            return true;
        }
        if (buttons[0][2].getText().equals(buttons[1][1].getText()) &&
            buttons[1][1].getText().equals(buttons[2][0].getText()) &&
            !buttons[0][2].getText().isEmpty()) {
            return true;
        }

        return false;
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (buttons[i][j].getText().isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        launch(args);
    }
}

