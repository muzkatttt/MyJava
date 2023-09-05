package lesson2;

public class DirectSort {

    public static void main(String[] args){
        int[] array = new int[] {
                4, 2, 5, 8, 1, 9, 0, 3, 6, 7
        };
        directSort(array);

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
    }

    public static void directSort(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            int minPosition = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[minPosition]){
                    minPosition = j;

                }
            }
            if (i != minPosition){
                int temp = array[i];
                array[i] =array[minPosition];
                array[minPosition] = temp;
            }
        }
    }

}
