package seminars.hwSem6.model;

public abstract class AbstractClass {
    int[] array;

    double resultAverage;

    int[] createArray() {
        return new int[5];
    }

    abstract String toString(int[] array);
}
