package Common;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import static Common.Config.IMPLICIT_WAIT;
import static Common.Config.PLATFORM_AND_BROWSER;


public class CommonAction {

    private  static WebDriver driver = null;

    private CommonAction(){
    }

    @BeforeTest
    public static WebDriver createDriver(){
        if(driver == null){
            switch (PLATFORM_AND_BROWSER){
                case "win_chrome":
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriverLinux");
                    driver = new ChromeDriver();
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

