package ru.sem2;

import java.util.Random;
import java.util.Scanner;

public class Main {
/**
 * 1. Полностью разобраться с кодом программы разработанной на семинаре, переписать программу.
 * Это минимальная задача для сдачи домашней работы.
 *
 * Усложняем задачу:
 * 2.* Переработать метод проверки победы, логика проверки победы должна работать для поля 5х5
 * и количества фишек 4. Очень желательно не делать это просто набором условий
 * для каждой из возможных ситуаций! Используйте вспомогательные методы, используйте циклы!
 *
 * 3.**** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
 */
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '0';
    private static final char DOT_EMPTY = '_';

    private static final int WIN_COUNT = 4;

    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    private static  char[][] field;
    private static int fieldSizeX;
    private static int fieldSizeY;
    public static void main(String[] args) {
        while (true){
            initializeGame();
            printField();
            while (true){
                humanMove();
                printField();
                if (checkGameState(DOT_HUMAN, "Вы победили!"))
                    break;
                aiMove();
                printField();
                if (checkGameState(DOT_AI, "Победил компьютер!"))
                    break;
            }
            System.out.print("Желаете сыграть еще раз? (Y - да): ");
            if (!scanner.next().equalsIgnoreCase("Y"))
                break;
        }
    }

    static void initializeGame(){
        System.out.println("Введите высоту и ширину поля через пробел:\n ");
        fieldSizeY = scanner.nextInt();
        fieldSizeX = scanner.nextInt();

        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++){
            for (int x = 0; x < fieldSizeX; x++){
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    private static void printField(){
        System.out.print(" ");
        for (int i = 0; i < fieldSizeX; i++) {
            System.out.print("_" + (i+1));
        }
        System.out.println("-");

        for (int y = 0; y < fieldSizeY; y++) {
            System.out.print(y+1 +"|");
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }

        for (int i = 0; i < fieldSizeX*2+2; i++) {
            System.out.print("--");
        }
        System.out.println(" ");
    }

    static void humanMove(){
        int x;
        int y;

        do {
            System.out.print("Введите координаты хода X и Y (Для X от 1 до " + fieldSizeX +
                    "), (Для Y от 1 до " + fieldSizeY+ " через пробел: \n ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }
        while (!isCellValid(x, y) || !isCellEmpty(x, y));

        field[y][x] = DOT_HUMAN;
    }

    static void aiMove(){
        int x;
        int y;

        do {
            x = random.nextInt(fieldSizeX);
            y = random.nextInt(fieldSizeY);
        }
        while (!isCellEmpty(x, y));

        field[y][x] = DOT_AI;
    }

    /**
     * Проверка, является ли ячейка игрового поля пустой
     * @param x
     * @param y
     * @return
     */
    static boolean isCellEmpty(int x, int y){
        return field[y][x] == DOT_EMPTY;
    }

    /**
     * Проверка доступности ячейки игрового поля
     * @param x
     * @param y
     * @return
     */
    static boolean isCellValid(int x, int y){
        return x >= 0 && x< fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    /**
     * Метод проверки состояния игры
     * @param dot фишка игрока
     * @param s победный слоган
     * @return результат проверки состояния игры
     */
    static boolean checkGameState(char dot, String s){
        if (checkWinDiagonals(dot)){
            System.out.println(s);
            return true;
        }
        if (checkWinHorizontalAndVertical(dot)){
            System.out.println(s);
            return true;
        }
        if (checkDraw()){
            System.out.println("Ничья!");
            return true;
        }
        return false; // Игра продолжается
    }

    /**
     * Проверка на ничью
     * @return
     */
    static boolean checkDraw(){
        for (int y = 0; y < fieldSizeY; y++){
            for (int x = 0; x < fieldSizeX; x++){
                if (isCellEmpty(x, y))
                    return false;
            }
        }
        return true;
    }

    /**
     * Проверка победы игрока
     * @param dot фишка игрока
     * @return признак победы
     */

    // проверка по горизонтали
    static boolean checkWinDiagonals(char dot){
        boolean clockwise = true;
        boolean counterclockwise = true;
        for (int i = 0; i < fieldSizeX; i++) {
            clockwise &= (field[i][i] == dot);
            counterclockwise &= (field[fieldSizeX - i - 1][i] == dot);
        }
        return clockwise || counterclockwise;
    }

    static boolean checkWinHorizontalAndVertical(char dot){
        boolean columns, rows;
        for (int col = 0; col < fieldSizeY; col++) {
            columns = true;
            rows = true;
            for (int row = 0; row < fieldSizeX; row++) {
                columns &= (field[col][row] == dot);
                rows &= (field[row][col] == dot);
            }
            if (columns || rows) return true;

        }
        return false;
    }
//    static boolean checkWinHorizontalAndVertical(char dot){
//        boolean columns, rows;
//        for (int col = 0; col < fieldSizeY; col++) {
//            columns = true;
//            rows = true;
//            for (int row = 0; row < fieldSizeX; row++) {
//                columns &= (field[col][row] == dot);
//                rows &= (field[row][col] == dot);
//            }
//            if (columns || rows) return true;
//
//        }
//        return false;
//    }

    static boolean check2(int x, int y, char dot, int winCount){
        return false;
    }

    static boolean check3(int x, int y, char dot, int winCount){
        return false;
    }

    static boolean check4(int x, int y, char dot, int winCount){
        return false;
    }

}
