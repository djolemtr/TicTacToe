package com.example.tictactoe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        TicTacToeLogic game = new TicTacToeLogic();
        BorderPane layout = new BorderPane();

        Label label = new Label(" Turn: " + game.getCurrentPlayer());
        label.setFont(Font.font("Monospaced", 30));

        GridPane view = new GridPane();

        view.setHgap(10);
        view.setVgap(10);
        view.setPadding(new Insets(10, 10, 10, 10));

        //button needs to have a blank space character passed in order for it not to get resized when clicked (because of text changing from blank to char)

        Button b1 = new Button(" ");
        b1.setFont(Font.font("Monospaced", 40));
        Button b2 = new Button(" ");
        b2.setFont(Font.font("Monospaced", 40));
        Button b3 = new Button(" ");
        b3.setFont(Font.font("Monospaced", 40));
        Button b4 = new Button(" ");
        b4.setFont(Font.font("Monospaced", 40));
        Button b5 = new Button(" ");
        b5.setFont(Font.font("Monospaced", 40));
        Button b6 = new Button(" ");
        b6.setFont(Font.font("Monospaced", 40));
        Button b7 = new Button(" ");
        b7.setFont(Font.font("Monospaced", 40));
        Button b8 = new Button(" ");
        b8.setFont(Font.font("Monospaced", 40));
        Button b9 = new Button(" ");
        b9.setFont(Font.font("Monospaced", 40));

        view.add(b1, 0, 0, 1, 1);
        view.add(b2, 1, 0, 1, 1);
        view.add(b3, 2, 0, 1, 1);
        view.add(b4, 0, 1, 1, 1);
        view.add(b5, 1, 1, 1, 1);
        view.add(b6, 2, 1, 1, 1);
        view.add(b7, 0, 2, 1, 1);
        view.add(b8, 1, 2, 1, 1);
        view.add(b9, 2, 2, 1, 1);

        layout.setTop(label);
        layout.setCenter(view);
        view.setHgap(10);
        view.setVgap(10);


        Scene scene = new Scene(layout);

        game.buttonAction(b1, label, b1, b2, b3, b4, b5, b6, b7, b8, b9);

        game.buttonAction(b2, label, b1, b2, b3, b4, b5, b6, b7, b8, b9);

        game.buttonAction(b3, label, b1, b2, b3, b4, b5, b6, b7, b8, b9);

        game.buttonAction(b4, label, b1, b2, b3, b4, b5, b6, b7, b8, b9);

        game.buttonAction(b5, label, b1, b2, b3, b4, b5, b6, b7, b8, b9);

        game.buttonAction(b6, label, b1, b2, b3, b4, b5, b6, b7, b8, b9);

        game.buttonAction(b7, label, b1, b2, b3, b4, b5, b6, b7, b8, b9);

        game.buttonAction(b8, label, b1, b2, b3, b4, b5, b6, b7, b8, b9);

        game.buttonAction(b9, label, b1, b2, b3, b4, b5, b6, b7, b8, b9);


        window.setScene(scene);
        window.setTitle("Djole's TicTacToe Game");
        window.show();

    }


}
