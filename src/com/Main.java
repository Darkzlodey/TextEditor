package com;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = "";
        int numberOfStrings = 0;
        String[] text = new String[10];
        TextCommands textEditor = new TextCommands(command, numberOfStrings, text);
        while (!"end".equals(command)) {
            System.out.println("Type co, number of strings and text");
            command = sc.nextLine();
            numberOfStrings = sc.nextInt();
            for (int i = 0; i < numberOfStrings + 1; i++) {
                text[i] = sc.nextLine();
            }
            textEditor = new TextCommands(command, numberOfStrings, text);
            textEditor.makeTask(command);
        }

    }
}
