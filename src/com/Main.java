package com;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = "";
        String text = new String();
        TextCommands textEditor = new TextCommands();
        while (!"end".equals(command)) {
            System.out.println("Type command and text");
            command = sc.nextLine();
                text = sc.nextLine();
            textEditor.makeTask(command , text);
        }

    }
}
