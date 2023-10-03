package seminars.five;

import org.junit.jupiter.api.Test;
import seminars.five.user.UserService;
import seminars.five.user.UserRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    /* 5.2
    У вас есть два класса - UserService и UserRepository.
    UserService использует UserRepository для получения информации о пользователе.
    Ваша задача - написать интеграционный тест, который проверяет,
    что UserService и UserRepository работают вместе должным образом.
            */
    UserRepository repo = new UserRepository();
    UserService service = new UserService(repo);

    @Test
    public void integrateTest() {
        int userID = 3;
        String expectedUserName = "User " + userID;
        String actualUserName = service.getUserName(userID);

        assertEquals(expectedUserName, actualUserName);
    }

}
