package test.oplataTicker;



import org.testng.annotations.Test;
import test.base.BaseTest;

import java.net.MalformedURLException;

public class oplataTickets extends BaseTest {
    public oplataTickets() throws MalformedURLException {
    }

//    @Test
//
//    public void checkResultPay() throws InterruptedException {
//        basePage.open("http://simferopol.ticket.bestit.com.ua/");
//
//        oplataTickets
//                .clickMoment()
//                .clickbtnPay()
//                .choosePlace()
//                .clickBtnPayPlace()
//                .fieldPhoneSigUp()
//                .clickBtnAccept()
//                .fieldPhonePass()
//                .clickBtnAcceptCode()
//                .fieldName()
//                .fieldMail()
//                .clickTestPay()
//                .clickBtnAcceptPay()
//                .checkResultTestPay();
//    }

    @Test
    public void checkCostClickPlace() throws InterruptedException {
        basePage.open("https://simferopol.kassa24.ru/event/testovoe-fiksiki-igraut-v-cirk-testovoe");

        oplataTickets
                //.clickMoment()
                .clickbtnPay()
                .choosePlace()
                .clickPlace();
    }

    @Test
    public void checkCostDelitePlace() throws InterruptedException {
        basePage.open("https://simferopol.kassa24.ru/event/testovoe-fiksiki-igraut-v-cirk-testovoe");

        oplataTickets
                //.clickMoment()
                .clickbtnPay()
                .choosePlace()
                .delitePlace();
    }

    //Проверка присутствует ли блок "Доставка" при выборе способа оплаты "Оплата наличными в кассе"
    @Test
    public void checkResultPayPark() throws InterruptedException {
        basePage.open("https://simferopol.kassa24.ru/event/testovoe-fiksiki-igraut-v-cirk-testovoe");

        oplataTickets
                //.clickMoment()
                .clickbtnPay()
                .choosePlace()
                .clickBtnPayPlace()
                .fieldPhoneSigUp()
                .clickBtnAccept()
                .fieldPhonePass()
                .clickBtnAcceptCode()
                .fieldName()
                .fieldMail()
                .clickPayKassa()
                .checkKassa24()
                .clickBtnAcceptPay()
                .checkResultPayPark();
    }

    @Test
    public void checkResultPayPushka() throws InterruptedException {
        basePage.open("https://simferopol.kassa24.ru/event/testovoe-fiksiki-igraut-v-cirk-testovoe");

        oplataTickets
                //.clickMoment()
                .clickbtnPay()
                .choosePlaceOne()
                .clickBtnPayPlace()
                .fieldPhoneSigUp()
                .clickBtnAccept()
                .fieldPhonePass()
                .clickBtnAcceptCode()
                .fieldName()
                .fieldMail()
                .clickPushkaPay()
                .chechResultPayPushks()
                .clickBtnAcceptPay()
                .checkResultColletctionPay();

    }

    @Test
    public void checResultCollectionPay() throws InterruptedException {
        basePage.open("https://simferopol.kassa24.ru/event/testovoe-fiksiki-igraut-v-cirk-testovoe");

        oplataTickets
                //.clickMoment()
                .clickbtnPay()
                .choosePlace()
                .clickBtnPayPlace()
                .fieldPhoneSigUp()
                .clickBtnAccept()
                .fieldPhonePass()
                .clickBtnAcceptCode()
                .fieldName()
                .fieldMail()
                .clickPushkaPay()
                .clickBtnCollectionPay()
                .checkResultCollectionPushka();

    }

