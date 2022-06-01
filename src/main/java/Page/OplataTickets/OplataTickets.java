package Page.OplataTickets;

import Page.Base.BasePage;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.security.PublicKey;
import java.util.List;


public class OplataTickets extends BasePage {
    public OplataTickets(WebDriver driver) {
        super(driver);
    }

    //Элементы до попадания оформления заказа
    public final By moment = By.xpath("/html/body/main/section[1]/ul/li[3]/a/div[2]/div[1]/h3");
    public final By btnPay = By.xpath("/html/body/main/article/section/section[1]/div/div[2]/div[2]/section/div/a");
    public final By placeAll = By.xpath("//*[@data-blocked = 'false'][position() <6]");
    public final By btnPayPlace = By.xpath("//*[@id='confirmation']");
    public final By btnAccept = By.xpath("//*[@id='order-confirmation-button']");
    public final By btnAcceptCode = By.xpath("//*[@id='order-submit-button']");
    public final By phoneSigUp = By.xpath("//*[@id='order-signup-phone']");
    public final By passPhone = By.xpath("//*[@id='order-signup-code']");
    public final By costTicket = By.xpath("//*[@id='total-price']/span");
    public final By btnDeliteTicket = By.xpath("//*[@id='tickets-list']/ul/li[4]/button");

    //Элементы на странице оплаты
    public final By name = By.xpath("//*[@id='orderform-first_name']");
    public final By mail = By.xpath("//*[@id='orderform-email']");
    public final By checkBox = By.xpath("//*[@id='orderform-agree']");
    public final By btnAcceptPay = By.xpath("//*[text()='Оформить заказ'] ");
    public final By testPay = By.xpath("//*[@id='TEST']");
    public final By payPark =By.xpath("//*[@id='on_receive']");
    public final By payPushka = By.xpath("//*[@id='uniteller_pushkin']");
    public final By serviseeFee = By.xpath("//*[@id='checkout']/section[2]/div[1]/div");
    public final By costServiseeFee = By.xpath("//*[@id='checkout']/section[2]/div[1]/div/strong/span");
    public final By priceTotal = By.xpath("//*[@id='checkout']/section[2]/div[2]/strong/span[1]");
    public final By finalTest = By.xpath("/html/body/main/article/div[1]/div/h1");
    public final By warriorName = By.xpath("//*[@id='checkout']/section[1]/div[3]/div/div[1]/div/div/div");
    public final By warriorMail = By.xpath("//*[@id='checkout']/section[1]/div[3]/div/div[3]/div/div/div");
    public final By warriorCheckBox = By.xpath("//*[@id='checkout']/section[2]/div[4]/div/div");
    public final By btnCollectionPay = By.xpath("//*[@id='checkout']/section[2]/div[5]/button[1]");
    public final By fieldPhoneCollection = By.xpath("//*[@id='orderform-phone']");
    public final By checkBoxBonus = By.xpath("//*[@id='orderform-use_bonus']");
    public final By costUseBonus = By.xpath("//*[@id='checkout']/section[2]/div[1]/div[2]/span");
    public final By fieldSale = By.xpath("//*[@id='orderform-promocode']");
    public final By btnSale = By.xpath("//*[@id='checkout']/section[1]/div[2]/div[2]/div/span");
    public final By countSale = By.xpath("//*[@id='checkout']/section[2]/div[1]/div[2]/span");
    public final By btnPlaceEvent = By.xpath("/html/body/main/article/section/section[1]/div/div[2]/div[2]/section/ul/li[2]/a");
    public final By btnPlusPlace = By.xpath("//*[@id='scheme-wrapper']/div[3]/ul/li/div[3]/button[2]");
    public final By btnMinusPlace = By.xpath("//*[@id='scheme-wrapper']/div[3]/ul/li/div[3]/button[1]");
    public final By countChoosePlace = By.xpath("//span[@class='ticket-count']");
    public final By fieldMask = By.xpath("//*[@id='checkout']/section[1]/div[3]/div/div[2]/div/div/div[2]");
    public final By maskUrkain = By.xpath("//*[@id='checkout']/section[1]/div[3]/div/div[2]/div/div/ul/li[2]");
    public final By btnChoosePlacePay = By.cssSelector("#scheme-scroller > svg > g.scheme-points.scheme-points--rounded > g.scheme-button-block > rect");
    public final By btnChoosePlacePoint = By.xpath("//*[@data-blocked = 'false'][position()<5]");
    public final By ticketInPool = By.xpath("//*[@id='tickets-list']/ul/li");



