package hwSem2;

import java.util.ArrayList;

public abstract class Animal {
    String name;
    String age;


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Animal{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age='").append(age).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
