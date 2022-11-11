import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestAudiWebsite {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.audi.by/by/web/ru.html");
        WebElement magnifierElement = driver
                .findElement(By
                        .xpath("//*[@id=\"audi-header\"]/div/div[1]/div/div[4]/div/button"));
        magnifierElement.click();
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("search__basic")));
        WebElement searchInputElement = driver.findElement(By.id("search__basic"));
        searchInputElement.sendKeys("A5");
        searchInputElement.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.quit();
    }
}
