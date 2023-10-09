package seminars.hwSem6.model;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class MyList<I extends Number> extends AbstractClass implements ListInterface {

    public MyList() {
        super();
        //getList();
    }

    public MyList(List<Integer> list, int resultAverage) {
        super(list, resultAverage);
    }

    @Override
    public List<Integer> getList() {
        return super.getList();
    }

    @Override
    public void setList(List<Integer> list) {
        super.setList(list);
    }

    @Override
    public void compareList(List<Integer> list1, List<Integer> list2) {
        if (averageList(list1) == averageList(list2)){
            System.out.println("Средние значения равны");
        } if(averageList(list1) > averageList(list2)){
            System.out.println("Первый список имеет большее среднее значение");
        } else {
            System.out.println("Второй список имеет большее среднее значение");
        }
    }

    @Override
    public double averageList(List<Integer> list) {
        IntSummaryStatistics stats = list.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));
        return stats.getAverage();
    }


    @Override
    public List<Integer> addList(int num) {
        List<Integer> newList = new ArrayList<>();
        newList.add(num);
        return newList;
    }

    @Override
    public String toString() {
        return "Среднее значение списка (average): "
                + getList() + " = " + getResultAverage() + ".";
    }

}
