package seminars.sixth.hwSem6.model;

public abstract class AbstractClass {
    public ArrayList list;

    int resultAverage;

    public AbstractClass(ArrayList list) {
        this.list = list;
    }

    public AbstractClass(ArrayList list, int resultAverage) {
        this.list = list;
        this.resultAverage = resultAverage;
    }

    public ArrayList getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }

    public double getResultAverage() {
        return resultAverage;
    }

    public void setResultAverage(int resultAverage) {
        this.resultAverage = resultAverage;
    }
}
