public class arrays {
//    public static void main(String[] args) {
//        int[] a = new int[]{1, 9};
//        int[] b = new int[3];
//        System.arraycopy(a, 0, b, 0, a.length);
//        for (int i : a) {
//            System.out.printf("%d ", i);
//        } // 1 9
//        for (int j : b) {
//            System.out.printf("%d ", j);
//        } // 0 9 0 0 0 0 0 0 0 0
//    }

    // скопировать массив с помощью отдельного метода
    static int[] AddItem(int[] array, int item) { // item - добавляемый элемент
        int length = array.length; // определяем длину
        int[] temp = new int[length + 1]; // создаем новый массив
        // из массива а начиная с 0 элемента скопировать в массив b
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item; // добавляем новый элемент в хвост массива
        return temp; // вернем вночь образовавшегося массива
    }
    public static void main(String[] args) {
        int[] a = new int[] { 0, 9 };
        for (int i : a) { System.out.printf("%d ", i); }
        a = AddItem(a, 2); a = AddItem(a, 4);
        for (int j : a) { System.out.printf("%d ", j); }
    }
}

