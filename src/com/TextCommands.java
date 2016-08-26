package com;

import javax.management.ObjectName;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class TextCommands {
    String task;
    // Arraylist add all strings push to 1 string a
    String[] text = new String[10];
    int quantityOfStrings;
    int wordPositionToAdd = 0;
    ArrayList<String> arrayOfWords = new ArrayList<String>();
    int[] numberOfWords;
    int elementPos = 0;

    TextCommands(String command, int stringsNumber, String[] text1) {
        //delete first param in constructor
        task = command;
        quantityOfStrings = stringsNumber;
        text = text1;
        String[] subString;

        for (int stringNumber = 0; stringNumber < quantityOfStrings ; stringNumber++) {
            StringTokenizer token = new StringTokenizer(text[stringNumber]);
            while (token.hasMoreTokens()) {
                arrayOfWords.add(token.nextToken());
                wordPositionToAdd++;
            }
        }
    }


    public void groupCount() {
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
    }

    public void reverse() {
        for (int stringNumber = 1; stringNumber < quantityOfStrings + 1; stringNumber++) {
            String[] str = text[stringNumber].split(" ");
            for (int i = 0; i < str.length; i++) {
                StringBuilder word = new StringBuilder();
                word.append(str[i]);
                word = word.reverse();
                System.out.print(word + " ");
            }
            System.out.println();
        }
    }

    public void countDistinct() {
        ArrayList<String> changedArrayOfWords = new ArrayList<String>(arrayOfWords);
        Set<String> uniqueSet = new LinkedHashSet<String>();
        for (int position = 0; position < changedArrayOfWords.size(); position++) {
            uniqueSet.add(changedArrayOfWords.get(position));
        }
        System.out.println(uniqueSet.size());

    }

    public void sort() {
        ArrayList<String> changedArrayOfWords = new ArrayList<String>(arrayOfWords);
        Set<String> uniqueSet = new LinkedHashSet<String>();
        for (int position = 0; position < changedArrayOfWords.size(); position++) {
            uniqueSet.add(changedArrayOfWords.get(position));
        }
        changedArrayOfWords.clear();
        changedArrayOfWords.addAll(uniqueSet);
        Collections.sort(changedArrayOfWords);
        for (int position = 0; position < changedArrayOfWords.size(); position++) {
            System.out.println(changedArrayOfWords.get(position));
        }
    }

    public void sortDesc() {

        ArrayList<String> changedArrayOfWords = new ArrayList<String>(arrayOfWords);
        Set<String> uniqueSet = new LinkedHashSet<String>();
        for (int position = 0; position < changedArrayOfWords.size(); position++) {
            uniqueSet.add(changedArrayOfWords.get(position));
        }
        changedArrayOfWords.clear();
        changedArrayOfWords.addAll(uniqueSet);
        Collections.sort(changedArrayOfWords);
        for (int position = changedArrayOfWords.size() - 1; position >= 0; position--) {
            System.out.println(changedArrayOfWords.get(position));
        }
    }

    public void sortBySize() {
        ArrayList<String> changedArrayOfWords = new ArrayList<String>(arrayOfWords);
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
                if (changedArrayOfWords.get(position1).length() > changedArrayOfWords.get(position2).length()) {
                    bufer = changedArrayOfWords.get(position2);
                    changedArrayOfWords.get(position2).equals(changedArrayOfWords.get(position1));
                    changedArrayOfWords.get(position1).equals(bufer);
                }
            }
        }
        for (int position = 0; position < changedArrayOfWords.size(); position++) {

            System.out.println(changedArrayOfWords.get(position));
        }
    }



    public void makeTask(String command) {
        switch (command) {
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
