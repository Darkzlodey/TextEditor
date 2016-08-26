package com;

public class Text {

    private String[] text = null;
    private int wordCounter = 0;
    public Text(String[] text){
        this.text = text;
    }

    public int getWordCounter() {
        // should i count wprds here or i need just to set this number using set method
        wordCounter = 0;
        for (int stringNumber = 0; stringNumber < text.length; stringNumber++) {
            for (int symbol = 0; symbol < text[stringNumber].length(); symbol++) {
                if (text[stringNumber].toCharArray()[symbol] == ' ') {
                    wordCounter++;
                }
            }
            wordCounter++;
        }
        return wordCounter;
    }

    public void setWordCounter(int wordCounter) {
        this.wordCounter = wordCounter;
    }

    public String[] getText() {
        return text;
    }
}
