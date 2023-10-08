package seminars.five.homework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
        WebElement searchField = driver.findElement(By.id("user-name"));
        searchField.sendKeys("standard_user");
        searchField.submit();
        wait(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
        WebElement searchField2 = driver.findElement(By.id("password"));
        searchField2.sendKeys("secret_sauce");
        searchField2.submit();
        wait(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        WebElement searchLoginButton = driver.findElement(By.id("login-button"));
        searchLoginButton.click();

        List<WebElement> productsLabel = driver.findElements(By.cssSelector("div"));
        boolean a = false;
        for (WebElement webElement : productsLabel) {
            if (webElement.getText().contains("Products")) {
                a = true;
                break;
            }
        }
        assertTrue(a);
        driver.quit();
    }

    private void wait(ExpectedCondition<WebElement> webElementExpectedCondition) {
    }
}

