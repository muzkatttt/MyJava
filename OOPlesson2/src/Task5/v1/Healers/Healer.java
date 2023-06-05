package Task5.v1.Healers;

import Task5.v2.Hero;

public abstract class Healer extends Hero {
    
    public void healing(Hero target) {
        System.out.println(target);
    }
}
