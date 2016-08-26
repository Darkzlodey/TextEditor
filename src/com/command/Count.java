package com.command;

import com.Text;
import com.command.Command;

public class Count implements Command {

    private Text text = null;

    public Count(Text text) {
        this.text = text;
    }

    @Override
    public Text execute() {

        int quantityOfStrings = text.getText().length - 1;
        int numberOfWords = 0;
        for (int stringNumber = 1; stringNumber < quantityOfStrings + 1; stringNumber++) {
            for (int symbol = 0; symbol < text.getText()[stringNumber].length(); symbol++) {
                if (text.getText()[stringNumber].toCharArray()[symbol] == ' ') {
                    numberOfWords++;
                }
            }
            numberOfWords++;
        }
        return text;
    }
}
