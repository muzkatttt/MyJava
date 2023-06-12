package task7;

import java.util.Random;

class Olympiad<T> {

    Team<T> team1, team2;
    Random r = new Random();

    public Olympiad(Team<T> t1, Team<T> t2) {
        team1 = t1;
        team2 = t2;
    }

    public void start() {
        String winner = r.nextInt(2) == 0 ? team1.getName() : team2.getName();
        System.out.println(String.format("Winner: %s", winner));
    }
}
