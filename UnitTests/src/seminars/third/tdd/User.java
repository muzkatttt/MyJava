package seminars.third.tdd;

public class User {
    /*
    Задание No6
    Разработайте класс User с методом аутентификации по логину и паролю.
    Метод должен возвращать true, если введенные логин и пароль корректны,
    иначе false. Протестируйте все методы
     */

    String name;
    String password;

    boolean isAuthenticate;
    boolean isAdmin;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = true;
    }

    //3.6. Метод должен возвращать true, если введенные логин и пароль корректны, иначе false
    public boolean authenticate(String name, String password) {
        if (this.name.equals(name) && this.password.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "User: " + this.name + ", password: " + this.password + ".";
    }
}