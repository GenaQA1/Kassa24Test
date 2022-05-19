package Page.WidgetAppWlogo;

import Page.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;


public class WidgetAppwlogo<resultMath> extends BasePage {
    public WidgetAppwlogo(WebDriver driver) {
        super(driver);
    }

    //Элементы на виджете App wlogo
    private final By widgetKassa24 = By.xpath("//*[@id='main-view']/div/div/div[2]/div/div/div[15]/div/a/div[2]");
    private final By btnEventKassa24 = By.xpath("//*[@id='main-view']/div/div/div[2]/div[2]/div/div[15]/div/div[2]/div[2]/div/a/button");
    private final By btnPlace = By.xpath("//*[@id='main-view']/div/div[2]/div[2]/div/div/div/div[2]/div[1]/div[6]/a/button");
    private final By btnAddition = By.xpath("//*[@id='details-button']");
    private final By btnConnect = By.xpath("//*[@id='proceed-link']");
    private final By placeAll = By.xpath("//div[@data-blocked = 'false'][position() <21]");
    private final By serviseeFee = By.xpath("//*[@id='fee-total']");
    private final By fieldServiseeFee = By.xpath("//*[@id='scheme-panel']/div[2]/div[2]/p[1]");
    private final By priceTotal = By.xpath("//*[@id='price-total']");
    private final By ticketPriceAll = By.xpath("//*[@class = 'ticket-price']/span");
    private final By inTicket1 = By.xpath("/html/body/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]");
    private final By deliteTicket1 = By.xpath("/html/body/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/button");



    public WidgetAppwlogo clickBtnAddition() {
        try {
            driver.findElement(btnAddition).click();
        } catch (Exception e) {
            System.out.println("Элемент отсутствует");
        }
        return this;
    }

    public WidgetAppwlogo clickBtnConnect() {
        try {
            driver.findElement(btnConnect).click();
        } catch (Exception e) {
            System.out.println("Элемент отсутствует");
        }
        return this;
    }

