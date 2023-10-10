package seminars.hwSem6;

import seminars.hwSem6.model.MyList;

import java.util.Arrays;

public class Controller {
    MyList myList;

    public Controller(){
        this.myList = new MyList();
    }

    public double averageArray(int[] array) {
        return myList.averageArray(array);
    }

    public void compareArray(double resultAverage1, double resultAverage2){
        myList.compareArray(resultAverage1, resultAverage2);
    }

    public int[] createArray() {
        return myList.createArray();
    }

    public String toString(int[] array) {
        return "Массив: " + Arrays.toString(myList.getArray()) + ". Среднее значение списка (average): "
                + myList.getResultAverage() + ".";
    }
}
