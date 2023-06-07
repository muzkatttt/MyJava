package Task5.v2;

import java.util.ArrayList;
import java.util.List;

import Task5.v2.Healers.Druid;
import Task5.v2.Healers.Healer;
import Task5.v2.Healers.Shaman;
import Task5.v2.Warriors.Knight;
import Task5.v2.Warriors.Paladin;
import Task5.v2.Warriors.Warrior;

public class Program {
    public static void main(String[] args) {

        //#region team1
        List<Hero> team1 = new ArrayList<>();
        team1.add(new Druid());
        team1.add(new Shaman());
        team1.add(new Paladin());
        team1.add(new Druid());

        //team1.get(0).attack

        var h = team1.get(0);

        if (h instanceof Warrior) {
            ((Warrior) h).attack(null);
        } else if (h instanceof Healer) {
            ((Healer) h).healing(null);
        } else {
            //....
        }
        //#endregion

        //#region team2
        List<Warrior> team2 = new ArrayList<>();
        //team2.add(new Druid()); // в команду 2 нельзя добавить нового Друида,
        // т.к. он наследуется от другого интерфейса - HEALERS
        team2.add(new Paladin());
        team2.add(new Knight());

        team2.get(0).attack(null);
        team2.add(new God());

        List<Healer> team3 = new ArrayList<>();
        //team3.add(new Paladin()); в команду 3 нельзя добавить нового Паладина,
        // т.к. он наследуется от другого интерфейса Warriors
        team3.add(new Druid());
        team3.add(new Shaman());

        team3.get(0).healing(null);
        team3.add(new God());

        Warrior ww = (Warrior)(team3.get(2));

        System.out.println(team1);
        System.out.println(team2);
        System.out.println(team3);
        //#endregion


    }
}
