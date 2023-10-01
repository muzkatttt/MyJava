package seminars.third.hw;

import seminars.third.tdd.User;
import seminars.third.tdd.UserRepository;

public class MainHW {
    public static void main(String[] args) {

        /**
         * *Задание 1.
         * Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет,
         * является ли переданное число четным или нечетным.
         * Задание 2.
         * Разработайте и протестируйте метод numberInInterval, который проверяет,
         * попадает ли переданное число в интервал (25;100).
         * Задание 3.  (необязательное)
         * Добавьте функцию в класс UserRepository, которая разлогинивает всех пользователей,
         * кроме администраторов. Для этого, вам потребуется расширить класс User новым свойством,
         * указывающим, обладает ли пользователь админскими правами. Протестируйте данную функцию.
         */
        UserRepository userRepository = new UserRepository();
        User user1 = new User("Kate", "pass", true);
        User user2 = new User("Alex", "pass2", false);
        userRepository.addUser(user1);
        userRepository.addUser(user2);
        System.out.println(userRepository.loginDeletedUser(user1));
    }

    // 1
    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    // 2
    public boolean numberInterval(int n) {
        if (n >= 25 && n < 100) {
            return true;
        }
        if (n < 0) {
            throw new RuntimeException("Число отрицательное");
        } else {
            return false;
        }
    }
}


