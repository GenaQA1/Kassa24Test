package test.widgetVkKassa24;

import org.testng.annotations.Test;
import test.base.BaseTest;

import java.net.MalformedURLException;

public class widgetVkKassa24 extends BaseTest {

    public widgetVkKassa24() throws MalformedURLException {
    }

    //Правильное вычисления сервсиного сбора и общей суммы заказа (20 билетов) (5%)
    @Test
 public void checkResultCostServiceFee5() throws InterruptedException {

//        basePage.open("http://admin.ticket.bestit.com.ua/event/index");
//
//
//               sendKeyLoginAdmin();
//               sendKeyPassAdmin();
//               clickBtnAdmin();
//               clickContent();
//               clickEvent();
//               fieldFiltersName();
//               clickChangeEvent();
//               changeServise5();
//               clickBtnAcceptEvent();


        basePage.open("https://gate.ticket.bestit.com.ua/app/dist/?login=+7(978)892-92-38&user_token=mGkoQEPclcQft1BxbdmuFBkCkQtIUNxo");

        widgetVkKassa24
                .clickBtnAddition()
                .clickBtnConnect()
                .clickEvent()
                .clickbtnEventKassa24()
                .clickBtnPlace()
                .choosePlace()
                .resultMath();

    }


    //Удаления места путем удаления билета из пула выбранных билетов (20 билетов) (5%)
    @Test
    public void checkResulDeliteServiceFee5() throws InterruptedException {

        basePage.open("https://gate.ticket.bestit.com.ua/app/dist/?login=+7(978)892-92-38&user_token=mGkoQEPclcQft1BxbdmuFBkCkQtIUNxo");

        widgetVkKassa24
                .clickBtnAddition()
                .clickBtnConnect()
                .clickEvent()
                .clickbtnEventKassa24()
                .clickBtnPlace()
                .choosePlace()
                .resultServiseeDelite5();
    }

    //Проверка вычисления сервсиного сбора и суммы заказа при исключении места тапом по схеме (20 билетов) (5%)
    @Test
    public void checkResulClickServiceFee5() throws InterruptedException {

        basePage.open("https://gate.ticket.bestit.com.ua/app/dist/?login=+7(978)892-92-38&user_token=mGkoQEPclcQft1BxbdmuFBkCkQtIUNxo");

        widgetVkKassa24
                .clickBtnAddition()
                .clickBtnConnect()
                .clickEvent()
                .clickbtnEventKassa24()
                .clickBtnPlace()
                .choosePlace()
                .checkResultServiseeClickPlace5();
    }


    //Удаления места путем удаления билета из пула выбранных билетов (20 билетов) (2%)
    @Test
    public void checkResulDeliteServiceFee2() throws InterruptedException {

//        basePage.open("http://admin.ticket.bestit.com.ua/event/index");
//
//
//        sendKeyLoginAdmin();
//        sendKeyPassAdmin();
//        clickBtnAdmin();
//        clickContent();
//        clickEvent();
//        fieldFiltersName();
//        clickChangeEvent();
//        changeServise2();
//        clickBtnAcceptEvent();


        basePage.open("https://gate.ticket.bestit.com.ua/app/dist/?login=+7(978)892-92-38&user_token=mGkoQEPclcQft1BxbdmuFBkCkQtIUNxo");

        widgetVkKassa24
                .clickBtnAddition()
                .clickBtnConnect()
                .clickEvent()
                .clickbtnEventKassa24()
                .clickBtnPlace()
                .choosePlace()
                .resultServiseeDelite2();
    }

    //Проверка вычисления сервсиного сбора и суммы заказа при исключении места тапом по схеме (20 билетов) (2%)
    @Test
    public void checkResulClickServiceFee2() throws InterruptedException {

        basePage.open("https://gate.ticket.bestit.com.ua/app/dist/?login=+7(978)892-92-38&user_token=mGkoQEPclcQft1BxbdmuFBkCkQtIUNxo");

        widgetVkKassa24
                .clickBtnAddition()
                .clickBtnConnect()
                .clickEvent()
                .clickbtnEventKassa24()
                .clickBtnPlace()
                .choosePlace()
                .checkResultServiseeClickPlace2();
    }

    //Удаления места путем удаления билета из пула выбранных билетов (20 билетов) (3%)
    @Test
    public void checkResulDeliteServiceFee3() throws InterruptedException {

        basePage.open("http://admin.ticket.bestit.com.ua/event/index");


        sendKeyLoginAdmin();
        sendKeyPassAdmin();
        clickBtnAdmin();
        clickContent();
        clickEvent();
        fieldFiltersName();
        clickChangeEvent();
        changeServise3();
        clickBtnAcceptEvent();


        basePage.open("https://gate.ticket.bestit.com.ua/app/dist/?login=+7(978)892-92-38&user_token=mGkoQEPclcQft1BxbdmuFBkCkQtIUNxo");

        widgetVkKassa24
                .clickBtnAddition()
                .clickBtnConnect()
                .clickEvent()
                .clickbtnEventKassa24()
                .clickBtnPlace()
                .choosePlace()
                .resultServiseeDelite3();
    }
    //Проверка вычисления сервсиного сбора и суммы заказа при исключении места тапом по схеме (20 билетов) (3%)
    @Test
    public void checkResulClickServiceFee3() throws InterruptedException {

        basePage.open("https://gate.ticket.bestit.com.ua/app/dist/?login=+7(978)892-92-38&user_token=mGkoQEPclcQft1BxbdmuFBkCkQtIUNxo");

        widgetVkKassa24
                .clickBtnAddition()
                .clickBtnConnect()
                .clickEvent()
                .clickbtnEventKassa24()
                .clickBtnPlace()
                .choosePlace()
                .checkResultServiseeClickPlace3();
    }

    @Test
    public void checkResulDeliteServiceFee0() throws InterruptedException {

        basePage.open("http://admin.ticket.bestit.com.ua/event/index");


        sendKeyLoginAdmin();
        sendKeyPassAdmin();
        clickBtnAdmin();
        clickContent();
        clickEvent();
        fieldFiltersName();
        clickChangeEvent();
        changeServise0();
        clickBtnAcceptEvent();


        basePage.open("https://gate.ticket.bestit.com.ua/app/dist/?login=+7(978)892-92-38&user_token=mGkoQEPclcQft1BxbdmuFBkCkQtIUNxo");

        widgetVkKassa24
                .clickBtnAddition()
                .clickBtnConnect()
                .clickEvent()
                .clickbtnEventKassa24()
                .clickBtnPlace()
                .choosePlace()
                .checkResultServiceFee0();
    }

}
