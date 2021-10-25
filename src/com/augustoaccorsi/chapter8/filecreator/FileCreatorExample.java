package com.augustoaccorsi.chapter8.filecreator;

import java.io.File;
import java.io.IOException;

public class FileCreatorExample {
    public static void main(String[] args) {
        File myFile = new File("src/com/augustoaccorsi/chapter8/filecreator/example2.txt");
        try {
            System.out.println(myFile.createNewFile());
        } catch (IOException ioe) {
            System.out.println(ioe.toString());
        }
    }
}
