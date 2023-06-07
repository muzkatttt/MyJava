package task5Repeat;

import task5Repeat.healers.Druid;
import task5Repeat.healers.Healer;
import task5Repeat.healers.Priest;
import task5Repeat.healers.Shaman;
import task5Repeat.warriors.Knight;
import task5Repeat.warriors.Paladin;
import task5Repeat.warriors.Warriors;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //#region team1
        List<Heroes> team1 = new ArrayList<>();
        team1.add(new Druid());
        team1.add(new Priest()); //Priest() нельзя добавить, если будет создан List<Druid>
        // Priest не может наследоваться от Druid
        team1.add(new Paladin());
        team1.add(new Shaman());
        System.out.println(team1);
        var h = team1.get(1);

        if (h instanceof Warriors) {
            ((Warriors) h).attack(null);
        } else if (h instanceof Healer) {
            ((Healer) h).healing(null);
        } else {
            //...
        }
        //#endregion

        //#region team2
        List<Warriors> team2 = new ArrayList<>();
        team2.add(new Knight());
        team2.add(new Paladin());
        team2.add(new Knight());
        team2.add(new Paladin());
        // team2.add((Warriors) new Druid()); // ОШИБКА Exception in thread "main" java.lang.ClassCastException:
        // class task5Repeat.healers.Druid cannot be cast to class task5Repeat.warriors.Warriors
        // (task5Repeat.healers.Druid and task5Repeat.warriors.Warriors are in unnamed module of loader 'app')
        //	at task5Repeat.Main.main(Main.java:42)
        // team2.add(new Druid()); // в команду 2 нельзя добавить нового Друида,
        // т.к. он наследуется от другого интерфейса - Healers
        team2.add(new God());
        team2.get(0).attack(null);
        System.out.println(team2);
        //#endregion

        //#region team3
        List<Healer> team3 = new ArrayList<>();
        team3.add(new Druid());
        team3.add(new Shaman());
        //team3.add(new Paladin()); в команду 3 нельзя добавить нового Паладина,
        // т.к. он наследуется от другого интерфейса Warriors
        team3.get(0).healing(null);
        team3.add(new God());

        Warriors ww = (Warriors)(team3.get(2)); // приведение к типу Warriors (кастуем),
        // где 2 - это 3-й по очереди персонаж

        ((Warriors)team3.get(2)).attack(team1.get(1));
        System.out.println(team3);
        System.out.println("+");

    }
}
