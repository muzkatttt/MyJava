package Task4;

public abstract class BaseHero {

    public BaseHero(String name, int hp) {
        System.out.println("Вызван BaseHero(String name, int hp)");
    }

    public BaseHero() {
        this("", 0);
        System.out.println("Вызван BaseHero()");
    }
}