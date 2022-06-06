package Page.PopUp;

import Page.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PopUp extends BasePage {
    public PopUp(WebDriver driver) {
        super(driver);
    }

    //Элементы для взаимодействия
    public final By modalFieldNumberClear = By.xpath("//*[text()='Введён неполный номер']");
    public final By modalErrorTenTickets = By.xpath("//*[text()='В заказе не может быть больше 10 билетов']");
    public final By modalErrorFieledNubmer = By.xpath("//*[text()='Ошибка отправки СМС.']");
    public final By modalErrorFieldSmsCode = By.xpath("//*[text()='Код неверный.']");
    public final By modalErrorFieldClearCode = By.xpath("//*[text()='Укажите код из СМС']");
    public final By modalWarriorBeforePlace = By.xpath("//*[text()='Привет Гена']");


    public PopUp checkModalFieldNumberClear() throws InterruptedException {
        Thread.sleep(1500);
    String textModalNumberClear = driver.findElement(modalFieldNumberClear).getText();
        Assert.assertEquals(textModalNumberClear,"Введён неполный номер","Что-то с модальным окном");
    System.out.println(textModalNumberClear);
    return this;
    }



    public PopUp checkModalErrorTenTickets() throws InterruptedException {
        Thread.sleep(1500);
        String textModalErrorTenTickets = driver.findElement(modalErrorTenTickets).getText();
        Assert.assertEquals(textModalErrorTenTickets,"В заказе не может быть больше 10 билетов","Что-то с модальным окном");
        return this;
    }

    public PopUp checkModalErrorFieldNumber() throws InterruptedException {
        Thread.sleep(1500);
        String textModalErrorFieldNumber = driver.findElement(modalErrorFieledNubmer).getText();
        Assert.assertEquals(textModalErrorFieldNumber,"Ошибка отправки СМС.","Что-то не так с окном");
        return this;
    }

    public PopUp checkModalErrorFieldSmsCode() throws InterruptedException {
        Thread.sleep(1500);
        String textModalErrorFieldSmsCode = driver.findElement(modalErrorFieldSmsCode).getText();
        Assert.assertEquals(textModalErrorFieldSmsCode,"Код неверный.","Что-то не так с окном");
        return this;
    }

    public PopUp checkModalErrorFieldClearCode() throws InterruptedException {
        Thread.sleep(1500);
        String textModalErrorFieldClearCoder = driver.findElement(modalErrorFieldClearCode).getText();
        Assert.assertEquals(textModalErrorFieldClearCoder,"Укажите код из СМС","Что-то не так с окном");
        return this;
    }

    public PopUp checkModalWarriorBeforePlace() throws InterruptedException {
        Thread.sleep(1500);
        String textModalWarriorBeforePlace = driver.findElement(modalWarriorBeforePlace).getText();
        Assert.assertEquals(textModalWarriorBeforePlace,"Привет Гена","Что-то не так с окном");
        return this;
    }


}