    public WidgetAppwlogo clickEvent() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(widgetKassa24).click();
        return this;
    }

    public WidgetAppwlogo clickbtnEventKassa24() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(btnEventKassa24).click();
        return this;
    }

    public WidgetAppwlogo clickBtnPlace() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(btnPlace).click();
        return this;
    }


    //Выбор мест (20 мест)
    public WidgetAppwlogo choosePlace() throws InterruptedException {
        Thread.sleep(3000);

        List<WebElement> elementList = driver.findElements(placeAll);
        for (WebElement element : elementList) {
            element.click();
        }
        return this;
    }

    public WidgetAppwlogo deliteTickets1() {
        driver.findElement(deliteTicket1).click();
        return this;
    }



    //Вычисляем на странице выбора мест правильность отображения суммы билетов с сервисным сбором(5%)


    public  WidgetAppwlogo resultMathServise5() throws InterruptedException {
        Thread.sleep(2000);
        int sum = calcSum();

        System.out.println(sum);

        Thread.sleep(1000);
        calcMathServiseFee((float) 0.05);

        System.out.println(calcMathServiseFee((float) 0.05));

        int sumServiseeFee = Integer.parseInt(driver.findElement(serviseeFee).getText());
        Assert.assertEquals(sumServiseeFee,calcMathServiseFee((float) 0.05),"Значения не сошлись");
        return this;
    }


    private int calcSum() {
        int sum = 0;
        List<WebElement> costTicket = driver.findElements(ticketPriceAll);
        for (WebElement element : costTicket) {
            String s = element.getText().replace("(", "");
            sum = sum + Integer.parseInt(s.replace(")", ""));
        }

        return sum;
    }

    private int calcMathServiseFee(float param){
        int mathServiseFee = (int) (calcSum() * param);
        return mathServiseFee;
    }



    private int calcMathServiseFee5(){
        int mathServiseFee = (int) (calcSum() * 0.05);
        return mathServiseFee;
    }

    private int calcServiseFee5(){
        int serviseFee = (int) (calcSum() * 0.05);
        return serviseFee;
    }

    private int calcServiseFee2(){
        int serviseFee = (int) (calcSum() * 0.02);
        return serviseFee;
    }
    private int calcServiseFee3(){
        int serviseFee = (int) (calcSum() * 0.03);
        return serviseFee;
    }


    public  WidgetAppwlogo checkResultServise5() throws InterruptedException{
        int sumResultTicketServiseFee = resultMathServise5().calcSum() + resultMathServise5().calcMathServiseFee((float) 0.05);
        int price = Integer.parseInt(driver.findElement(priceTotal).getText());
        Assert.assertEquals(sumResultTicketServiseFee,price,"Сумма разная");
        return this;
    }


    //Вычисление сервисного сбора при удалении билета
    public WidgetAppwlogo resultServiseeDelite5() throws InterruptedException {

        driver.findElement(inTicket1).click();
        driver.findElement(deliteTicket1).click();

        resultMathServise5();
        checkResultServise5();
        return this;
    }

    public  WidgetAppwlogo checkResultServiseeClickPlace5() throws InterruptedException {

        driver.findElement(placeAll).click();
        Thread.sleep(1000);

        resultMathServise5();
        checkResultServise5();
        return this;
    }



    public WidgetAppwlogo resultMathServise2() throws InterruptedException {
        Thread.sleep(2000);
        int sum = calcSum();

        System.out.println(sum);

        Thread.sleep(1000);
        calcMathServiseFee((float) 0.02);

        System.out.println(calcMathServiseFee((float) 0.02));

        int sumServiseeFee = Integer.parseInt(driver.findElement(serviseeFee).getText());
        Assert.assertEquals(sumServiseeFee,calcMathServiseFee((float) 0.02),"Значения не сошлись");
        return this;
    }

    public  WidgetAppwlogo checkResultServise2() throws InterruptedException{
        int sumResultTicketServiseFee = resultMathServise2().calcSum() + resultMathServise5().calcMathServiseFee((float) 0.02);
        int price = Integer.parseInt(driver.findElement(priceTotal).getText());

        Assert.assertEquals(sumResultTicketServiseFee,price,"Сумма разная");
        return this;
    }

    public WidgetAppwlogo resultServiseeDelite2() throws InterruptedException {

        driver.findElement(inTicket1).click();
        driver.findElement(deliteTicket1).click();

        resultMathServise2();
        checkResultServise2();
        return this;
    }


    public  WidgetAppwlogo checkResultServiseeClickPlace2() throws InterruptedException {


        driver.findElement(placeAll).click();
        Thread.sleep(1000);

        resultMathServise2();
        checkResultServise2();
        return this;
    }

    public WidgetAppwlogo resultMathServise3() throws InterruptedException {
        Thread.sleep(2000);
        int sum = calcSum();

        System.out.println(sum);

        Thread.sleep(1000);
        calcServiseFee3();

        System.out.println(calcMathServiseFee5());

        int sumServiseeFee = Integer.parseInt(driver.findElement(serviseeFee).getText());
        Assert.assertEquals(sumServiseeFee,calcServiseFee3(),"Значения не сошлись");
        return this;
    }

    public  WidgetAppwlogo checkResultServise3() throws InterruptedException{
        int sumResultTicketServiseFee = resultMathServise3().calcSum() + resultMathServise3().calcServiseFee3();
        int price = Integer.parseInt(driver.findElement(priceTotal).getText());

        Assert.assertEquals(sumResultTicketServiseFee,price,"Сумма разная");
        return this;
    }


    public WidgetAppwlogo resultServiseeDelite3() throws InterruptedException {


        driver.findElement(inTicket1).click();
        driver.findElement(deliteTicket1).click();

        resultMathServise3();
        checkResultServise3();
        return this;
    }
    public  WidgetAppwlogo checkResultServiseeClickPlace3() throws InterruptedException {

        driver.findElement(placeAll).click();
        Thread.sleep(1000);

        resultMathServise3();
        checkResultServise3();

        return this;
    }

    public WidgetAppwlogo checkResultServiceFee0(){

        int sum = calcSum();
        int price = Integer.parseInt(driver.findElement(priceTotal).getText());
        Boolean serviseFee = driver.findElements(fieldServiseeFee).size() > 0;

        Assert.assertFalse(serviseFee,"Сервисный сбор присутствует");
        Assert.assertEquals(sum,price, "Сумма не сходится");
        return this;
    }

}
