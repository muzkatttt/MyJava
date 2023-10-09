package seminars.hwSem6.model;

import java.util.List;

public interface ListInterface {

    void compareList(List<Integer> list1, List<Integer> list2);
    double averageList(List<Integer> list);

    public abstract List<Integer> addList(int num);

}
