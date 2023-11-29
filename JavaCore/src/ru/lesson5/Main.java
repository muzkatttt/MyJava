package ru.lesson5;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Main {
    public static void main(String[] args) throws IOException {
        // работа с файлами через класс File
        // данный цикл покажет все файлы в текущей директории
        File folder = new File(".");
        for (File file : folder.listFiles()) {
            System.out.println(file.getName());
        }

        System.out.println();

        // Получение информации
        System.out.println("It's a folder - " + folder.isDirectory());
        System.out.println("It`s a file - " + folder.isFile());
        File file = new File("./Dockerfile");
        System.out.println("Length file - " + file.length());
        System.out.println("Absolute path - " + file.getAbsolutePath());
        System.out.println("Total space on disk - " + folder.getTotalSpace());
        System.out.println("File deleted - " + file.delete());
        System.out.println("File exists - " + file.exists());
        System.out.println("Free space on disk - " + folder.getFreeSpace());

        try {
            FileSystem fileSystem = FileSystems.getDefault();
            for (Path rootdir : fileSystem.getRootDirectories()) {
                System.out.println(rootdir.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Путь
        File file1 = new File("Main.java");
        Path filePath = Paths.get(file1.getName());
        System.out.println(filePath);

        // Действия с путями

        Path filePath1 = Paths.get("pics/logo.png"); // указываем путь!

        Path fileName = filePath1.getFileName();
        System.out.println("FileName: " + fileName);

        Path parent = filePath1.getParent();
        System.out.println("Parent directory: " + parent);

        boolean endWithTxt = filePath1.endsWith("logo.png");
        System.out.println("Ends with filepath: " + endWithTxt);
        endWithTxt = filePath1.endsWith("png");
        System.out.println("Ends with filepath: " + endWithTxt);

        boolean startWithPics = filePath1.startsWith("pics");
        System.out.println("Stars with filepath: " + startWithPics);

        System.out.println("\n");

        System.out.println(filePath1.isAbsolute());
        Path pathFirst = Paths.get("./pics/logo.png");
        System.out.println(pathFirst.normalize());
        // метод normalize() нормализует текущий путь удаляя ненужные точки

        Path pathSecond = Paths.get("./sources-draft/../pics/logo.png");
        System.out.println(pathSecond.normalize());


        // Класс Files - в него вынесены статические методы работы с класса File
        // Манипулирование файлом

        Path file3 = Files.createFile(Paths.get("../pics/file.txt")); // создаем файл
        System.out.println("File was captired successfully in pics directory? ");
        System.out.println(Files.exists(Paths.get("../pics/file.txt")));

        Path testDirectory = Files.createDirectory(Paths.get("./testing"));
        System.out.println("Was the test directory created successfully?");
        System.out.println(Files.exists(Paths.get("./testing")));

        file = Files.move(file3, Paths.get("./testing/file.txt"), REPLACE_EXISTING).toFile();
        System.out.println("Is our file still in the pics directory?");
        System.out.println(Files.exists(Paths.get("../pics/file.txt")));
        System.out.println("Has our file been moved to testDirectory?");
        System.out.println(Files.exists(Paths.get("./testing/file.txt")));

        Path copyFile = Files.copy(file3, Paths.get("../pics/file.txt"), REPLACE_EXISTING);
        System.out.println("Has our file been copied to pics directory?");
        System.out.println(Files.exists(Paths.get("../pics/file.txt")));

        Files.delete(file3);
        System.out.println("Does the file exist in test directory?");
        System.out.println(Files.exists(Paths.get("./testing/file.txt")));
        System.out.println("Does the test directory exist?");
        System.out.println(Files.exists(Paths.get("./testing")));

        // Работа с содержимым

        List<String> lines = Arrays.asList(
                "The cat wants to play with you",
                "But you don`t want to play with it");

        Path file4 = Files.createFile(Paths.get("cat.txt"));
        if (Files.exists(file4)) {
            Files.write(file4, lines, StandardCharsets.UTF_8);
            lines = Files.readAllLines(
                    Paths.get("cat.txt"), StandardCharsets.UTF_8);

            for (String s : lines) {
                System.out.println(s);
            }
        }





    }

}
