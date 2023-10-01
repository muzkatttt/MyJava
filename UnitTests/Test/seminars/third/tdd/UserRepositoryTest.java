package seminars.third.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;

class UserRepositoryTest {

    public UserRepository userRepository;
    private List<User> data = new ArrayList<>();
    @BeforeEach
    void setUp(){
        userRepository = new UserRepository();
    }

    @Test
    void addUser() {
        assertThat(userRepository.addUser(new User("Kate", "pass", true))).isFalse();
    }

    @Test
    void findByName() {
        List<User> data = new ArrayList<>();
        data.add(new User("Kate", "pass", true));
        assertThat(data.contains(new User("Kate", "pass", true)));
    }
    @Test
    void findByUser() {
        List<User> data = new ArrayList<>();
        data.add(new User("Kate", "pass", true));
        assertFalse(data.contains(new User("Kate", "pass", true)));
    }
}