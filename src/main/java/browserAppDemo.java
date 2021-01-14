import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class browserAppDemo
{
    public static void main(String[] args) throws Exception
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\chrome driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        WebDriver driver =  new ChromeDriver(options);

        driver.get("https://www.mos.ru/");
        driver.findElement(By.tagName("button")).click();
        driver.findElement(By.id("login")).sendKeys("", "sidoroff.olex1y@yandex.ru");

        driver.findElement(By.id("password")).sendKeys("", "Qazsxdr11");
//        driver.findElement(By.xpath("//a[@href='/docs/configuration']")).click();

        driver.findElement(By.tagName("button")).click();

        driver.get("https://www.mos.ru/pgu/ru/application/dtis/020301/?load_app=1&draft_id=151263564");
//        driver.findElement(By.className("button")).click();
//        driver.findElement(By.className("plus")).click();
        driver.get("https://www.mos.ru/pgu/ru/application/dtis/020301/#");




//        driver.findElement(By.cssSelector("a[type='button']")).click();
//        driver.findElement(By.cssSelector("a:contains('COMPOSE')")).click();
//



//        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//        WebElement element = driver.findElement(By.className("button"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element);
//        actions.perform();
//        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='identifierId']"))).sendKeys("sidoroff.olex1y@yandex.ru");
//        driver.findElement(By.id("identifierNext")).click();
//        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']"))).sendKeys("Qazsxdr1");
//        driver.findElement(By.id("passwordNext")).click();
    }
}

//
// System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\chrome driver\\chromedriver.exe");
//         ChromeOptions options = new ChromeOptions();
//         options.addArguments("start-maximized");
//         options.setExperimentalOption("useAutomationExtension", false);
//         options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
//         WebDriver driver =  new ChromeDriver(options);
//
//         driver.get("https://login.mos.ru/sps/login/methods/password");
//         new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='identifierId']"))).sendKeys("sidoroff.olex1y@yandex.ru");
//         driver.findElement(By.id("identifierNext")).click();
//         new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']"))).sendKeys("Qazsxdr1");
//         driver.findElement(By.id("passwordNext")).click();
