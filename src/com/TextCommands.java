package com;

import java.util.*;
import java.util.stream.Stream;


public class TextCommands {

    private static ArrayList<String> createArrayOfWords(String text) {
        ArrayList<String> arrayOfWords = new ArrayList<String>();
        StringTokenizer token = new StringTokenizer(text);
        while (token.hasMoreTokens()) {
            arrayOfWords.add(token.nextToken());
        }
        return arrayOfWords;
    }

    public static long count(String text) {
        return createArrayOfWords(text).stream().count();
    }

    //----------------------
    public static Object[] groupCount(String text) {
        ArrayList<String> changedArrayOfWords = createArrayOfWords(text);
      /*  for (int position = 0; position < changedArrayOfWords.size(); position++) {
            long numberOfWords = changedArrayOfWords.stream().filter(changedArrayOfWords.get(position)::equals).count();
            changedArrayOfWords.stream().skip(position)
        }*/
        return changedArrayOfWords.stream().toArray();
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

    public static long countDistinct(String text) {
        return createArrayOfWords(text).stream().distinct().count();
    }

    public static Object[] sort(String text) {
        ArrayList<String> changedArrayOfWords = createArrayOfWords(text);
        return changedArrayOfWords.stream().distinct().sorted().toArray();
    }

    public static Object[] sortDesc(String text) {
        ArrayList<String> changedArrayOfWords = createArrayOfWords(text);
        return changedArrayOfWords.stream().distinct().sorted((e1, e2) -> e2.compareTo(e1)).toArray();
    }

    //--------------------
    public static Object[] sortBySize(String text) {
        ArrayList<String> changedArrayOfWords = createArrayOfWords(text);
        //changedArrayOfWords.stream().distinct().sorted((e1,e2) ->  );
        return changedArrayOfWords.stream().toArray();
    }


    public void makeTask(String command, String text) {
        switch (command) {
            case "count":
                count(text);
                break;/*
            case "groupCount":
                groupCount(text);
                break;*/
            case "reverse":
                reverse(text);
                break;
            case "countDistinct":
                countDistinct(text);
                break;
            case "sort":
                sort(text);
                break;/*
            case "sortBySize":
                sortBySize(text);
                break;*/
            case "sortDesc":
                sortDesc(text);
                break;
        }
    }
}

