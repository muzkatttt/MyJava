/*
В консоли запросить имя пользователя. В зависимости от
текущего времени, вывести приветствие вида
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
 */

import java.util.Random;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        int[] randomArray = generateArray(20, 0, 1);
        System.out.println(Arrays.toString(randomArray));
        System.out.println(count_ones(randomArray));
    }

    static int[] generateArray(int size, int min_seed, int max_seed){
        int[] resultArray = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            resultArray[i] = rnd.nextInt(min_seed, max_seed+1);
        }
        return resultArray;
    }

    static int count_ones(int[] arr){
        int maxOnes = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                temp++;
            }
            else{
                if (temp > maxOnes){
                    maxOnes = temp;
                }
                temp = 0;
            }
        }
        if (temp > maxOnes){
            maxOnes = temp;
        }
        return maxOnes;
    }
}
