package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {
    User user = new User("Kate", "pass", true);
    User user2 = new User("Alex", "pass2", false);

//    @BeforeEach в данном случае не использую, т.к. проверяю разных пользователей,
//    поэтому в каждом тесте создаю новые данные для проверяемого пользователя

    @Test
    void checkedName() {
        String name = "Kate";
        String password = "pass";
        boolean isAdmin = true;
        assertThat(user.name).isEqualTo("Kate");
    }

    @Test
    void checkedPassword() {
        String name = "Alex";
        String password = "pass2";
        boolean isAdmin = false;
        assertThat(user2.password).isEqualTo("pass2");
    }

    @Test
    void checkedIsAdmin() {
        assertThat(user.isAuthenticate).isTrue();
    }

    @Test
    void authenticateChecked() {
        assertThat(user.authenticate("Alex", "pass2")).isFalse();
    }

    @Test
    void authenticateChecked2() {
        assertThat(user.authenticate("Kate", "pass")).isTrue();
    }

    @Test
    void isAdminChecked() {
        assertThat(new User("Kate", "pass", true).equals(user));
    }

    @Test
    void isAdminChecked2() {
        assertThat(new User("Alex", "pass2", false).equals(user2));
    }
    @Test
    void userToString() {
        assertThat(user.toString()).contains("User: Kate, password: pass.");
    }
}
