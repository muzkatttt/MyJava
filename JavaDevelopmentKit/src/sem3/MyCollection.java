package sem3;

public class MyCollection<T> {
    private Object[] myCollection = new Object[20];
    private int collLength;

    public void putElement(T t) {
        if (collLength == myCollection.length) {
            Object[] newCollection = new Object[collLength + 20];
            System.arraycopy(myCollection, 0, newCollection, 0, collLength);
            myCollection = newCollection;
        }
        myCollection[collLength++] = t;
    }

    public void removeElement(int index) {
        if (index < collLength && index >= 0) {
            for (int i = index; i < collLength - 1; i++) {
                myCollection[index] = myCollection[index + 1];
            }
//      myCollection[collLength] = null;
            collLength--;
        }
    }
}

