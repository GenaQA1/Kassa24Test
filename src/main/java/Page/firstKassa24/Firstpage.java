package Page.firstKassa24;

import Page.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Firstpage extends BasePage {
    public Firstpage(WebDriver driver) {
        super(driver);
    }


    By btnCount = By.xpath("//a[text()='Войти']");
    By loginCount = By.xpath("//*[@id='loginform-username']");
    By passCount = By.xpath("//*[@id='loginform-password']");
    By btnAccept = By.xpath("//*[@id='form-login']/div[4]/button");

    public Firstpage btnclick(){
        driver.findElement(btnCount).click();
        return this;
    }


    public Firstpage sendkeyLogin(){
        driver.findElement(loginCount).click();
        driver.findElement(loginCount).sendKeys("9785662219");
    return this;
    }

    public Firstpage sendkeyPass(){
        driver.findElement(passCount).click();
        driver.findElement(passCount).sendKeys("123456");
        return this;
    }

    public Firstpage sendkeyPassWrong(){
        driver.findElement(passCount).click();
        driver.findElement(passCount).sendKeys("1234561");
        return this;
    }

    public Firstpage clickBtnAccept(){
        driver.findElement(btnAccept).click();
        return this;
    }


}
