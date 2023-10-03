package seminars.five;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumTest {
/* 5.4
Напишите автоматизированный тест, который выполнит следующие шаги:
1. Открывает главную страницу Google.
2. Вводит "Selenium" в поисковую строку и нажимает кнопку "Поиск в Google".
3. В результатах поиска ищет ссылку на официальный сайт Selenium
(https://www.selenium.dev) и проверяет, что ссылка действительно присутствует среди результатов поиска.
 */

    @Test
    public void checkBrowserTest(){
        //System.setProperty("webdriver.edge.driver", ); // скачать exe файл и добавить его путь вторым аргументом
        WebDriver driver = new ChromeDriver(); // сюда ставим название драйвера
        driver.get("http://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        searchBox.submit();
        List<WebElement> seleniumLink = driver.findElements(By.cssSelector("div"));
        //вместо div можно поставить class name --> g Ww4FFb vt6azd tF2Cxc asEBEc
        boolean a = false;
        for (WebElement webElement : seleniumLink) {
            if (webElement.getText().contains("https://www.selenium.dev")) {
                a = true;
                break;
            }
        }
        assertTrue(a);
        driver.quit();
    }
}
