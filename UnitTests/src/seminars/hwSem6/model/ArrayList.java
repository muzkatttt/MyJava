package seminars.hwSem6.model;

public class ArrayList extends AbstractClass implements ListInterface {

    public ArrayList(ArrayList list) {
        super(list);
    }


    @Override
    public ArrayList getList() {
        return super.getList();
    }

    @Override
    public void setList(ArrayList list) {
        super.setList(list);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void compareArrays(ArrayList array1, ArrayList array2) {
        if (array1.resultAverage == array2.resultAverage){
            System.out.println("Средние значения равны");
        } if(array1.resultAverage > array2.resultAverage){
            System.out.println("Первый список имеет большее среднее значение");
        } else {
            System.out.println("Второй список имеет большее среднее значение");
        }
    }


    public ArrayList(ArrayList list, int resultAverage) {
        super(list, resultAverage);
    }

    @Override
    public double getResultAverage() {
        return super.getResultAverage();
    }

    @Override
    public void setResultAverage(int resultAverage) {
        super.setResultAverage(resultAverage);
    }

    @Override
    public String toString() {
        return "Среднее значение списка (average): "
                + getList() + " = " + getResultAverage() + ".";
    }

}
