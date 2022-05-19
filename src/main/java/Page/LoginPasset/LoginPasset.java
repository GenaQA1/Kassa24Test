package Page.LoginPasset;

import Page.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPasset extends BasePage {
    public LoginPasset(WebDriver driver) {
        super(driver);
    }

    private final By login = By.xpath("//a[text()='Кабинет']");
    private final By nubmerTel = By.xpath("//*[@id='form-login']/div[1]/div[2]");
    private final By passCount = By.xpath("//*[@id='form-login']/div[2]/div/div");

    //Успеный вход в личный кабинет
    public LoginPasset checkLogin(){
        waitElementIsVisible(driver.findElement(login));
        if (login != null){
            System.out.println("Вход выполнен успешно");
        }else{
            System.out.println("Вход не выполнен");
        }
        return this;
    }
    //Не введен Номер телефона
    public LoginPasset checkNumberWhite() {
        waitElementIsVisible(driver.findElement(nubmerTel));
        if (nubmerTel == nubmerTel) {
            System.out.println("Выводит ошибку правильную");
        } else {
            System.out.println("Не выдал ошибку");
        }
        return this;
    }

    //Пустое поле "пароль"
    public LoginPasset checkPassWhite(){
        waitElementIsVisible(driver.findElement(passCount));
        if (passCount == passCount){
            System.out.println("Выводит ошибку правильную");
        } else {
            System.out.println("Не выдал ошибку");
        }
        return this;
    }

    //Не правильный пароль от учетки
    public LoginPasset checkPassWrong(){
        waitElementIsVisible(driver.findElement(passCount));
        if (passCount == passCount){
            System.out.println("Выводит ошибку правильную");
        } else {
            System.out.println("Не выдал ошибку");
        }
        return this;
    }
}
