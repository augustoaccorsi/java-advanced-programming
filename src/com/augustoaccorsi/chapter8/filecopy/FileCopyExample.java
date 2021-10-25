package com.augustoaccorsi.chapter8.filecopy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class FileCopyExample {

    public static void main(String[] args) {

        Path source = Paths.get("src/com/augustoaccorsi/chapter8/filecopy/example.txt");
        Path dest = Paths.get("src/com/augustoaccorsi/chapter8/filecopy/NEW.txt");
        try {
            Files.copy(source, dest, REPLACE_EXISTING);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }


}
