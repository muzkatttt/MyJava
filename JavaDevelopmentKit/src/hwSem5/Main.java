package hwSem5;

public class Main {
    public static void main(String[] args) throws Exception {


        final Philosopher[] philosopher = new Philosopher[5];
        Fork[] forks = new Fork[philosopher.length];

        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Fork();
        }

        for (int i = 0; i < philosopher.length; i++) {
            Fork leftFork = forks[i];
            Fork rightFork = forks[(i + 1) % forks.length];
            if (i == philosopher.length - 1) {

                // последний философ берет правую вилку

                philosopher[i] = new Philosopher(rightFork, leftFork);
            } else {
                philosopher[i] = new Philosopher(leftFork, rightFork);
            }

            philosopher[i] = new Philosopher(leftFork, rightFork);

            Thread thread = new Thread(philosopher[i], "Философ " + (i + 1) + ": в ");
            thread.start();
        }
    }
}



