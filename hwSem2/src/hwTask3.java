import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class hwTask3 {
    /*
     Реализуйте алгоритм сортировки пузырьком числового массива,
     результат после каждой итерации запишите в лог-файл.
     */
    public static void main(String[] args) {
        int[] array = new int[]{8, 7, 7, 2, 6, 5, 1, 5, 3, 2};
        System.out.println(Arrays.toString(array));
        sortingArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sortingArray(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                saveToFile(Arrays.toString(arr));
            }
        }
    }

    public static void saveToFile(String string) {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("src/test.txt", true), StandardCharsets.UTF_8))) {
            writer.write(string);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
