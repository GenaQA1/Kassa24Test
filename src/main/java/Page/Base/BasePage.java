package Page.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Common.Config.EXPLICIT_WAIT;


public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;

    }

        public void open(String url){
        driver.get(url);
        }

        public WebElement waitElementIsVisible(WebElement element){
       new WebDriverWait(driver, Duration.ofSeconds(1000)).until(ExpectedConditions.visibilityOf(element));
        return element;
        }


}
