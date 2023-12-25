package hwSem3;

public class Arrays {
    public static void main(String[] args) {
        /*Напишите обобщенный метод compareArrays(),
        который принимает два массива и возвращает true,
        если они одинаковые, и false в противном случае.
        Массивы могут быть любого типа данных,
        но должны иметь одинаковую длину и
        содержать элементы одного типа по парно.*/

        System.out.println("Задача с массивами:");
        Number[] array1 = new Number[]{1, 1, 2, 2, 1};
        Number[] array2 = new Number[]{1, 1, 2, 2, 1.00};
        System.out.println(compareArrays(array1, array2));

        String[] array3 = new String[]{"Java Core", "JDK", "Java Junior"};
        String[] array4 = new String[]{"Java Core", "JDK", "Spring", "Java Junior"};
        System.out.println(compareArrays(array3, array4));

        Object[] array5 = new Object[]{1, "JDK", 2.00, "Java", 1};
        Object[] array6 = new Object[]{1, "JDK", 2.00, "Java", 1};
        System.out.println(compareArrays(array5, array6));
    }

    /**
     * @param array1 первый массив для сравнения
     * @param array2 второй массив для сравнения
     * @param <T>    обобщенный метод
     * @return true если массивы одинаковой длины и содержат элементы одного типа попарно
     */
    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length == array2.length) {

            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i].getClass().equals(array2[j].getClass())) {
                        // && (array1[i].equals(array2[i]))
                        return true;
                    }
                }
            }
        } else {
            System.out.println("Массивы имеют разную длину");
        }
        return false;
    }

}
