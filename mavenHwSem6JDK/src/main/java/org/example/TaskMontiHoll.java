package org.example;

import java.util.HashMap;
import java.util.Random;

public class TaskMontiHoll{

    // region Поля
    static Random random = new Random();
    static HashMap<Integer, Boolean> resultsNoChoice = new HashMap<>();
    static HashMap<Integer, Boolean> resultsWithChoice = new HashMap<>();
    static int doorsNumber = 3;
    static int attempts = 1000;
    static int countWin = 0;
    
    // endregion


    // region Методы
    /**
     * Метод, подсчитывающий количество побед игрока и количество неудачных попыток
     * @param results
     */
    public static void countWin(HashMap<Integer, Boolean> results){
        for (HashMap.Entry<Integer, Boolean> entry : results.entrySet()) {
            if (entry.getValue()) {
                countWin++;
            }
        }
        System.out.printf("Количество побед %s из %s попыток\n", countWin, attempts);
        System.out.println("Неудачные попытки " + (attempts - countWin));
    }

    /**
     * Метод запуска попытки для игроков
     * @param attempts номер попытки
     */

    private static void playAttempt(int attempts) {
        int prize = random.nextInt(doorsNumber);
        int firstChoice = random.nextInt(doorsNumber);
        int freeOpenDoor = -1;
        int secondChoice = -1;

        getOpenDoor(prize, firstChoice, freeOpenDoor);

        /*
        не меняю дверь
         */
        for (int i = 0; i < doorsNumber; i++) {
            if (i != firstChoice) {
                secondChoice = firstChoice;
            }
        }
        resultsNoChoice.put(attempts, prize == secondChoice);

        /*
        меняю дверь
         */
        for (int i = 0; i < doorsNumber; i++) {
            if (i != firstChoice) {
                secondChoice = i;
            }
        }
        resultsWithChoice.put(attempts, prize == secondChoice);
    }

    /**
     * Открытие двери
     * @param success
     * @param firstChoice
     * @param freeOpenDoor
     */

    public static int getOpenDoor(int success, int firstChoice, int freeOpenDoor){
        for (int i = 0; i < doorsNumber; i++) {
            if (i != success && i != firstChoice) {
                freeOpenDoor = i;
            }
        }
        return freeOpenDoor;
    }

    /**
     * Метод запуска игры
     * attempts количество попыток
     */

    public static void game() {
        for (int i = 0; i < attempts; i++) {
            playAttempt(i);
        }
        countWin(resultsNoChoice);
        countWin(resultsWithChoice);
    }

    // endregion
}
