package test.command;

import com.TextCommands;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseCommandShould {
    @Test
    public void reverseWordsOneWord() {
        String text = new String();
        text = "london";
        TextCommands textCommands = new TextCommands();
        TextCommands.setText(text);
        //how to check if we have an array
        assertEquals( "[nodnol]", textCommands.reverse().toString());
    }

    @Test
    public void reverseWordsSeveralWords() {
        String text = new String();
        text = "london is the capital";
        TextCommands textCommands = new TextCommands();
        TextCommands.setText(text);
        assertEquals("[nodnol, si, eht, latipac]", textCommands.reverse().toString());
    }

    @Test
    public void reverseWordsEmptyString() {
        String text = new String();
        text = "";
        TextCommands textCommands = new TextCommands();
        TextCommands.setText(text);
        assertEquals("[]", textCommands.reverse().toString());
    }

}
