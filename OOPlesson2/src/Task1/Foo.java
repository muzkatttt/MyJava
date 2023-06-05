package Task1;

public class Foo {
    public Integer value;
    //public static Integer count = 0;
    public static Integer count;

    public static Integer getCount(){
        return count; // для статики
    }

    // статические инициализаторы в Java
    static{
        count = 0;
    }
    public Foo(){
        count++;
    }
    public void printCount(){
        System.out.println(count);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
