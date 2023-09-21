package sem1;

public class Task3 {

    /*
    Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента
    целочисленный одномерный массив. Метод должен пройтись по каждому элементу и
    проверить что он не равен null.
    А теперь реализуйте следующую логику:
    Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
    Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
     */
    public static void main(String[] args) {

        Integer[] arr = {1, 3, 4, 5, 6, null, 423, null, 12, 12, null};
        checkArray(arr);
    }

    public static void checkArray(Integer[] arr) {
        boolean error = false;
        StringBuilder stringBuilder = new StringBuilder("We found null in indexes: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==null) stringBuilder.append(i).append(' ');
            error = true;
        }
        if (error) throw new RuntimeException(stringBuilder.toString());
        System.out.println("all is ok");

    }

}
