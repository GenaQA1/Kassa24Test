package test.widgetAppWlogo;

import org.testng.annotations.Test;
import test.base.BaseTest;

import java.net.MalformedURLException;

public class widgetAppWlogo extends BaseTest {


    public widgetAppWlogo() throws MalformedURLException {
    }

    //Правильное вычисления сервсиного сбора и общей суммы заказа (20 билетов) (5%)
    @Test
    public void checkResultCostServiceFee5() throws InterruptedException {

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
//        changeServise5();
//        Thread.sleep(1000);
//        clickBtnAcceptEvent();


        basePage.open("http://gate.ticket.bestit.com.ua/app-wlogo/dist/?login=+7(978)892-92-38&user_token=mGkoQEPclcQft1BxbdmuFBkCkQtIUNxo");

        widgetAppwlogo
                .clickBtnAddition()
                .clickBtnConnect()
                .clickEvent()
                .clickBtnPlace()
                .choosePlace()
                .resultMathServise5()
                .checkResultServise5();

    }


    //Удаления места путем удаления билета из пула выбранных билетов (20 билетов) (5%)
    @Test
    public void checkResulDeliteServiceFee5() throws InterruptedException {

        basePage.open("http://gate.ticket.bestit.com.ua/app-wlogo/dist/?login=+7(978)892-92-38&user_token=mGkoQEPclcQft1BxbdmuFBkCkQtIUNxo");

        widgetAppwlogo
                .clickBtnAddition()

                .clickBtnConnect()
                .clickEvent()
                .clickBtnPlace()
                .choosePlace()
                .resultServiseeDelite5();
    }

    //Проверка вычисления сервсиного сбора и суммы заказа при исключении места тапом по схеме (20 билетов) (5%)
    @Test
    public void checkResulClickServiceFee5() throws InterruptedException {

        basePage.open("https://gate.ticket.bestit.com.ua/app-wlogo/dist/?login=+7(978)892-92-38&user_token=mGkoQEPclcQft1BxbdmuFBkCkQtIUNxo");

        widgetAppwlogo
                .clickBtnAddition()
                .clickBtnConnect()
                .clickEvent()
                .clickBtnPlace()
                .choosePlace()
                .checkResultServiseeClickPlace5();
    }
//
//
    //Удаления места путем удаления билета из пула выбранных билетов (20 билетов) (2%)
    @Test
    public void checkResulDeliteServiceFee2() throws InterruptedException {

        basePage.open("http://admin.ticket.bestit.com.ua/event/index");


        sendKeyLoginAdmin();
        sendKeyPassAdmin();
        clickBtnAdmin();
        clickContent();
        clickEvent();
        fieldFiltersName();
        clickChangeEvent();
        changeServise2();
        Thread.sleep(1000);
        clickBtnAcceptEvent();


        basePage.open("https://gate.ticket.bestit.com.ua/app-wlogo/dist/?login=+7(978)892-92-38&user_token=mGkoQEPclcQft1BxbdmuFBkCkQtIUNxo");

        widgetAppwlogo
                .clickBtnAddition()
                .clickBtnConnect()
                .clickEvent()
                .clickBtnPlace()
                .choosePlace()
                .resultServiseeDelite2();
    }

    //Проверка вычисления сервсиного сбора и суммы заказа при исключении места тапом по схеме (20 билетов) (2%)
    @Test
    public void checkResulClickServiceFee2() throws InterruptedException {

        basePage.open("https://gate.ticket.bestit.com.ua/app-wlogo/dist/?login=+7(978)892-92-38&user_token=mGkoQEPclcQft1BxbdmuFBkCkQtIUNxo");

        widgetAppwlogo
                .clickBtnAddition()
                .clickBtnConnect()
                .clickEvent()
                .clickBtnPlace()
                .choosePlace()
                .checkResultServiseeClickPlace2();
    }
//
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
        Thread.sleep(1000);
        clickBtnAcceptEvent();


        basePage.open("https://gate.ticket.bestit.com.ua/app-wlogo/dist/?login=+7(978)892-92-38&user_token=mGkoQEPclcQft1BxbdmuFBkCkQtIUNxo");

        widgetAppwlogo
                .clickBtnAddition()
                .clickBtnConnect()
                .clickEvent()
                //.clickbtnEventKassa24()
                .clickBtnPlace()
                .choosePlace()
                .resultServiseeDelite3();
    }
    //Проверка вычисления сервсиного сбора и суммы заказа при исключении места тапом по схеме (20 билетов) (3%)
    @Test
    public void checkResulClickServiceFee3() throws InterruptedException {

        basePage.open("https://gate.ticket.bestit.com.ua/app-wlogo/dist/?login=+7(978)892-92-38&user_token=mGkoQEPclcQft1BxbdmuFBkCkQtIUNxo");

        widgetAppwlogo
                .clickBtnAddition()
                .clickBtnConnect()
                .clickEvent()
                //.clickbtnEventKassa24()
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
        Thread.sleep(1000);
        clickBtnAcceptEvent();


        basePage.open("https://gate.ticket.bestit.com.ua/app-wlogo/dist/?login=+7(978)892-92-38&user_token=mGkoQEPclcQft1BxbdmuFBkCkQtIUNxo");

        widgetAppwlogo
                .clickBtnAddition()
                .clickBtnConnect()
                .clickEvent()
                //.clickbtnEventKassa24()
                .clickBtnPlace()
                .choosePlace()
                .checkResultServiceFee0();
    }



}
