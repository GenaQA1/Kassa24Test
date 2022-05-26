package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static Common.Config.IMPLICIT_WAIT;
import static Common.Config.PLATFORM_AND_BROWSER;


public class CommonAction {

    private  static WebDriver driver = null;
static ChromeOptions chromeOptions = new ChromeOptions();
    private CommonAction(){
    }

    @BeforeTest
    public static WebDriver createDriver() throws MalformedURLException {
        if(driver == null){
            switch (PLATFORM_AND_BROWSER){
                case "win_chrome":
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
                    driver = new RemoteWebDriver(new URL("http://192.168.0.104:4444//wd/hub"), chromeOptions);   //driver = new RemoteWebDriver(new URL("http://localhost:4445/wd/hub"), chromeOptions);
                    break;
                default:
                    Assert.fail("Incorrect platform or browser name:" + PLATFORM_AND_BROWSER);
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        }

        return  driver;
    }
}

