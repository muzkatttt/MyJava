package ru.hwSem5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyDirectory {

//    public CopyDirectory(String s) {
//    }

    /**
     * функция copy() копирует указанную в папку /src/ru/backup
     * @throws IOException
     */
    public static void copyFilesAndFolders(){

        Path sourcePath = Paths.get("./src/ru/hwSem5");
        Path destPath = Paths.get("./src/ru/backup");
        try {
            Files.copy(sourcePath, destPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Копирование успешно завершено!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

