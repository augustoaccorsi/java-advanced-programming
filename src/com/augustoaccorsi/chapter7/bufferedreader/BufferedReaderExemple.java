package com.augustoaccorsi.chapter7.bufferedreader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExemple {
    public static void main(String[] args) {
        File file = new File("src/com/augustoaccorsi/chapter7/bufferedreader/example.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while((line = reader.readLine()) != null)
                System.out.println(line);
        }
        catch (IOException e){
            System.out.println(e.toString());
        }
    }
}
