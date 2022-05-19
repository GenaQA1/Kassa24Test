package Page.RegistrForm;

import Page.Base.BasePage;
import Page.LoginPasset.LoginPasset;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistForm extends BasePage {
    public RegistForm(WebDriver driver) {
        super(driver);
    }

}

//    //Поля для регистрация
//    private final By registrForm = By.xpath("//*[@id='login-form']/div/div/div/div/div[1]/ul/li[2]");
//    private final By nubmersForm = By.xpath("//*[@id='signupform-username']");
//    private final By mailForm = By.xpath("//*[@id='signupform-email']");
//    private final By profileForm = By.xpath("//*[@id='form-signup']/div[3]/div/div[1]/div");
//    private final By urPrifleForm = By.xpath("//*[@id='form-signup']/div[3]/div/div[1]/ul/li[2]");
//    private final By passForm = By.xpath("//*[@id='signupform-password']");
//    private final By boxForm = By.xpath("//*[@id='form-signup']/div[6]/div/div/div/label");
//    private final By btnRegistrCount = By.xpath("//*[@id='form-signup']/div[6]/button");
//
//    private final By btnExitCount = By.xpath("/html/body/main/article/section/div[1]/nav/ul/li[6]");
//
//    //Элементы ОР
//
//    private final By checkSucLogin = By.xpath("//a[text()='Кабинет']");
//    private final By checkWaiorNubmer = By.xpath("//*[@id='form-signup']/div[1]/div[2]");
//    private final By checkWariorMail = By.xpath("//*[@id='form-signup']/div[2]/div/div");
//    private final By checkWariorPass = By.xpath("//*[@id='form-signup']/div[4]/div/div");
//    private final By checkWariorCheckBox = By.xpath("//*[@id='form-signup']/div[6]/div/div/div/div");
//
//    //Ввод данных
//    public RegistForm clickRegistrForm() {
//        driver.findElement(registrForm).click();
//        return this;
//    }
//
//    public RegistForm sendKeyNubmersForm() {
//        driver.findElement(nubmersForm).click();
//        driver.findElement(nubmersForm).sendKeys("9785662218");
//        return this;
//    }
//
//    public RegistForm sendKeyMail() {
//        driver.findElement(mailForm).click();
//        driver.findElement(mailForm).sendKeys("tester111@toredo.ru");
//        return this;
//    }
//
//    public RegistForm acceptProfile() {
//        driver.findElement(profileForm).click();
//        return this;
//    }
//
//    public RegistForm acceptUrProfile() {
//        driver.findElement(urPrifleForm).click();
//        return this;
//    }
//
//    public RegistForm sendKeyPass() {
//        driver.findElement(passForm).click();
//        driver.findElement(passForm).sendKeys("123456");
//        return this;
//    }
//
//    public RegistForm clickBoxForm() {
//        driver.findElement(boxForm).click();
//        return this;
//    }
//
//    public RegistForm btnAcceptCount() {
//        driver.findElement(btnRegistrCount).click();
//        return this;
//    }
//
//    public RegistForm btnExitCounting() {
//        driver.findElement(btnExitCount);
//        return this;
//    }
//
//
//    //Проверка успешной авторизации
//    public RegistForm checkSuccesfulRegist() {
//        waitElementIsVisible(driver.findElement(checkSucLogin));
//        if (checkSucLogin != null) {
//            System.out.println("Вход выполнен успешно");
//        } else {
//            System.out.println("Вход не выполнен");
//        }
//        return this;
//    }
//
//    //Проверка уведомлений об ошибках
//    public RegistForm checkWariorNubmer() {
//        waitElementIsVisible(driver.findElement(checkWaiorNubmer));
//        if (checkWaiorNubmer != null) {
//            System.out.println("Выдает предупреждение под полем 'Номер телефона' ");
//        } else {
//            System.out.println("Вход выполнен");
//        }
//        return this;
//    }
//
//    public RegistForm checkWariorMail() {
//        waitElementIsVisible(driver.findElement(checkWariorMail));
//        if (checkWariorMail != null) {
//            System.out.println("Выдает предупреждение под полем 'Электронная почта' ");
//        } else {
//            System.out.println("Вход выполнен");
//        }
//        return this;
//    }
//
//    public RegistForm checkWariorPass() {
//        waitElementIsVisible(driver.findElement(checkWariorPass));
//        if (checkWariorMail != null) {
//            System.out.println("Выдает предупреждение под полем 'Пароль' ");
//        } else {
//            System.out.println("Вход выполнен");
//        }
//        return this;
//    }
//
//    public RegistForm checkWariorBox() {
//        if (checkWariorCheckBox != null) {
//            System.out.println("Выдает предупреждение под Чек боксом ");
//        } else {
//            System.out.println("Вход выполнен");
//        }
//        return this;
//    }
//}
