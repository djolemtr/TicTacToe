package com.example.tictactoe;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TicTacToeLogic {
    private String currentPlayer;

//test

    public TicTacToeLogic() {
        this.currentPlayer = "X";
    }

    public String setButton(Button b) {

        //this method has a button as an argument so that the button click doesn't change the value if there is one already

        if (b.getText().equals(" ")) {
            if (currentPlayer.equals("O")) {
                currentPlayer = "X";
                return "O";

            }
            currentPlayer = "O";
            return "X";

        }

        return b.getText();


    }

    public boolean XWon(Button b1, Button b2, Button b3, Button b4, Button b5, Button b6, Button b7, Button b8, Button b9) {

        //checking vertical buttons
        if (b1.getText().equals("X") && b2.getText().equals("X") && b3.getText().equals("X")) {
            return true;
        }

        if (b4.getText().equals("X") && b5.getText().equals("X") && b6.getText().equals("X")) {
            return true;
        }

        if (b7.getText().equals("X") && b8.getText().equals("X") && b9.getText().equals("X")) {
            return true;
        }

        //checking horizontal buttons

        if (b1.getText().equals("X") && b4.getText().equals("X") && b7.getText().equals("X")) {
            return true;
        }

        if (b2.getText().equals("X") && b5.getText().equals("X") && b8.getText().equals("X")) {
            return true;
        }

        if (b3.getText().equals("X") && b6.getText().equals("X") && b9.getText().equals("X")) {
            return true;
        }

        //checking diagonal buttons

        if (b1.getText().equals("X") && b5.getText().equals("X") && b9.getText().equals("X")) {
            return true;
        }

        if (b3.getText().equals("X") && b5.getText().equals("X") && b7.getText().equals("X")) {
            return true;
        }


        return false;
    }

    public boolean YWon(Button b1, Button b2, Button b3, Button b4, Button b5, Button b6, Button b7, Button b8, Button b9) {

        //checking vertical buttons
        if (b1.getText().equals("O") && b2.getText().equals("O") && b3.getText().equals("O")) {
            return true;
        }

        if (b4.getText().equals("O") && b5.getText().equals("O") && b6.getText().equals("O")) {
            return true;
        }

        if (b7.getText().equals("O") && b8.getText().equals("O") && b9.getText().equals("O")) {
            return true;
        }

        //checking horisontal buttons

        if (b1.getText().equals("O") && b4.getText().equals("O") && b7.getText().equals("O")) {
            return true;
        }

        if (b2.getText().equals("O") && b5.getText().equals("O") && b8.getText().equals("O")) {
            return true;
        }

        if (b3.getText().equals("O") && b6.getText().equals("O") && b9.getText().equals("O")) {
            return true;
        }

        //checking diagonal buttons

        if (b1.getText().equals("O") && b5.getText().equals("O") && b9.getText().equals("O")) {
            return true;
        }

        if (b3.getText().equals("O") && b5.getText().equals("O") && b7.getText().equals("O")) {
            return true;
        }


        return false;
    }

    public void buttonAction(Button button, Label label, Button b1, Button b2, Button b3, Button b4, Button b5, Button b6, Button b7, Button b8, Button b9) {
        button.setOnAction(e -> {
            button.setText(this.setButton(button));
            label.setText(" Turn: " + currentPlayer);
            if (XWon(b1, b2, b3, b4, b5, b6, b7, b8, b9)) {
                label.setText(" X won!");
                disableButtons(b1, b2, b3, b4, b5, b6, b7, b8, b9);
            } else if (YWon(b1, b2, b3, b4, b5, b6, b7, b8, b9)) {
                label.setText(" O won!");
                disableButtons(b1, b2, b3, b4, b5, b6, b7, b8, b9);
            } else if (!b1.getText().equals(" ") && !b2.getText().equals(" ") && !b3.getText().equals(" ") && !b4.getText().equals(" ") && !b5.getText().equals(" ") && !b6.getText().equals(" ") && !b7.getText().equals(" ") && !b8.getText().equals(" ") && !b9.getText().equals(" ")) {
                label.setText(" It's a tie.");
            }
        });

    }

    public void disableButtons(Button b1, Button b2, Button b3, Button b4, Button b5, Button b6, Button b7, Button b8, Button b9) {
        b1.setDisable(true);
        b2.setDisable(true);
        b3.setDisable(true);
        b4.setDisable(true);
        b5.setDisable(true);
        b6.setDisable(true);
        b7.setDisable(true);
        b8.setDisable(true);
        b9.setDisable(true);
    }


    public String getCurrentPlayer() {
        return currentPlayer;
    }
}
