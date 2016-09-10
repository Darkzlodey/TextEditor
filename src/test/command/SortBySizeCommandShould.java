package test.command;

import com.TextCommands;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortBySizeCommandShould {
    @Test
    public void sortBySizeWordsOneWord() {
        String text = new String("london");
        assertEquals( "[london]", TextCommands.sortBySize(text).toString());
    }

    @Test
    public void sortBySizeWordsSeveralWords() {
        String text = new String("dd c aaaa bbb");
        assertEquals("[c, dd, bbb, aaaa]", TextCommands.sortBySize(text).toString());
    }

    @Test
    public void sortBySizeWordsEmptyString() {
        String text = new String("");
        assertEquals("[]", TextCommands.sortBySize(text).toString());
    }

}
