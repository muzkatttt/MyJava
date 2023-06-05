package Task5;

import Task5.v1.Healers.Druid;
import Task5.v1.Healers.Healer;
import Task5.v1.Healers.Shaman;
import Task5.v1.Warriors.Knight;
import Task5.v1.Warriors.Paladin;
import Task5.v1.Warriors.Warrior;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        
        //#region team1
//        List<Task5.Hero> team1 = new ArrayList<>();
//        team1.add(new Druid());
//        team1.add(new Shaman());
//        team1.add(new Paladin());
//        team1.add(new Druid());

        // team1.get(0).attack

//        var h = team1.get(0);
//
//        if (h instanceof Warrior) {
//            ((Warrior) h).attack(null);
//        }
//        else if (h instanceof Healer) {
//            ((Healer) h).healing(null);
//        } else {
//            //....
//        }
        //#endregion

        //#region team2
        List<Warrior> team2 = new ArrayList<>();
        //team2.add(new Druid());
        team2.add(new Paladin());
        team2.add(new Knight());

        team2.get(0).attack(null);

        List<Healer> team3 = new ArrayList<>();
        //team2.add(new Paladin());
        team3.add(new Druid());
        team3.add(new Shaman());

        team3.get(0).healing(null);

        //#endregion


    }
}
