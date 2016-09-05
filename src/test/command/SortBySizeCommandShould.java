package test.command;

import com.TextCommands;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortBySizeCommandShould {
    @Test
    public void sortBySizeWordsOneWord() {
        String text = new String();
        text = "london";
        TextCommands textCommands = new TextCommands();
        TextCommands.setText(text);
        //how to check if we have an array
        assertEquals( "[london]", textCommands.sortBySize().toString());
    }

    @Test
    public void sortBySizeWordsSeveralWords() {
        String text = new String();
        text = "dd c aaaa bbb";
        TextCommands textCommands = new TextCommands();
        TextCommands.setText(text);
        assertEquals("[c, dd, bbb, aaaa]", textCommands.sortBySize().toString());
    }

    @Test
    public void sortBySizeWordsEmptyString() {
        String text = new String();
        text = "";
        TextCommands textCommands = new TextCommands();
        TextCommands.setText(text);
        assertEquals("[]", textCommands.reverse().toString());
    }

}
