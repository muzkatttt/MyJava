package Ex008;

import task8.*;

public class Ex003_Game {
    public static void main(String[] args) {
        System.out.println("Ex003_Game");
        Team<Intern> team1 = new Team<>("Воробушки");
        team1.add(Gb.CreateIntern());
        team1.add(Gb.CreateIntern());
        System.out.println(team1);

        Team<Intern> team2 = new Team<>("Хлебушки ");
        team2.add(Gb.CreateIntern());
        team2.add(Gb.CreateIntern());
        // team2.add(Gb.CreateMiddle());
        System.out.println(team2);

        var o = new Olympiad<Intern>(team1, team2);
        o.start();
        
        // #region
        // System.out.println("st1 vs st2");
        // var st1 = new Team<String>("string team 1");
        // var st2 = new Team<String>("string team 1");

        // Olympiad<String> o1 = new Olympiad<>(st1, st2);
        // o1.start();

        // #endregion
    }
}

