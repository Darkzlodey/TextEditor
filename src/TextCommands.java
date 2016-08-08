import java.io.*;
import java.util.*;

public class TextCommands {
    String task;
    String[] text = new String[10];
    int quantityOfStrings;
    int wordPositionToAdd = 0;
    ArrayList<String> arrayOfWords=new ArrayList<String>();
    ArrayList<String> changedArrayOfWords=new ArrayList<String>();
    int[] numberOfWords;
    int elementPos = 0;

    TextCommands(String command, int stringsNumber, String[] text1) {
        task = command;
        quantityOfStrings = stringsNumber;
        text = text1;
        String[] subString;

        for (int stringNumber = 1; stringNumber < quantityOfStrings + 1; stringNumber++) {
            StringTokenizer token = new StringTokenizer(text[stringNumber]);
            while (token.hasMoreTokens()) {
                arrayOfWords.add(token.nextToken());
                wordPositionToAdd++;
            }
        }
    }

    public void count() {
        int numberOfWords = 0;
        for (int stringNumber = 1; stringNumber < quantityOfStrings + 1; stringNumber++) {
            for (int symbol = 0; symbol < text[stringNumber].length(); symbol++) {
                if (text[stringNumber].toCharArray()[symbol] == ' ') {
                    numberOfWords++;
                }
            }
            numberOfWords++;
        }
        System.out.println("Quantity of words:" + numberOfWords + "\n");
    }

    public void groupCount() {
    }

    public void reverse() {
        System.out.println("Reverse text: ");

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


    }

    public void sort() {
        //need to add new ArrayList (copy) and make changing in the new one
        Collections.sort(arrayOfWords);
        for(int i=0;i<wordPositionToAdd;i++) {
            System.out.println(arrayOfWords.get(i));
        }
    }

    public void sortDesc() {

    }

    public void sortBySize() {

    }

    public void end() {
//question
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
            case "end":
                end();
                break;


        }
    }

}
