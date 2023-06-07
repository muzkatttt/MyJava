package Task4;

public class Druid extends BaseHero {

    int mp;

    public Druid(String name, int hp, int mp) {
        super(name, hp); // вызван конструктор базового класса
        System.out.println("Вызван Druid(String name, int hp)");
        this.mp = mp; // инициализация новых параметров для Druid
        super.hp = 1000; // реинициализация (переприсваивание) переменной в конструкторе Druid
        // или можно сделать так:
        // this.hp = (int)(this.hp * 0.8);
    }

    public Druid() {
        this("", 0, 10);
        // super("", 0);
        System.out.println("Вызван Druid()");
    }
}