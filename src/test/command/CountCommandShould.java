package test.command;

import com.TextCommands;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountCommandShould {
    @Test
    public void countWordsOneWord() {
        String[] text = new String[1];
        text[0] = "london";
        TextCommands textCommands = new TextCommands("count", 1, text);
        assertEquals(1, textCommands.count());
    }

    @Test
    public void countWordsSeveralWords() {
        String[] text = new String[1];
        text[0] = "london is the capital of great britain all programmers love cats";
        TextCommands textCommands = new TextCommands("count", 1, text);
        assertEquals(11, textCommands.count());
    }

    @Test
    public void countWordsEmptyString() {
        String[] text = new String[1];
        text[0] = "";
        TextCommands textCommands = new TextCommands("count", 1, text);
        assertEquals(0, textCommands.count());
    }

    @Test
    public void countWordsWithThreeSpaces() {
        String[] text = new String[1];
        text[0] = "london   is";
        TextCommands textCommands = new TextCommands("count", 1, text);
        assertEquals(2, textCommands.count());
    }
}
