package test.popUp;

import Page.PopUp.PopUp;
import org.testng.annotations.Test;
import test.base.BaseTest;

import java.net.MalformedURLException;

public class popUp extends BaseTest {
    public popUp() throws MalformedURLException {
    }

    //Пустое поле ввода номера телефона
    @Test
    public void resultAppearanceModalFieldNumberClear() throws InterruptedException {
        basePage.open("https://simferopol.kassa24.ru/event/testovoe-fiksiki-igraut-v-cirk-testovoe");

        oplataTickets
                .clickbtnPay()
                .choosePlace()
                .clickBtnPayPlace()
                .clickBtnAccept();

        popUp
                .checkModalFieldNumberClear();
    }

    //Ввести неполный номер телефона
    @Test
    public void resultAppearanceModalFieldNumberFive() throws InterruptedException {
        basePage.open("https://simferopol.kassa24.ru/event/testovoe-fiksiki-igraut-v-cirk-testovoe");

        oplataTickets
                .clickbtnPay()
                .choosePlace()
                .clickBtnPayPlace()
                .fieldPhoneSigUpFiveSimvle()
                .clickBtnAccept();

        popUp
                .checkModalFieldNumberClear();
    }


    //Выбор билетов свыше 10
    @Test
    public void resultAppearanceModalErrorTenTickets() throws InterruptedException {
        basePage.open("https://simferopol.kassa24.ru/event/testovoe-fiksiki-igraut-v-cirk-testovoe");

        oplataTickets
                .clickbtnPay()
                .choosePlaceEleven();

        popUp
                .checkModalErrorTenTickets();
    }

    //Несуществющий номер в поле ввода номера телефона
    @Test
    public void resultAppearanceModalErrorFieldNumber() throws InterruptedException {
        basePage.open("https://simferopol.kassa24.ru/event/testovoe-fiksiki-igraut-v-cirk-testovoe");

        oplataTickets
                .clickbtnPay()
                .choosePlace()
                .clickBtnPayPlace()
                .fieldPhoneSigUpError()
                .clickBtnAccept();

        popUp
                .checkModalErrorFieldNumber();
    }

    //Ввести не правильный код подтверждения номера телефона
    @Test
    public void resultAppearanceModalErrorFieldSmsCode() throws InterruptedException {
        basePage.open("https://simferopol.kassa24.ru/event/testovoe-fiksiki-igraut-v-cirk-testovoe");

        oplataTickets
                .clickbtnPay()
                .choosePlace()
                .clickBtnPayPlace()
                .fieldPhoneSigUp()
                .clickBtnAccept()
                .fieldPhonePassError()
                .clickBtnAcceptCode();
        popUp
                .checkModalErrorFieldSmsCode();
    }

    //Пустое поле подтверждения номера телефона
    @Test
    public void resultAppearanceModalErrorFieldClearCode() throws InterruptedException {
        basePage.open("https://simferopol.kassa24.ru/event/testovoe-fiksiki-igraut-v-cirk-testovoe");

        oplataTickets
                .clickbtnPay()
                .choosePlace()
                .clickBtnPayPlace()
                .fieldPhoneSigUp()
                .clickBtnAccept()
                .clickBtnAcceptCode();

        popUp
                .checkModalErrorFieldClearCode();
    }

    @Test
    public void resultAppearanceModalWarriorBeforePlace() throws InterruptedException {
        basePage.open("https://yalta.kassa24.ru/event/spektakl-cestnaa-zensina-testovoe");

        oplataTickets
                .clickbtnPay();

        popUp
                .checkModalWarriorBeforePlace();
    }


}