    public final By fieldCollectionPay = By.xpath("//*[@id='checkout']/section[1]/div[1]/h1");
    public final By fieldInfoCard = By.xpath("//*[@id=\"tab1\"]");
    public final By checkBoxTicket = By.xpath("//p[input]/input[@type='checkbox']");
    public final By btnAcceptCollectionPay = By.xpath("//*[@id='checkout']/section[2]/div[5]/button");



    public final By blockDelivery = By.xpath("//*[@id='delivery']/div[2]");
    public final By acceptPayPark = By.xpath("/html/body/main/article/div[2]/div/p[2]/strong");
    public final By ticketPriceAll = By.xpath("//*[@id='checkout']/section[2]/ul/li/div/strong/span");
    public final By btnPayUniteller = By.xpath("//*[@id='btnPay']");



    //Действия с элементами до оформления заказа
    public OplataTickets clickMoment() {
        driver.findElement(moment).click();
        return this;
    }

    public OplataTickets clickbtnPay() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(btnPay).click();
        return this;
    }
    public OplataTickets choosePlaceOne(){
        driver.findElement(placeAll).click();
        return this;
    }
    public OplataTickets choosePlace(){
        List<WebElement> elementList = driver.findElements(placeAll);
        for (WebElement element : elementList){
            element.click();
        }
        return this;
    }


    public OplataTickets clickBtnPayPlace() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(btnPayPlace).click();
        return this;
    }

    public OplataTickets fieldPhoneSigUp() {
        try {
            driver.findElement(phoneSigUp).click();
            driver.findElement(phoneSigUp).clear();
            driver.findElement(phoneSigUp).sendKeys("9999999999");
        } catch (Exception e) {
            System.out.println("Элемент отстствует");
        }
        return this;
    }

    public OplataTickets fieldPhonePass() {
        try {
            driver.findElement(passPhone).click();
            driver.findElement(passPhone).sendKeys("1425");
        } catch (Exception e) {
            System.out.println("Элемент отстствует");
        }
        return this;
    }

    public OplataTickets clickBtnAccept() {
        try {
            driver.findElement(btnAccept).click();
        } catch (Exception e) {
            System.out.println("Элемент отстствует");
        }
        return this;
    }

    public OplataTickets clickBtnAcceptCode() {
        try {
            driver.findElement(btnAcceptCode).click();
        } catch (Exception e) {
            System.out.println("Элемент отстствует");
        }
        return this;
    }

    //Действия с элементами на странице оформления заказа
    public OplataTickets fieldName() {
        driver.findElement(name).click();
        driver.findElement(name).sendKeys("Гена");
        return this;
    }

    public OplataTickets fieldMail() {
        driver.findElement(mail).click();
        driver.findElement(mail).sendKeys("tester@toredo.ru");
        return this;
    }

    public OplataTickets fieldServiseeFee(){
        driver.findElement(serviseeFee);
        return this;
    }


    public OplataTickets clickCheckBox() {
        driver.findElement(checkBox).click();
        return this;
    }

    public OplataTickets clickTestPay() {
        driver.findElement(testPay).click();
        return this;
    }

    public OplataTickets clickPushkaPay(){
        driver.findElement(payPushka).click();
        return this;
    }

    public OplataTickets clickBtnAcceptPay() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(btnAcceptPay).click();
        return this;
    }

    public OplataTickets clickBtnCollectionPay() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(btnCollectionPay).click();
        return this;
    }

    public OplataTickets clickBtnTicket(){
        driver.findElement(checkBoxTicket).click();
        return this;
    }

    public OplataTickets clickBtnAcceptCollectionPay(){
        driver.findElement(btnAcceptCollectionPay).click();
        return this;
    }

    public OplataTickets inputPhone(){
        driver.findElement(fieldPhoneCollection).click();
        driver.findElement(fieldPhoneCollection).sendKeys("9999999999");
        return this;
    }

    public OplataTickets clickCheckBoxBonus(){
        driver.findElement(checkBoxBonus).click();
        return this;
    }

    private int  getBonus(){

        String s = driver.findElement(costUseBonus).getText();
        s = s.substring(0,s.length()-3);
        int bonus =  Integer.parseInt(s);

        return bonus;
    }

    private int getSale(){
        String s = driver.findElement(countSale).getText();
        s = s.substring(0, s.length()-2);
        int sale = Integer.parseInt(s);
        return sale;
    }

    private int getCostServiseeFee(){
        int costServisee = Integer.parseInt(String.valueOf(driver.findElement(costServiseeFee).getText()));
        return costServisee;
    }

    public OplataTickets inputFieldSale(){
        driver.findElement(fieldSale).click();
        driver.findElement(fieldSale).sendKeys("LENIN");
        return this;
    }

    public OplataTickets clickBtnSale(){
        driver.findElement(btnSale).click();
        return this;
    }

    public OplataTickets clickBtnPlaceEvent() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(btnPlaceEvent).click();
        return this;
    }

    public OplataTickets clickBtnPlusPlace(){
        driver.findElement(btnPlusPlace).click();
        return this;
    }

    public OplataTickets clickBtnMinusPlace(){
        driver.findElement(btnMinusPlace).click();
        return this;
    }

    private int  getCountChoosePlace(){
        int countPlace = Integer.parseInt(String.valueOf(driver.findElement(countChoosePlace).getText()));
        return countPlace;
    }

    public OplataTickets chooseTicketClickFivePlus(){
        for(int i = 0; i < 4; i++){
            clickBtnPlusPlace();
        }
        return this;
    }

    public OplataTickets chooseTicketClickFiveMinus(){
        for(int i = 0; i < 4; i++){
            clickBtnMinusPlace();
        }
        return this;
    }

    public OplataTickets clickFieldMask(){
        driver.findElement(fieldMask).click();
        return this;
    }

    public OplataTickets clickMaskUrkain(){
        driver.findElement(maskUrkain).click();
        return this;
    }

    public OplataTickets clickBtnChoosePlacepay(){
        driver.findElement(btnChoosePlacePay).click();
        return this;
    }

    public OplataTickets clickBtnChoosePlacePoint(){
        driver.findElement(btnChoosePlacePoint).click();
        return this;
    }

    public OplataTickets chooseTicketsClickBtnPay() throws InterruptedException {
        for (int i = 0; i < 4; i++){
            Thread.sleep(500);
            clickBtnChoosePlacepay();
            Thread.sleep(1000);
        }
        return this;
    }

    public OplataTickets clickBtnPoint(){

        List<WebElement> elements = driver.findElements(btnChoosePlacePoint);
        for (WebElement element : elements){
            element.click();
        }
        return this;
    }

    private int getAmountTicketPool() throws InterruptedException {
        Thread.sleep(1000);
        int amountTicketPool = driver.findElements(ticketInPool).size();
        return amountTicketPool;
    }


    /**
     *Проверка результатов
     */


    public OplataTickets checkResultTestPay() {
        String textAccept = driver.findElement(finalTest).getText();
        Assert.assertEquals(textAccept, "Заказ оформлен", "Тест не прошел");
        return this;
    }


    public OplataTickets checkResultWarriorName() {
        String textWarriorName = driver.findElement(warriorName).getText();
        Assert.assertEquals(textWarriorName, "НЕОБХОДИМО ЗАПОЛНИТЬ «ВАШЕ ИМЯ И ФАМИЛИЯ».");
        return this;
    }

    public OplataTickets checkResultWarriorMail(){
        String textWarriorMail = driver.findElement(warriorMail).getText();
        Assert.assertEquals(textWarriorMail, "НЕОБХОДИМО ЗАПОЛНИТЬ «E-MAIL».");
        return this;
    }

    public OplataTickets checkResultWarriorCheckBox(){
        String textWarriorCheckBox = driver.findElement(warriorCheckBox).getText();
        Assert.assertEquals(textWarriorCheckBox,"ВЫ ДОЛЖНЫ СОГЛАСИТЬСЯ С ДОГОРОВОМ ПУБЛИЧНОЙ ОФЕРТЫ.");
        return this;
    }

    public OplataTickets clickPayKassa(){
        driver.findElement(payPark).click();
        return this;
    }

    public OplataTickets checkKassa24(){
        try{
            driver.findElement(blockDelivery);
        } catch (Exception e) {
            System.out.println("Данный элемент отсутствует");
        }
        return this;
    }

    public OplataTickets checkResultPayPark() {
        String textAcceptPayPark = driver.findElement(acceptPayPark).getText();
        Assert.assertEquals(textAcceptPayPark, "Оплата наличными в кассе");
        return this;
    }

    private int calcSum() throws InterruptedException {
        int sum = 0;
        List<WebElement> costTicket = driver.findElements(ticketPriceAll);
        for (WebElement element : costTicket) {
            Thread.sleep(3000);
            String s = element.getText().replace("(", "");
            sum = sum + Integer.parseInt(s.replace(")", ""));
        }
        return sum;
    }

    public OplataTickets clickPlace() throws InterruptedException {
        Thread.sleep(3000);
        int costTickets = Integer.parseInt(String.valueOf(driver.findElement(costTicket).getText()));
        System.out.println(costTickets);

        driver.findElement(placeAll).click();
        Thread.sleep(2000);
        int costTicketsClick = Integer.parseInt(String.valueOf(driver.findElement(costTicket).getText()));

        System.out.println(costTicketsClick);
        Assert.assertNotEquals(costTickets,costTicketsClick,"Отображает одиннаковое значение");
        return this;
    }

    public OplataTickets delitePlace() throws InterruptedException {
        Thread.sleep(3000);
        int costTickets = Integer.parseInt(String.valueOf(driver.findElement(costTicket).getText()));
        System.out.println(costTickets);

        driver.findElement(btnDeliteTicket).click();

        Thread.sleep(2000);
        int costTicketsClick = Integer.parseInt(String.valueOf(driver.findElement(costTicket).getText()));

        System.out.println(costTicketsClick);
        Assert.assertNotEquals(costTickets,costTicketsClick,"Отображает одиннаковое значение");
        return this;
    }

    public OplataTickets chechResultPayPushks() throws InterruptedException {
        Thread.sleep(1000);
        int sum = calcSum();

        System.out.println(sum);


        Thread.sleep(1000);

        int price = Integer.parseInt(driver.findElement(priceTotal).getText());
        System.out.println(price);

        Boolean serviseFee = driver.findElements(serviseeFee).size() > 0;

        Assert.assertFalse(serviseFee,"Сервисный сбор присутствует");
        Assert.assertEquals(sum,price, "Сумма не сходится");
        return this;
    }

    public OplataTickets checkResultCollectionPushka(){
        Assert.assertEquals( driver.findElement(fieldCollectionPay).getText(),"Коллективная покупка билетов на \"(ТЕСТОВОЕ) Фиксики играют в цирк!\"","Имя не сходится");
        return this;
    }

    public OplataTickets checkResultColletctionPay(){

        boolean fieldCardYmoney = driver.findElements(fieldInfoCard).size()>0;

        Assert.assertTrue(fieldCardYmoney,"Что-то не так");
        return this;
    }

    public OplataTickets mathResultPriceBonus() throws InterruptedException {
        int sum = calcSum();

        int bonus = getBonus();

        int servisee = getCostServiseeFee();

        System.out.println(sum);
        System.out.println(bonus);
        System.out.println(servisee);

        int resultPrice = sum - bonus + servisee;

        int price = Integer.parseInt(String.valueOf(driver.findElement(priceTotal).getText()));

        System.out.println(resultPrice);

        Assert.assertEquals(resultPrice,price,"Сумма разная");

        return this;
    }

    public OplataTickets resultTransitUnitaller(){
        Boolean btnAccept = driver.findElements(btnPayUniteller).size()>0;

        Assert.assertTrue(btnAccept,"Блок с оплатой отсутствует");
        return this;
    }

    public OplataTickets mathResultPriceSale() throws InterruptedException {
        int sum = calcSum();

        int sale = getSale();

        int servisee = getCostServiseeFee();

        System.out.println(sum);
        System.out.println(sale);
        System.out.println(servisee);

        int resultPrice = sum - (sale * 5) + servisee;

        int price = Integer.parseInt(String.valueOf(driver.findElement(priceTotal).getText()));

        System.out.println(resultPrice);

        Assert.assertEquals(resultPrice,price,"Сумма разная");

        return this;

    }

    public OplataTickets checkResultChoosePlacePlus() throws InterruptedException {
Thread.sleep(500);
        Assert.assertEquals(getCountChoosePlace(), 4, "Кол-во билетов выбранное не отображается");
        return this;
    }


    public OplataTickets checkResultChoosePlaceMinus() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals(getCountChoosePlace(), 0, "Кол-во билетов не сходится");
        return this;
    }

    public OplataTickets checkResultMaskUkrain(){

        String fieldPhone = driver.findElement(fieldPhoneCollection).getAttribute("value");

        System.out.println(fieldPhone);
        Assert.assertEquals(fieldPhone,"+38(999)999-99-99", "Номер отображается без маски");
        return this;
    }


    public OplataTickets checkResultChooseTicketsBtnPay() throws InterruptedException {

    Assert.assertEquals(getAmountTicketPool(),4,"Кол-во билетов не сходится");
    return this;

    }



}



