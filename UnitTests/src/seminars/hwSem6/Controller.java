package seminars.hwSem6;

import seminars.hwSem6.model.MyList;

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

}
