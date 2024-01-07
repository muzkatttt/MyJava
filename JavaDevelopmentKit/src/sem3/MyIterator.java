package sem3;

import java.util.Iterator;
import java.util.List;

public class MyIterator<T> implements Iterator<T> {
    List<T> collection;
    int iter;

    public MyIterator(List<T> collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return iter < collection.size();
    }

    @Override
    public T next() {
        return collection.get(iter++);
    }
}
