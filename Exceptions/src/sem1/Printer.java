package sem1;

import java.util.Scanner;

public class Printer {
        final static int minSize = 5;

        public static void main(String[] args) {
            int value = inputInt();
            System.out.println(decoder(checkLength(new int[]{1, 3, 4, 5, 5}, value)));
            System.out.println(decoder(checkLength(null, value)));
        }

        public static int inputInt() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter value: ");
            return scanner.nextInt();
        }

        public static String decoder(int result) {
            return switch (result) {
                case -1 -> "Error array size";
                case -2 -> "Value not found";
                case -3 -> "Array is Null";
                default -> "Index is " + result;
            };
        }

        public static int checkLength(int[] arr, int value) {
            if (arr == null) return -3;
            if (arr.length < minSize) return -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == value) return i;
            }
            return -2;
        }
    }


