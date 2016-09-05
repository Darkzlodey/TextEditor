package test.command;

import com.TextCommands;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountCommandShould {
    @Test
    public void countWordsOneWord() {
        String text = new String();
        text = "london";

        TextCommands textCommands = new TextCommands();
        TextCommands.setText(text);
        assertEquals(1, textCommands.count());
    }

    @Test
    public void countWordsSeveralWords() {
        String text = new String();
        text = "london is the capital of great britain all programmers love cats";
        TextCommands textCommands = new TextCommands();
        TextCommands.setText(text);
        assertEquals(11, textCommands.count());
    }

    @Test
    public void countWordsEmptyString() {
        String text = new String();
        text = "";
        TextCommands textCommands = new TextCommands();
        TextCommands.setText(text);
        assertEquals(0, textCommands.count());
    }

    @Test
    public void countWordsWithThreeSpaces() {
        String text = new String();
        text = "london   is";
        TextCommands textCommands = new TextCommands();
        TextCommands.setText(text);
        assertEquals(2, textCommands.count());
    }
}