    @Test
    public void checkResultCollectionPayUniteller() throws InterruptedException {
        basePage.open("https://simferopol.kassa24.ru/event/testovoe-fiksiki-igraut-v-cirk-testovoe");

        oplataTickets
                //.clickMoment()
                .clickbtnPay()
                .choosePlace()
                .clickBtnPayPlace()
                .fieldPhoneSigUp()
                .clickBtnAccept()
                .fieldPhonePass()
                .clickBtnAcceptCode()
                .fieldName()
                .fieldMail()
                .clickPushkaPay()
                .clickBtnCollectionPay()
                .clickBtnTicket()
                .fieldName()
                .fieldMail()
                .inputPhone()
                .clickBtnAcceptCollectionPay()
                .checkResultColletctionPay();
    }

//    @Test
//    public void checkResultCostPriceBonus() throws InterruptedException {
//        basePage.open("http://simferopol.ticket.bestit.com.ua/");
//
//
//        firstPage
//                .btnclick()
//                .sendkeyLogin()
//                .sendkeyPass()
//                .clickBtnAccept();
//        Thread.sleep(1000);
//
//        oplataTickets
//                .clickMoment()
//                .clickbtnPay()
//                .choosePlace()
//                .clickBtnPayPlace()
//                .fieldPhoneSigUp()
//                .clickBtnAccept()
//                .fieldPhonePass()
//                .clickBtnAcceptCode()
//                .fieldName()
//                .fieldMail()
//                .clickCheckBoxBonus()
//                .mathResultPriceBonus();
//    }
//
//    @Test
//    public void checkResultTransition() throws InterruptedException {
//        basePage.open("http://simferopol.ticket.bestit.com.ua/");
//
//
//        firstPage
//                .btnclick()
//                .sendkeyLogin()
//                .sendkeyPass()
//                .clickBtnAccept();
//        Thread.sleep(1000);
//
//        oplataTickets
//                .clickMoment()
//                .clickbtnPay()
//                .choosePlace()
//                .clickBtnPayPlace()
//                .fieldPhoneSigUp()
//                .clickBtnAccept()
//                .fieldPhonePass()
//                .clickBtnAcceptCode()
//                .fieldName()
//                //.fieldMail()
//                .clickCheckBoxBonus()
//                .clickBtnAcceptPay()
//                .resultTransitUnitaller();
//    }
//
//
//    @Test
//    public void checkResultCostPriceSale() throws InterruptedException {
//        basePage.open("http://simferopol.ticket.bestit.com.ua/");
//
//
//        firstPage
//                .btnclick()
//                .sendkeyLogin()
//                .sendkeyPass()
//                .clickBtnAccept();
//        Thread.sleep(1000);
//
//        oplataTickets
//                .clickMoment()
//                .clickbtnPay()
//                .choosePlace()
//                .clickBtnPayPlace()
//                .fieldPhoneSigUp()
//                .clickBtnAccept()
//                .fieldPhonePass()
//                .clickBtnAcceptCode()
//                .inputFieldSale()
//                .clickBtnSale()
//                .mathResultPriceSale();
//    }
//
//
//    @Test
//    public void checkTransitUnitellerSalePay() throws InterruptedException {
//        basePage.open("http://simferopol.ticket.bestit.com.ua/");
//
//
//        firstPage
//                .btnclick()
//                .sendkeyLogin()
//                .sendkeyPass()
//                .clickBtnAccept();
//        Thread.sleep(1000);
//
//        oplataTickets
//                .clickMoment()
//                .clickbtnPay()
//                .choosePlace()
//                .clickBtnPayPlace()
//                .fieldPhoneSigUp()
//                .clickBtnAccept()
//                .fieldPhonePass()
//                .clickBtnAcceptCode()
//                .inputFieldSale()
//                .clickBtnSale()
//                .clickBtnAcceptPay()
//                .resultTransitUnitaller();
//    }
//

    @Test
    public void checkChooseTicketPlacePlus() throws InterruptedException {
        basePage.open("https://yalta.kassa24.ru/event/spektakl-cestnaa-zensina-testovoe");

        oplataTickets
                .clickbtnPay()
                .chooseTicketClickFivePlus()
                .checkResultChoosePlacePlus();
    }

    @Test
    public void checkChooseTicketPlaceMinus() throws InterruptedException {
        basePage.open("https://yalta.kassa24.ru/event/spektakl-cestnaa-zensina-testovoe");

        oplataTickets
                .clickbtnPay()
                .chooseTicketClickFivePlus()
                .chooseTicketClickFiveMinus()
                .checkResultChoosePlaceMinus();

    }

//    @Test
//    public void checkTransitClickBtnPay() throws InterruptedException {
//
//        basePage.open("https://yalta.kassa24.ru/event/spektakl-cestnaa-zensina-testovoe");
//
//        oplataTickets
//                .clickBtnPlaceEvent()
//                .chooseTicketClickFivePlus()
//                .checkResultChoosePlacePlus()
//                .clickBtnAcceptPay()
//                .fieldName()
//                .inputPhone()
//                .fieldMail()
//                .clickTestPay()
//                .clickBtnAcceptPay()
//                .checkResultTestPay();
//    }

    @Test
    public void checkUkrainMask() throws InterruptedException {

        basePage.open("https://yalta.kassa24.ru/event/spektakl-cestnaa-zensina-testovoe");

        oplataTickets
                .clickbtnPay()
                .chooseTicketClickFivePlus()
                .checkResultChoosePlacePlus()
                .clickBtnAcceptPay()
                .fieldName()
                .clickFieldMask()
                .clickMaskUrkain()
                .inputPhone()
                .checkResultMaskUkrain();

    }

