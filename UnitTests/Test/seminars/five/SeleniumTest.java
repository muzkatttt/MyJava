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
        //System.setProperty("webdriver.chrome.driver", "/Users/ekaterinarodionova/Desktop/GB/UnitTests/chromedriver"); // скачать exe файл и добавить его путь вторым аргументом
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

    /*
    @Test
    public void testGoogleSearch() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(new CharSequence[]{"Selenium"});
        searchBox.submit();
        List<WebElement> searchResults = driver.findElements(By.cssSelector("div.g"));
        boolean isFound = false;
        Iterator var5 = searchResults.iterator();

        while(var5.hasNext()) {
            WebElement webElement = (WebElement)var5.next();
            if (webElement.getText().contains("https://www.selenium.dev")) {
                isFound = true;
                break;
            }
        }

        Assertions.assertTrue(isFound);
        driver.quit();

     */
}
