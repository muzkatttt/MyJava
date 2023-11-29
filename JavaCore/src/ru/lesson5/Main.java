package ru.lesson5;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
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
    }

    // Класс Files - в него вынесены статические методы работы с класса File



}
