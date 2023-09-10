package sem2;

import java.util.Arrays;

public class Sem2 {
        public static void main(String[] args) {

            int[] array = new int[]{1, 8, 7, 4, 5, 6, 1, 9, 8, 4};

            quickSort(array);

            System.out.println(Arrays.toString(array));


        }

        public static void quickSort(int[] array) {
            quickSort(array, 0, array.length - 1);
        }

        private static void quickSort(int[] array, int leftBorder, int rightBorder) {
            System.out.println(Arrays.toString(array));
            int leftMarker = leftBorder;
            int rightMarker = rightBorder;
            int pivot = array[(leftBorder + rightBorder) / 2];
            while (leftMarker <= rightMarker) {
                while (array[leftMarker] < pivot)
                    leftMarker++;
                while (array[rightMarker] > pivot)
                    rightMarker--;
                if (leftMarker <= rightMarker) {
                    if (leftMarker < rightMarker) {
                        int temp = array[leftMarker];
                        array[leftMarker] = array[rightMarker];
                        array[rightMarker] = temp;
                    }
                    leftMarker++;
                    rightMarker--;
                }
            }
            if (leftMarker < rightBorder)
                quickSort(array, leftMarker, rightBorder);
            if (leftBorder < rightMarker)
                quickSort(array, leftBorder, rightMarker);
        }


        public static void heapSort(int[] array) {
            int length = array.length;

            for (int i = length / 2 - 1; i >= 0; i--)
                heapify(array, length, i);

            for (int i = length - 1; i >= 0; i--) {
                int swap = array[0];
                array[0] = array[i];
                array[i] = swap;

                heapify(array, i, 0);
            }
        }

        public static void heapify(int[] array, int length, int i) {
            int largest = i;
            int left = i * 2 + 1;
            int right = i * 2 + 2;

            if (left < length && array[left] > array[largest])
                largest = left;
            if (right < length && array[right] > array[largest])
                largest = right;

            if (largest != i) {
                int swap = array[i];
                array[i] = array[largest];
                array[largest] = swap;

                heapify(array, length, largest);
            }
        }
    }

