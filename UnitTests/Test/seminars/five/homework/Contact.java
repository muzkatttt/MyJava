package seminars.five.homework;

public class Contact {
    int id;
    String name;
    String numberTelephone;

    public Contact(int id, String name, String numberTelephone) {
        this.id = id;
        this.name = name;
        this.numberTelephone = numberTelephone;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public String getNumberTelephone() {
        return numberTelephone;
    }
}
