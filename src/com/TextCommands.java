package com;

import javax.management.ObjectName;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class TextCommands {
    String task;
    static String text = new String();
    int[] numberOfWords;
    int elementPos = 0;
public static void setText(String text1){
    text=text1;
}
    private static ArrayList<String> CreateArrayOfWords() {
        ArrayList<String> arrayOfWords = new ArrayList<String>();
            StringTokenizer token = new StringTokenizer(text);
            while (token.hasMoreTokens()) {
                arrayOfWords.add(token.nextToken());
        }
        return arrayOfWords;
    }

    public static int count() {
        ArrayList<String> arrayOfWords = CreateArrayOfWords();
        return arrayOfWords.size();
    }

    public  ArrayList<String> groupCount() {
        ArrayList<String> changedArrayOfWords = CreateArrayOfWords();
        Set<String> uniqueSet = new LinkedHashSet<String>();
        for (int position = 0; position < changedArrayOfWords.size(); position++) {
            uniqueSet.add(changedArrayOfWords.get(position));
        }
        changedArrayOfWords.clear();
        changedArrayOfWords.addAll(uniqueSet);
        int wordsCounter;
        for (int position1 = 0; position1 < changedArrayOfWords.size(); position1++) {
            wordsCounter = 0;
            for (int position2 = 0; position2 < changedArrayOfWords.size(); position2++) {
                if (changedArrayOfWords.get(position1).equals(changedArrayOfWords.get(position2))) {
                    wordsCounter++;
                }
            }
            String subString = changedArrayOfWords.get(position1);
            subString.concat(String.valueOf(wordsCounter));
            changedArrayOfWords.set(position1,subString);
        }
        return changedArrayOfWords;
    }

    public ArrayList<String> reverse() {
        ArrayList<String> arrayOfWords = CreateArrayOfWords();
        for (int i = 0; i < arrayOfWords.size(); i++) {
            StringBuilder word = new StringBuilder();
            word.append(arrayOfWords.get(i));
            word = word.reverse();
            arrayOfWords.set(i, word.toString());
        }
        return arrayOfWords;
    }

    public void countDistinct() {
        ArrayList<String> changedArrayOfWords = CreateArrayOfWords();
        Set<String> uniqueSet = new LinkedHashSet<String>();
        for (int position = 0; position < changedArrayOfWords.size(); position++) {
            uniqueSet.add(changedArrayOfWords.get(position));
        }
        System.out.println(uniqueSet.size());

    }

    public ArrayList<String> sort() {
        ArrayList<String> changedArrayOfWords = CreateArrayOfWords();
        Set<String> uniqueSet = new LinkedHashSet<String>();
        for (int position = 0; position < changedArrayOfWords.size(); position++) {
            uniqueSet.add(changedArrayOfWords.get(position));
        }
        changedArrayOfWords.clear();
        changedArrayOfWords.addAll(uniqueSet);
        Collections.sort(changedArrayOfWords);
        return changedArrayOfWords;
    }

    public ArrayList<String> sortDesc() {
        ArrayList<String> changedArrayOfWords = CreateArrayOfWords();
        Set<String> uniqueSet = new LinkedHashSet<String>();
        for (int position = 0; position < changedArrayOfWords.size(); position++) {
            uniqueSet.add(changedArrayOfWords.get(position));
        }
        changedArrayOfWords.clear();
        changedArrayOfWords.addAll(uniqueSet);
        Collections.sort(changedArrayOfWords);
        Collections.reverse(changedArrayOfWords);
        return changedArrayOfWords;
    }

    public ArrayList<String> sortBySize() {
        ArrayList<String> changedArrayOfWords =CreateArrayOfWords();
        Set<String> uniqueSet = new LinkedHashSet<String>();
        for (int position = 0; position < changedArrayOfWords.size(); position++) {
            uniqueSet.add(changedArrayOfWords.get(position));
        }
        changedArrayOfWords.clear();
        changedArrayOfWords.addAll(uniqueSet);
        Collections.sort(changedArrayOfWords);
        String bufer;
        for (int position1 = 0; position1 < changedArrayOfWords.size(); position1++) {
            for (int position2 = 0; position2 < changedArrayOfWords.size() - 1; position2++) {
                if (changedArrayOfWords.get(position1).length() < changedArrayOfWords.get(position2).length()) {
                    bufer = changedArrayOfWords.get(position2);
                    changedArrayOfWords.set((position2),changedArrayOfWords.get(position1));
                    changedArrayOfWords.set((position1), bufer);
                }
            }
        }
        return changedArrayOfWords;
    }

    public void makeTask(String command) {
        switch (command) {
            case "count":
                count();
                break;
            case "groupCount":
                groupCount();
                break;
            case "reverse":
                reverse();
                break;
            case "countDistinct":
                countDistinct();
                break;
            case "sort":
                sort();
                break;
            case "sortBySize":
                sortBySize();
                break;
            case "sortDesc":
                sortDesc();
                break;
        }
    }

}