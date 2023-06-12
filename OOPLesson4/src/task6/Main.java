package task6;
public class Main {
    public static void main(String[] args) {
        System.out.println("Ex001_Game");

        Team team1 = new Team("Воробушки");
        team1.add(Gb.CreateEmployee(0));
        team1.add(Gb.CreateEmployee(0));
        System.out.println(team1);

        Team team2 = new Team("Хлебушки ");
        team2.add(Gb.CreateEmployee(0));
        team2.add(Gb.CreateEmployee(0));
        team2.add(Gb.CreateEmployee(1));//
        System.out.println(team2);

        var o = new Olympiad(team1, team2);
        o.start();

    }
}

