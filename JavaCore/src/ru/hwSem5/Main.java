package ru.hwSem5;


import java.io.File;
import java.io.IOException;

public class Main {
    /**
     * TODO: Доработать метод print, необходимо распечатывать директории и файлы
     */

    public static void main(String[] args) throws IOException {

        // вызов функции print()
        print(new File("."), " ", true);

        // копированиe папки
        new CopyDirectory("./src/ru/hwSem5").copyFilesAndFolders();

    }
    static void print(File file, String indent, boolean isLast) {
        System.out.print(indent);
        if (isLast) {
            System.out.print("└─");
            indent += "  ";
        } else {
            System.out.print("├─");
            indent += "│ ";
        }
        //System.out.println(file.getName());
        System.out.print(" ");

        // добавлена проверка условия для определения, является ли файл каталогом
        // если каталог существует, то распечатывается название каталога, если условие ложно,
        // то распечатывается название файла с расширением
        if (file.isDirectory()) {
            System.out.println(file.getName() + " ");
        } else {
            System.out.println("file: " + file.getName());
            return;
        }

        File[] files = file.listFiles();
        if (files == null)
            return;

        int subDirTotal = 0;
        int fileCount = 0;
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                subDirTotal++;
            } else {
                fileCount++;
            }
        }

        int subDirCounter = 0;
        // добавила еще один счетчик для проверки количества файлов и их добавления в дерево при печати
        int fileCount1 = 0;
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                // вызов функции print() для печати только наименовуния папок
                //print(files[i], indent, subDirTotal == ++subDirCounter);
                // вызов метода print() для печати папок и файлов

                print(files[i], indent, subDirCounter == subDirTotal - 1 && fileCount1 == fileCount);
                subDirCounter++;
            } else {
                print(files[i], indent, fileCount1 == fileCount - 1 && subDirCounter == subDirTotal);
                fileCount1++;
            }
        }
    }

}


