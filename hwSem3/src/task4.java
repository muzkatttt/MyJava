import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        /*
         *Реализовать алгоритм сортировки слиянием
         */
        int[] newArray = new int[]{22, 4, 8, 7, 8, 9, 5, 13, 22, 45, 64, 24, 13, 13, 4};
        System.out.println(Arrays.toString(newArray));
        int[] arr = newArray;
        if (newArray.length > 2) newArray = sortedArray(newArray);
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }

    public static int[] sortedArray(int[] array) {
        int length = array.length / 2;

        if (array.length < 2) {
            return array;
        }
        if (array.length % 2 != 0) {
            length += 1;
        }
        int[] arrayPart1 = new int[length];
        int[] arrayPart2 = new int[array.length / 2];

        for (int i = 0; i < array.length / 2; i++) {
            arrayPart2[i] = array[i];
        }
        for (int i = array.length / 2; i < array.length; i++) {
            arrayPart1[i - array.length / 2] = array[i];
        }
        arrayPart2 = sortedArray(arrayPart2);
        arrayPart1 = sortedArray(arrayPart1);

//        System.out.print("\n");
        return mergeArray(arrayPart2, arrayPart1);
    }

    public static int[] mergeArray(int[] arrayPartLeft, int[] arrayPartRight) {

        int[] arrayMerge = new int[arrayPartLeft.length + arrayPartRight.length];
        int pospositionToLeft = 0, positionToRight = 0;

        for (int i = 0; i < arrayMerge.length; i++) {
            if (pospositionToLeft < arrayPartLeft.length && positionToRight < arrayPartRight.length) {
                if (arrayPartLeft[pospositionToLeft] < arrayPartRight[positionToRight]) {
                    arrayMerge[i] = arrayPartLeft[pospositionToLeft];
                    pospositionToLeft++;
                } else {
                    arrayMerge[i] = arrayPartRight[positionToRight];
                    positionToRight++;
                }
            } else if (pospositionToLeft == arrayPartLeft.length && positionToRight < arrayPartRight.length) {
                arrayMerge[i] = arrayPartRight[positionToRight];
                positionToRight++;
            } else if (pospositionToLeft < arrayPartLeft.length && positionToRight == arrayPartRight.length) {
                arrayMerge[i] = arrayPartLeft[pospositionToLeft];
                pospositionToLeft++;
            } else {
                arrayMerge[i] = 0;
            }
            //System.out.println(Arrays.toString(arrayMerge));
        }
        return arrayMerge;
    }
}
