package seminars.hwSem6.model;

import java.util.List;

public abstract class AbstractClass {
    public List<Integer> list;

    int resultAverage;

    public AbstractClass() {
        this.list = list;
    }

    public AbstractClass(List<Integer> list, int resultAverage) {
        this.list = list;
        this.resultAverage = resultAverage;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public double getResultAverage() {
        return resultAverage;
    }

    public void setResultAverage(int resultAverage) {
        this.resultAverage = resultAverage;
    }

}
