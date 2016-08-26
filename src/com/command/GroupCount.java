package com.command;

import com.Text;
import com.command.Command;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class GroupCount implements Command {
    private Text text = null;

    public GroupCount(Text text) {
        this.text = text;
    }

    @Override
    public Text execute() {
        // i dont know exactly , how and what should i return
        ArrayList<String> arrayOfWords = new ArrayList<String>();
        Text changedArrayOfWords1 =null;

        ArrayList<String> changedArrayOfWords = new ArrayList<String>(arrayOfWords);
        Set<String> uniqueSet = new LinkedHashSet<String>();
        for (int position = 0; position < changedArrayOfWords.size(); position++) {
            uniqueSet.add(changedArrayOfWords.get(position));
        }
        changedArrayOfWords.clear();
        changedArrayOfWords.addAll(uniqueSet);
        int wordsCounter;
        for (int position1 = 0; position1 < changedArrayOfWords.size(); position1++) {
            wordsCounter = 0;
            for (int position2 = 0; position2 < arrayOfWords.size(); position2++) {
                if (changedArrayOfWords.get(position1).equals(arrayOfWords.get(position2))) {
                    wordsCounter++;
                }
            }
            System.out.println(changedArrayOfWords.get(position1) + " " + wordsCounter);
        }
        return changedArrayOfWords1;
    }

}

