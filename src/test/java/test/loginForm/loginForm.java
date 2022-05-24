package test.loginForm;


import org.testng.annotations.Test;
import test.base.BaseTest;

import java.net.MalformedURLException;

public class loginForm extends BaseTest {

    public loginForm() throws MalformedURLException {
    }

    @Test
    //Тест кейс - 1
    public void checkLogincount(){
        basePage.open("https://kassa24.ru/");

        firstPage
                .btnclick()
                .sendkeyLogin()
                .sendkeyPass()
                .clickBtnAccept();

        loginPasset
                .checkLogin();
    }

    @Test
    //Тест кейс - 2
    public void checkLoginCountLogin(){
        basePage.open("https://kassa24.ru/");

        firstPage
                .btnclick()
                .sendkeyPass()
                .clickBtnAccept();
        loginPasset
                .checkNumberWhite();
    }

    @Test
    //Тест кейс - 3
    public void checkPassCountPass(){
        basePage.open("https://kassa24.ru/");

        firstPage
                .btnclick()
                .sendkeyLogin()
                .clickBtnAccept();

        loginPasset
                .checkPassWhite();
    }

    @Test
    //Тест кейс - 4
    public void checkPassCountWrong(){
        basePage.open("https://kassa24.ru/");

        firstPage
                .btnclick()
                .sendkeyLogin()
                .sendkeyPassWrong()
                .clickBtnAccept();
        loginPasset
                .checkPassWrong();

    }
}
