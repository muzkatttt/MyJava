package Task4;

public class Dwarf extends Druid {
    
    public Dwarf(String name, int hp) {
        super(); // через super обращаемся к Druid, т.к. наследуется от него
        System.out.println("Вызван Dwarf(String name, int hp)");
    }

    public Dwarf() {
        this("", 0);
        System.out.println("Вызван Dwarf()");
    }
   
}