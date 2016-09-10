package test.command;

import com.TextCommands;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountCommandShould {
    @Test
    public void countWordsOneWord() {
        String text = new String("london");
        assertEquals(1, TextCommands.count(text));
    }

    @Test
    public void countWordsSeveralWords() {
        String text = new String("london is the capital of great britain all programmers love cats");
        assertEquals(11,TextCommands.count(text));
    }

    @Test
    public void countWordsEmptyString() {
        String text = new String("");
        assertEquals(0, TextCommands.count(text));
    }

    @Test
    public void countWordsWithThreeSpaces() {
        String text = new String("london is");
        assertEquals(2, TextCommands.count(text));
    }
}