    @Test
    public void checkChoosePlaceBtnPay() throws InterruptedException {
        basePage.open("https://yalta.kassa24.ru/event/spektakl-cestnaa-zensina-testovoe-kopia");

        oplataTickets
                .clickbtnPay()
                .chooseTicketsClickBtnPay()
                .checkResultChooseTicketsBtnPay();
    }

    @Test
    public void checkСhoosePlace() throws InterruptedException {
        basePage.open("https://yalta.kassa24.ru/event/spektakl-cestnaa-zensina-testovoe-kopia");

        oplataTickets
                .clickbtnPay()
                .clickBtnPoint()
                .checkResultChooseTicketsBtnPay();

    }


    @Test
    public void checkChoosePriceClickPoint() throws InterruptedException {
        basePage.open("https://yalta.kassa24.ru/event/spektakl-cestnaa-zensina-testovoe-kopia");

        oplataTickets
                .clickbtnPay()
                .clickBtnPoint()
                .checkResultChooseTicketsBtnPay()
                .clickPlace();

    }

    @Test
    public void checkChoosePriceDelitePoint() throws InterruptedException {
        basePage.open("https://yalta.kassa24.ru/event/spektakl-cestnaa-zensina-testovoe-kopia");

        oplataTickets
                .clickbtnPay()
                .chooseTicketsClickBtnPay()
                .checkResultChooseTicketsBtnPay()
                .delitePlace();
    }

//    //Проверка пустого поля "Имя"
//    @Test
//    public void checkResultPayNotName() throws InterruptedException {
//        basePage.open("http://simferopol.ticket.bestit.com.ua/");
//
//        oplataTickets
//                .clickMoment()
//                .clickbtnPay()
//                .choosePlace()
//                .clickBtnPayPlace()
//                .fieldPhoneSigUp()
//                .clickBtnAccept()
//                .fieldPhonePass()
//                .clickBtnAcceptCode()
//                .fieldMail()
//                .clickTestPay()
//                .clickBtnAcceptPay()
//                .checkResultWarriorName();
//    }
//
//    //Проверка пустого поля "Почта"
//    @Test
//    public void checkResultPayNotMail() throws InterruptedException{
//        basePage.open("http://simferopol.ticket.bestit.com.ua/");
//
//        oplataTickets
//                .clickMoment()
//                .clickbtnPay()
//                .choosePlace()
//                .clickBtnPayPlace()
//                .fieldPhoneSigUp()
//                .clickBtnAccept()
//                .fieldPhonePass()
//                .clickBtnAcceptCode()
//                .fieldName()
//                .clickTestPay()
//                .clickBtnAcceptPay()
//                .checkResultWarriorMail();
//
//    }
//
//
//    //Проверка пустого чек бокса
//    @Test
//    public void checkResultPayNotCheckBox() throws InterruptedException{
//        basePage.open("http://simferopol.ticket.bestit.com.ua/");
//
//        oplataTickets
//                .clickMoment()
//                .clickbtnPay()
//                .choosePlace()
//                .clickBtnPayPlace()
//                .fieldPhoneSigUp()
//                .clickBtnAccept()
//                .fieldPhonePass()
//                .clickBtnAcceptCode()
//                .fieldName()
//                .fieldMail()
//                .clickCheckBox()
//                .clickTestPay()
//                .clickBtnAcceptPay()
//                .checkResultWarriorCheckBox();
//
//    }
//
//

//    @Test
//    public void checkResultCostServiseFee() throws InterruptedException {
//        basePage.open("http://admin.ticket.bestit.com.ua/event/index");
//
//        sendKeyLoginAdmin();
//        sendKeyPassAdmin();
//        clickBtnAdmin();
//        clickContent();
//        clickEvent();
//        fieldFiltersName();
//        clickChangeEvent();
//        changeServise0();
//        clickBtnAcceptEvent();
//
//        basePage.open("http://simferopol.ticket.bestit.com.ua/");
//
//        oplataTickets
//                .clickMoment()
//                .clickbtnPay()
//                .choosePlace()
//                .clickBtnPayPlace()
//                .fieldPhoneSigUp()
//                .clickBtnAccept()
//                .fieldPhonePass()
//                .clickBtnAcceptCode()
//                .checkResultServiceFee();
//    }


    }


