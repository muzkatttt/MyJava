package seminars.five.homework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SaucedemoTest {
    /*
    Задание No5
    Нужно написать сквозной тест с использованием Selenium,
    который авторизует пользователя на сайте https://www.saucedemo.com/.
    Данные для входа - логин: "standard_user", пароль: "secret_sauce".
    Проверить, что авторизация прошла успешно и отображаются товары.
    Вам необходимо использовать WebDriver для открытия страницы и методы sendKeys()
    для ввода данных в поля формы, и submit() для отправки формы.
    После этого, проверьте, что на странице отображаются продукты (productsLabel.getText() = "Products").
     */
    @Test
    public void checkSaucedemoTest(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        WebElement searchFieldUserName = driver.findElement(By.id("user-name"));
        searchFieldUserName.sendKeys("standard_user");
        searchFieldUserName.submit();

        WebElement searchFieldPassword = driver.findElement(By.id("password"));
        searchFieldPassword.sendKeys("secret_sauce");
        searchFieldPassword.submit();

        //WebElement searchLoginButton = driver.findElement(By.id("login-button"));
        WebElement searchLoginButton = driver.findElement(By.cssSelector("Login"));
        searchLoginButton.submit();
        searchLoginButton.click();

        List<WebElement> productsLabels = driver.findElements(By.className("title"));
        boolean a = false;
        for (WebElement productsLabel : productsLabels) {
            if (productsLabel.getText().contains("Products")) {
                a = true;
                break;
            }
        }
        assertTrue(a);
        driver.quit();
    }

}

