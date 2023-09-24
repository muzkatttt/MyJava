package sem1;

public class Task7 {
    /*
    Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    и возвращающий новый массив, каждый элемент которого равен сумме элементов
    двух входящих массивов в той же ячейке.
    Если длины массивов не равны, необходимо как-то оповестить пользователя.
     */
    public static void main(String[] args) {
        int[] array1 = new int[] {1, 2, 3, 4};
        int[] array2 = new int[] {5, 6, 7, 8};
        multiArray(array1, array2);

    }
    public static int[] multiArray(int[] array1, int[] array2){
        //int[] array1 = new int[] {};
        //int[] array2 = new int[] {};
        int[] array3 = new int[array1.length];
        if(array1.length != array2.length) {
            //return new int[]{0};
            throw new RuntimeException("массивы не равны");
        } else {
            for(int i = 0; i <array3.length; i++){
                array3[i] = array1[i] + array2[i];
                System.out.println(array3[i]);
            }
        }
        return array3;
    }
}
