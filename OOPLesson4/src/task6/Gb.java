package task6;

class Gb {

    public static Programmer CreateEmployee(int i) {
        switch (i) {
            case 0:
                return new Intern();
            case 1:
                return new Middle();
            default:
                return new Principal();
        }
    }

}
