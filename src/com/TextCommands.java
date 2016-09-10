package com;

import java.util.*;

public class TextCommands {

    private static ArrayList<String> createArrayOfWords(String text) {
        ArrayList<String> arrayOfWords = new ArrayList<String>();
            StringTokenizer token = new StringTokenizer(text);
            while (token.hasMoreTokens()) {
                arrayOfWords.add(token.nextToken());
        }
        return arrayOfWords;
    }

    public static int count(String text) {
        return createArrayOfWords(text).size();
    }

    public static ArrayList<String> groupCount(String text) {
        ArrayList<String> changedArrayOfWords = createArrayOfWords(text);
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

    public static ArrayList<String> reverse(String text) {
        ArrayList<String> arrayOfWords = createArrayOfWords(text);
        for (int i = 0; i < arrayOfWords.size(); i++) {
            StringBuilder word = new StringBuilder();
            word.append(arrayOfWords.get(i));
            word = word.reverse();
            arrayOfWords.set(i, word.toString());
        }
        return arrayOfWords;
    }

    public static void countDistinct(String text) {
        ArrayList<String> changedArrayOfWords = createArrayOfWords(text);
        Set<String> uniqueSet = new LinkedHashSet<String>();
        for (int position = 0; position < changedArrayOfWords.size(); position++) {
            uniqueSet.add(changedArrayOfWords.get(position));
        }
        System.out.println(uniqueSet.size());

    }

    public static ArrayList<String> sort(String text) {
        ArrayList<String> changedArrayOfWords = createArrayOfWords(text);
        Set<String> uniqueSet = new LinkedHashSet<String>();
        for (int position = 0; position < changedArrayOfWords.size(); position++) {
            uniqueSet.add(changedArrayOfWords.get(position));
        }
        changedArrayOfWords.clear();
        changedArrayOfWords.addAll(uniqueSet);
        Collections.sort(changedArrayOfWords);
        return changedArrayOfWords;
    }

    public static ArrayList<String> sortDesc(String text) {
        ArrayList<String> changedArrayOfWords = createArrayOfWords(text);
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

    public static ArrayList<String> sortBySize(String text) {
        ArrayList<String> changedArrayOfWords = createArrayOfWords(text);
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

    public void makeTask(String command, String text) {
        switch (command) {
            case "count":
                count(text);
                break;
            case "groupCount":
                groupCount(text);
                break;
            case "reverse":
                reverse(text);
                break;
            case "countDistinct":
                countDistinct(text);
                break;
            case "sort":
                sort(text);
                break;
            case "sortBySize":
                sortBySize(text);
                break;
            case "sortDesc":
                sortDesc(text);
                break;
        }
    }

}