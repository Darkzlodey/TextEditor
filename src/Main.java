import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command="";
        int numberOfStrings=0;
        String[] text = new String[10];
        TextCommands textEditor = new TextCommands(command, numberOfStrings, text);



        while(!"end".equals(command)) {
            System.out.println("Type command, number of strings and text");
            command = sc.nextLine();
            numberOfStrings = sc.nextInt();
            for (int i = 0; i < numberOfStrings + 1; i++) {
                text[i] = sc.nextLine();
            }/*
            String[] s =text[1].split(" ");
                 s = text[2].split(" ");
            for(int i=0;i<s.length;i++) {
                System.out.println(s[i] + " ");
            }*/
            /*String[] arrayOfWords = new String[10];
int wordPositionToAdd=0;
            for(int stringNumber=1;stringNumber<3;stringNumber++) {
                StringTokenizer token = new StringTokenizer(text[stringNumber]);
                while (token.hasMoreTokens()) {
                    arrayOfWords[wordPositionToAdd]=token.nextToken();
                    wordPositionToAdd++;
                }
            }/*
        for(int i=0;i<arrayOfWords.length;i++){
            System.out.println(arrayOfWords[i] + " ");
        }*/

            textEditor = new TextCommands(command, numberOfStrings, text);
            textEditor.makeTask(command);
        }

    }
}
