package test.command;

import com.Text;
import com.command.Command;
import com.command.Count;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CountCommandShould {
    @Test
    public void count_words_correctly_1() {
        String[] text = new String[2];
        text[0] = "qw ew wrefd";
        text[1] = "skwisjn dejndeuj diejdue k";
        Text text1 = new Text(text);
        Command countCommand = new Count(text1);
        countCommand.execute();
        assertEquals(7,text1.getWordCounter());
    }

    @Test
    public void count_words_correctly_2() {
        String[] text = new String[2];
        text[0] = "fdhj ruyf eijf otg nd";
        text[1] = "qwuyd";
        Text text1 = new Text(text);
        Command countCommand = new Count(text1);
        countCommand.execute();
        assertEquals(6,text1.getWordCounter());
    }

    @Test
    public void count_words_correctly_3() {
        String[] text = new String[2];
        text[0] = "qw ew wrefd";
        text[1] = "abcdngh";
        Text text1 = new Text(text);
        Command countCommand = new Count(text1);
        countCommand.execute();
        assertEquals(4,text1.getWordCounter());
    }
}
