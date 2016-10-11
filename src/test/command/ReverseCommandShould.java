package test.command;

import com.TextCommands;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseCommandShould {
    @Test
    public void reverseWordsOneWord() {
        String text = new String("london");
        assertEquals( "[nodnol]", TextCommands.reverse(text).toString());
    }

    @Test
    public void reverseWordsSeveralWords() {
        String text = new String("london is the capital");
        assertEquals("[nodnol, si, eht, latipac]", TextCommands.reverse(text).toString());
    }

    @Test
    public void reverseWordsEmptyString() {
        String text = new String("");
        assertEquals("[]", TextCommands.reverse(text).toString());
    }
}
