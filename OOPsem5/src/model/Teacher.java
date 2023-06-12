package model;

public class Teacher extends User {
    static Integer idGenerator = 0;
    private Disciples disciplesTaught;
    private int idTeacher;

    public Teacher(String name, Integer bornYear, Disciples disciple) {
        super(name, bornYear);
        this.disciplesTaught = disciple;
        this.idTeacher = idGenerator++;
    }

    public Disciples getDisciplesTaught() {
        return disciplesTaught;
    }

    @Override
    public String toString() {
        return "teacher " + idTeacher + " " + disciplesTaught + " " + super.toString();
    }
}
