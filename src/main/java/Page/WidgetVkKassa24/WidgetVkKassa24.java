package Page.WidgetVkKassa24;

import Page.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class WidgetVkKassa24 extends BasePage {
    public WidgetVkKassa24(WebDriver driver) {
        super(driver);
    }

    //Элементы на странице вк кассы 24
    private final By widgetKassa24 = By.xpath("//*[@id='main-view']/div/div/div[2]/div[2]/div/div[12]/div/div[2]");
    private final By btnEventKassa24 = By.xpath("//*[@id='main-view']/div/div/div[2]/div[2]/div/div[12]/div/div[2]/div[2]");
    private final By btnPlace = By.xpath("//*[@id='main-view']/div/div[2]/div[2]/div/div/div/div[2]/div[1]/div[6]/a/button");
    private final By btnAddition = By.xpath("//*[@id='details-button']");
    private final By btnConnect = By.xpath("//*[@id='proceed-link']");
    private final By place = By.xpath("//div[@data-blocked = 'false'][1]");
    private final By place1 = By.xpath("//div[@data-blocked = 'false'][2]");
    private final By place2 = By.xpath("//div[@data-blocked = 'false'][3]");
    private final By place3 = By.xpath("//div[@data-blocked = 'false'][4]");
    private final By place4 = By.xpath("//div[@data-blocked = 'false'][5]");
    private final By place5 = By.xpath("//div[@data-blocked = 'false'][6]");
    private final By place6 = By.xpath("//div[@data-blocked = 'false'][7]");
    private final By place7 = By.xpath("//div[@data-blocked = 'false'][8]");
    private final By place8 = By.xpath("//div[@data-blocked = 'false'][9]");
    private final By place9 = By.xpath("//div[@data-blocked = 'false'][10]");
    private final By place10 = By.xpath("//div[@data-blocked = 'false'][11]");
    private final By place11= By.xpath("//div[@data-blocked = 'false'][12]");
    private final By place12 = By.xpath("//div[@data-blocked = 'false'][13]");
    private final By place13 = By.xpath("//div[@data-blocked = 'false'][14]");
    private final By place14 = By.xpath("//div[@data-blocked = 'false'][15]");
    private final By place15 = By.xpath("//div[@data-blocked = 'false'][16]");
    private final By place16= By.xpath("//div[@data-blocked = 'false'][17]");
    private final By place17 = By.xpath("//div[@data-blocked = 'false'][18]");
    private final By place18 = By.xpath("//div[@data-blocked = 'false'][19]");
    private final By place19 = By.xpath("//div[@data-blocked = 'false'][20]");
    private final By serviseeFee = By.xpath("//*[@id='fee-total']");
    private final By fieldServiseeFee = By.xpath("//*[@id='scheme-panel']/div[2]/div[2]/p[1]");
    private final By priceTotal = By.xpath("//*[@id='price-total']");
    private final By ticketPrice1 = By.xpath("/html/body/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/span[4]/span");
    private final By ticketPrice2 = By.xpath("/html/body/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div[1]/div[2]/span[4]/span");
    private final By ticketPrice3 = By.xpath("/html/body/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div[1]/div[3]/span[4]/span");
    private final By ticketPrice4 = By.xpath("/html/body/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div[1]/div[4]/span[4]/span");
    private final By ticketPrice5 = By.xpath("/html/body/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div[1]/div[5]/span[4]/span");
    private final By ticketPrice6 = By.xpath("/html/body/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div[1]/div[6]/span[4]/span");
    private final By ticketPrice7= By.xpath("/html/body/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div[1]/div[7]/span[4]/span");
    private final By ticketPrice8 = By.xpath("/html/body/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div[1]/div[8]/span[4]/span");
    private final By ticketPrice9 = By.xpath("/html/body/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div[1]/div[9]/span[4]/span");
    private final By ticketPrice10 = By.xpath("/html/body/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div[1]/div[10]/span[4]/span");
    private final By ticketPrice11= By.xpath("/html/body/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div[1]/div[11]/span[4]/span");
    private final By ticketPrice12 = By.xpath("/html/body/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div[1]/div[12]/span[4]/span");
    private final By ticketPrice13 = By.xpath("/html/body/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div[1]/div[13]/span[4]/span");
    private final By ticketPrice14 = By.xpath("/html/body/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div[1]/div[14]/span[4]/span");
    private final By ticketPrice15 = By.xpath("/html/body/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div[1]/div[15]/span[4]/span");
    private final By ticketPrice16 = By.xpath("/html/body/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div[1]/div[16]/span[4]/span");
    private final By ticketPrice17 = By.xpath("/html/body/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div[1]/div[17]/span[4]/span");
    private final By ticketPrice18 = By.xpath("/html/body/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div[1]/div[18]/span[4]/span");
    private final By ticketPrice19 = By.xpath("/html/body/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div[1]/div[19]/span[4]/span");
    private final By ticketPrice20 = By.xpath("/html/body/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div[1]/div[20]/span[4]/span");
    private final By inTicket1 = By.xpath("/html/body/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]");
    private final By deliteTicket1 = By.xpath("/html/body/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/button");
    private final By deliteTicket2 = By.xpath("/html/body/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div[1]/div[2]/button");





    public WidgetVkKassa24 clickBtnAddition (){
        driver.findElement(btnAddition).click();
        return this;
    }
    public WidgetVkKassa24 clickBtnConnect(){
    driver.findElement(btnConnect).click();
    return this;
    }

    public WidgetVkKassa24 clickEvent () throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(widgetKassa24).click();
        return this;
    }
    public WidgetVkKassa24 clickbtnEventKassa24() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(btnEventKassa24).click();
        return this;
    }

    public WidgetVkKassa24 clickBtnPlace (){
    driver.findElement(btnPlace).click();
    return this;
}



    public  WidgetVkKassa24 choosePlace() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(place).click();
        driver.findElement(place1).click();
        driver.findElement(place2).click();
        driver.findElement(place3).click();
        driver.findElement(place4).click();
        driver.findElement(place5).click();
        driver.findElement(place6).click();
        driver.findElement(place7).click();
        driver.findElement(place8).click();
        driver.findElement(place9).click();
        driver.findElement(place10).click();
        driver.findElement(place11).click();
        driver.findElement(place12).click();
        driver.findElement(place13).click();
        driver.findElement(place14).click();
        driver.findElement(place15).click();
        driver.findElement(place16).click();
        driver.findElement(place17).click();
        driver.findElement(place18).click();
        driver.findElement(place19).click();
        return this;
    }


    public WidgetVkKassa24 deliteTickets1(){
    driver.findElement(deliteTicket1).click();
    return this;
    }
    //Вычисляем на странице выбора мест правильность отображения суммы билетов с сервисным сбором(5%)
    public WidgetVkKassa24 resultMath() throws InterruptedException {
    int costTicket1 = Integer.parseInt(driver.findElement(ticketPrice1).getText());
    int costTicket2 = Integer.parseInt(driver.findElement(ticketPrice2).getText());
    int costTicket3 = Integer.parseInt(driver.findElement(ticketPrice3).getText());
    int costTicket4 = Integer.parseInt(driver.findElement(ticketPrice4).getText());
    int costTicket5 = Integer.parseInt(driver.findElement(ticketPrice5).getText());
    int costTicket6 = Integer.parseInt(driver.findElement(ticketPrice6).getText());
    int costTicket7 = Integer.parseInt(driver.findElement(ticketPrice7).getText());
    int costTicket8 = Integer.parseInt(driver.findElement(ticketPrice8).getText());
    int costTicket9 = Integer.parseInt(driver.findElement(ticketPrice9).getText());
    int costTicket10 = Integer.parseInt(driver.findElement(ticketPrice10).getText());
    int costTicket11 = Integer.parseInt(driver.findElement(ticketPrice11).getText());
    int costTicket12 = Integer.parseInt(driver.findElement(ticketPrice12).getText());
    int costTicket13 = Integer.parseInt(driver.findElement(ticketPrice13).getText());
    int costTicket14 = Integer.parseInt(driver.findElement(ticketPrice14).getText());
    int costTicket15 = Integer.parseInt(driver.findElement(ticketPrice15).getText());
    int costTicket16 = Integer.parseInt(driver.findElement(ticketPrice16).getText());
    int costTicket17 = Integer.parseInt(driver.findElement(ticketPrice17).getText());
    int costTicket18 = Integer.parseInt(driver.findElement(ticketPrice18).getText());
    int costTicket19 = Integer.parseInt(driver.findElement(ticketPrice19).getText());
    int costTicket20 = Integer.parseInt(driver.findElement(ticketPrice20).getText());


    int sumTickets  = costTicket1 + costTicket2 + costTicket3 + costTicket4 + costTicket5 + costTicket6 + costTicket7 + costTicket8 + costTicket9 + costTicket10 + costTicket11 +costTicket12 + costTicket13 + costTicket14 + costTicket15 + costTicket16 + costTicket17 + costTicket18 + costTicket19 + costTicket20;
    System.out.println(sumTickets);
    Thread.sleep(1000);
    int mathServiseFee = (((sumTickets)/100) * 5);
    System.out.println(mathServiseFee);
    int sumServiseeFee = Integer.parseInt(driver.findElement(serviseeFee).getText());


    Assert.assertEquals(sumServiseeFee,mathServiseFee,"Значения не сошлись");
    int sumResultTicketServiseFee = mathServiseFee + sumTickets;
    int price = Integer.parseInt(driver.findElement(priceTotal).getText());
    Assert.assertEquals(sumResultTicketServiseFee,price,"Сумма разная");
    return this;
    }

    //Вычисление сервисного сбора при удалении билета
    public WidgetVkKassa24 resultServiseeDelite5() throws InterruptedException {
        int costTicket1 = Integer.parseInt(driver.findElement(ticketPrice1).getText());
        int costTicket2 = Integer.parseInt(driver.findElement(ticketPrice2).getText());
        int costTicket3 = Integer.parseInt(driver.findElement(ticketPrice3).getText());
        int costTicket4 = Integer.parseInt(driver.findElement(ticketPrice4).getText());
        int costTicket5 = Integer.parseInt(driver.findElement(ticketPrice5).getText());
        int costTicket6 = Integer.parseInt(driver.findElement(ticketPrice6).getText());
        int costTicket7 = Integer.parseInt(driver.findElement(ticketPrice7).getText());
        int costTicket8 = Integer.parseInt(driver.findElement(ticketPrice8).getText());
        int costTicket9 = Integer.parseInt(driver.findElement(ticketPrice9).getText());
        int costTicket10 = Integer.parseInt(driver.findElement(ticketPrice10).getText());
        int costTicket11 = Integer.parseInt(driver.findElement(ticketPrice11).getText());
        int costTicket12 = Integer.parseInt(driver.findElement(ticketPrice12).getText());
        int costTicket13 = Integer.parseInt(driver.findElement(ticketPrice13).getText());
        int costTicket14 = Integer.parseInt(driver.findElement(ticketPrice14).getText());
        int costTicket15 = Integer.parseInt(driver.findElement(ticketPrice15).getText());
        int costTicket16 = Integer.parseInt(driver.findElement(ticketPrice16).getText());
        int costTicket17 = Integer.parseInt(driver.findElement(ticketPrice17).getText());
        int costTicket18 = Integer.parseInt(driver.findElement(ticketPrice18).getText());
        int costTicket19 = Integer.parseInt(driver.findElement(ticketPrice19).getText());
        int costTicket20 = Integer.parseInt(driver.findElement(ticketPrice20).getText());


        int sumTickets  = costTicket1 + costTicket2 + costTicket3 + costTicket4 + costTicket5 + costTicket6 + costTicket7 + costTicket8 + costTicket9 + costTicket10 + costTicket11 +costTicket12 + costTicket13 + costTicket14 + costTicket15 + costTicket16 + costTicket17 + costTicket18 + costTicket19 + costTicket20;
        System.out.println(sumTickets);
        Thread.sleep(1000);
        int mathServiseFee = (((sumTickets)/100) * 5);
        System.out.println(mathServiseFee);
        int sumServiseeFee = Integer.parseInt(driver.findElement(serviseeFee).getText());
        Assert.assertEquals(sumServiseeFee,mathServiseFee,"Значения не сошлись");
        int sumResultTicketServiseFee = mathServiseFee + sumTickets;
        int price = Integer.parseInt(driver.findElement(priceTotal).getText());
        Assert.assertEquals(sumResultTicketServiseFee,price,"Сумма разная");

        driver.findElement(inTicket1).click();
        driver.findElement(deliteTicket1).click();

        int sumTicketsDelite = costTicket1 + costTicket2 + costTicket3 + costTicket4 + costTicket5 + costTicket6 + costTicket7 + costTicket8 + costTicket9 + costTicket10 + costTicket11 +costTicket12 + costTicket13 + costTicket14 + costTicket15 + costTicket16 + costTicket17 + costTicket18 + costTicket19;
        int mathServiseFeeDelite = (int) (sumTicketsDelite * 0.05);
        System.out.println(mathServiseFeeDelite + "сумма сервисного сбора после удаления билета");
        int sumResultServiseeDelite = Integer.parseInt(driver.findElement(serviseeFee).getText());
        Assert.assertEquals(sumResultServiseeDelite,mathServiseFeeDelite,"Значения не сошлись");
        int sumResultTicketServiseFeeDelite = mathServiseFeeDelite + sumTickets;
        Assert.assertEquals(sumResultTicketServiseFeeDelite,price,"Сумма разная");
        return this;
    }

    public  WidgetVkKassa24 checkResultServiseeClickPlace5() throws InterruptedException {
        int costTicket1 = Integer.parseInt(driver.findElement(ticketPrice1).getText());
        int costTicket2 = Integer.parseInt(driver.findElement(ticketPrice2).getText());
        int costTicket3 = Integer.parseInt(driver.findElement(ticketPrice3).getText());
        int costTicket4 = Integer.parseInt(driver.findElement(ticketPrice4).getText());
        int costTicket5 = Integer.parseInt(driver.findElement(ticketPrice5).getText());
        int costTicket6 = Integer.parseInt(driver.findElement(ticketPrice6).getText());
        int costTicket7 = Integer.parseInt(driver.findElement(ticketPrice7).getText());
        int costTicket8 = Integer.parseInt(driver.findElement(ticketPrice8).getText());
        int costTicket9 = Integer.parseInt(driver.findElement(ticketPrice9).getText());
        int costTicket10 = Integer.parseInt(driver.findElement(ticketPrice10).getText());
        int costTicket11 = Integer.parseInt(driver.findElement(ticketPrice11).getText());
        int costTicket12 = Integer.parseInt(driver.findElement(ticketPrice12).getText());
        int costTicket13 = Integer.parseInt(driver.findElement(ticketPrice13).getText());
        int costTicket14 = Integer.parseInt(driver.findElement(ticketPrice14).getText());
        int costTicket15 = Integer.parseInt(driver.findElement(ticketPrice15).getText());
        int costTicket16 = Integer.parseInt(driver.findElement(ticketPrice16).getText());
        int costTicket17 = Integer.parseInt(driver.findElement(ticketPrice17).getText());
        int costTicket18 = Integer.parseInt(driver.findElement(ticketPrice18).getText());
        int costTicket19 = Integer.parseInt(driver.findElement(ticketPrice19).getText());



        driver.findElement(place19).click();
        Thread.sleep(1000);

        int sumTicketsClick = costTicket1 + costTicket2 + costTicket3 + costTicket4 + costTicket5 + costTicket6 + costTicket7 + costTicket8 + costTicket9 + costTicket10 + costTicket11 +costTicket12 + costTicket13 + costTicket14 + costTicket15 + costTicket16 + costTicket17 + costTicket18 + costTicket19;
        int mathServiseFeeClick = (int) (sumTicketsClick * 0.05);
        System.out.println(mathServiseFeeClick + " " + "сумма сервисного сбора после удаления билета");
        int sumResultServiseeDelite = Integer.parseInt(driver.findElement(serviseeFee).getText());
        Assert.assertEquals(sumResultServiseeDelite,mathServiseFeeClick,"Значения не сошлись");
        int price = Integer.parseInt(driver.findElement(priceTotal).getText());
        System.out.println(price + " " + "Сумма заказа");
        int sumResultTicketServiseFeeDelite = mathServiseFeeClick + sumTicketsClick;
        Assert.assertEquals(sumResultTicketServiseFeeDelite,price,"Сумма разная");
        return this;
    }



    public WidgetVkKassa24 resultServiseeDelite2() throws InterruptedException {
        int costTicket1 = Integer.parseInt(driver.findElement(ticketPrice1).getText());
        int costTicket2 = Integer.parseInt(driver.findElement(ticketPrice2).getText());
        int costTicket3 = Integer.parseInt(driver.findElement(ticketPrice3).getText());
        int costTicket4 = Integer.parseInt(driver.findElement(ticketPrice4).getText());
        int costTicket5 = Integer.parseInt(driver.findElement(ticketPrice5).getText());
        int costTicket6 = Integer.parseInt(driver.findElement(ticketPrice6).getText());
        int costTicket7 = Integer.parseInt(driver.findElement(ticketPrice7).getText());
        int costTicket8 = Integer.parseInt(driver.findElement(ticketPrice8).getText());
        int costTicket9 = Integer.parseInt(driver.findElement(ticketPrice9).getText());
        int costTicket10 = Integer.parseInt(driver.findElement(ticketPrice10).getText());
        int costTicket11 = Integer.parseInt(driver.findElement(ticketPrice11).getText());
        int costTicket12 = Integer.parseInt(driver.findElement(ticketPrice12).getText());
        int costTicket13 = Integer.parseInt(driver.findElement(ticketPrice13).getText());
        int costTicket14 = Integer.parseInt(driver.findElement(ticketPrice14).getText());
        int costTicket15 = Integer.parseInt(driver.findElement(ticketPrice15).getText());
        int costTicket16 = Integer.parseInt(driver.findElement(ticketPrice16).getText());
        int costTicket17 = Integer.parseInt(driver.findElement(ticketPrice17).getText());
        int costTicket18 = Integer.parseInt(driver.findElement(ticketPrice18).getText());
        int costTicket19 = Integer.parseInt(driver.findElement(ticketPrice19).getText());
        int costTicket20 = Integer.parseInt(driver.findElement(ticketPrice20).getText());


        int sumTickets  = costTicket1 + costTicket2 + costTicket3 + costTicket4 + costTicket5 + costTicket6 + costTicket7 + costTicket8 + costTicket9 + costTicket10 + costTicket11 +costTicket12 + costTicket13 + costTicket14 + costTicket15 + costTicket16 + costTicket17 + costTicket18 + costTicket19 + costTicket20;
        System.out.println(sumTickets);
        Thread.sleep(1000);
        int mathServiseFee = (((sumTickets)/100) * 2);
        System.out.println(mathServiseFee);
        int sumServiseeFee = Integer.parseInt(driver.findElement(serviseeFee).getText());
        Assert.assertEquals(sumServiseeFee,mathServiseFee,"Значения не сошлись");
        int sumResultTicketServiseFee = mathServiseFee + sumTickets;
        int price = Integer.parseInt(driver.findElement(priceTotal).getText());
        Assert.assertEquals(sumResultTicketServiseFee,price,"Сумма разная");

        driver.findElement(inTicket1).click();
        driver.findElement(deliteTicket1).click();

        int sumTicketsDelite = costTicket1 + costTicket2 + costTicket3 + costTicket4 + costTicket5 + costTicket6 + costTicket7 + costTicket8 + costTicket9 + costTicket10 + costTicket11 +costTicket12 + costTicket13 + costTicket14 + costTicket15 + costTicket16 + costTicket17 + costTicket18 + costTicket19;
        int mathServiseFeeDelite = (int) (sumTicketsDelite * 0.02);
        System.out.println(mathServiseFeeDelite + "сумма сервисного сбора после удаления билета");
        int sumResultServiseeDelite = Integer.parseInt(driver.findElement(serviseeFee).getText());
        Assert.assertEquals(sumResultServiseeDelite,mathServiseFeeDelite,"Значения не сошлись");
        int sumResultTicketServiseFeeDelite = mathServiseFeeDelite + sumTickets;
        Assert.assertEquals(sumResultTicketServiseFeeDelite,price,"Сумма разная");
        return this;
    }

    public  WidgetVkKassa24 checkResultServiseeClickPlace2() throws InterruptedException {
        int costTicket1 = Integer.parseInt(driver.findElement(ticketPrice1).getText());
        int costTicket2 = Integer.parseInt(driver.findElement(ticketPrice2).getText());
        int costTicket3 = Integer.parseInt(driver.findElement(ticketPrice3).getText());
        int costTicket4 = Integer.parseInt(driver.findElement(ticketPrice4).getText());
        int costTicket5 = Integer.parseInt(driver.findElement(ticketPrice5).getText());
        int costTicket6 = Integer.parseInt(driver.findElement(ticketPrice6).getText());
        int costTicket7 = Integer.parseInt(driver.findElement(ticketPrice7).getText());
        int costTicket8 = Integer.parseInt(driver.findElement(ticketPrice8).getText());
        int costTicket9 = Integer.parseInt(driver.findElement(ticketPrice9).getText());
        int costTicket10 = Integer.parseInt(driver.findElement(ticketPrice10).getText());
        int costTicket11 = Integer.parseInt(driver.findElement(ticketPrice11).getText());
        int costTicket12 = Integer.parseInt(driver.findElement(ticketPrice12).getText());
        int costTicket13 = Integer.parseInt(driver.findElement(ticketPrice13).getText());
        int costTicket14 = Integer.parseInt(driver.findElement(ticketPrice14).getText());
        int costTicket15 = Integer.parseInt(driver.findElement(ticketPrice15).getText());
        int costTicket16 = Integer.parseInt(driver.findElement(ticketPrice16).getText());
        int costTicket17 = Integer.parseInt(driver.findElement(ticketPrice17).getText());
        int costTicket18 = Integer.parseInt(driver.findElement(ticketPrice18).getText());
        int costTicket19 = Integer.parseInt(driver.findElement(ticketPrice19).getText());



        driver.findElement(place19).click();
        Thread.sleep(1000);

        int sumTicketsClick = costTicket1 + costTicket2 + costTicket3 + costTicket4 + costTicket5 + costTicket6 + costTicket7 + costTicket8 + costTicket9 + costTicket10 + costTicket11 +costTicket12 + costTicket13 + costTicket14 + costTicket15 + costTicket16 + costTicket17 + costTicket18 + costTicket19;
        int mathServiseFeeClick = (int) (sumTicketsClick * 0.02);
        System.out.println(mathServiseFeeClick + " " + "сумма сервисного сбора после удаления билета");
        int sumResultServiseeDelite = Integer.parseInt(driver.findElement(serviseeFee).getText());
        Assert.assertEquals(sumResultServiseeDelite,mathServiseFeeClick,"Значения не сошлись");
        int price = Integer.parseInt(driver.findElement(priceTotal).getText());
        System.out.println(price + " " + "Сумма заказа");
        int sumResultTicketServiseFeeDelite = mathServiseFeeClick + sumTicketsClick;
        Assert.assertEquals(sumResultTicketServiseFeeDelite,price,"Сумма разная");
        return this;
    }



    public WidgetVkKassa24 resultServiseeDelite3() throws InterruptedException {
        int costTicket1 = Integer.parseInt(driver.findElement(ticketPrice1).getText());
        int costTicket2 = Integer.parseInt(driver.findElement(ticketPrice2).getText());
        int costTicket3 = Integer.parseInt(driver.findElement(ticketPrice3).getText());
        int costTicket4 = Integer.parseInt(driver.findElement(ticketPrice4).getText());
        int costTicket5 = Integer.parseInt(driver.findElement(ticketPrice5).getText());
        int costTicket6 = Integer.parseInt(driver.findElement(ticketPrice6).getText());
        int costTicket7 = Integer.parseInt(driver.findElement(ticketPrice7).getText());
        int costTicket8 = Integer.parseInt(driver.findElement(ticketPrice8).getText());
        int costTicket9 = Integer.parseInt(driver.findElement(ticketPrice9).getText());
        int costTicket10 = Integer.parseInt(driver.findElement(ticketPrice10).getText());
        int costTicket11 = Integer.parseInt(driver.findElement(ticketPrice11).getText());
        int costTicket12 = Integer.parseInt(driver.findElement(ticketPrice12).getText());
        int costTicket13 = Integer.parseInt(driver.findElement(ticketPrice13).getText());
        int costTicket14 = Integer.parseInt(driver.findElement(ticketPrice14).getText());
        int costTicket15 = Integer.parseInt(driver.findElement(ticketPrice15).getText());
        int costTicket16 = Integer.parseInt(driver.findElement(ticketPrice16).getText());
        int costTicket17 = Integer.parseInt(driver.findElement(ticketPrice17).getText());
        int costTicket18 = Integer.parseInt(driver.findElement(ticketPrice18).getText());
        int costTicket19 = Integer.parseInt(driver.findElement(ticketPrice19).getText());
        int costTicket20 = Integer.parseInt(driver.findElement(ticketPrice20).getText());


        int sumTickets  = costTicket1 + costTicket2 + costTicket3 + costTicket4 + costTicket5 + costTicket6 + costTicket7 + costTicket8 + costTicket9 + costTicket10 + costTicket11 +costTicket12 + costTicket13 + costTicket14 + costTicket15 + costTicket16 + costTicket17 + costTicket18 + costTicket19 + costTicket20;
        System.out.println(sumTickets);
        Thread.sleep(1000);
        int mathServiseFee = (((sumTickets)/100) * 3);
        System.out.println(mathServiseFee);
        int sumServiseeFee = Integer.parseInt(driver.findElement(serviseeFee).getText());
        Assert.assertEquals(sumServiseeFee,mathServiseFee,"Значения не сошлись");
        int sumResultTicketServiseFee = mathServiseFee + sumTickets;
        int price = Integer.parseInt(driver.findElement(priceTotal).getText());
        Assert.assertEquals(sumResultTicketServiseFee,price,"Сумма разная");

        driver.findElement(inTicket1).click();
        driver.findElement(deliteTicket1).click();

        int sumTicketsDelite = costTicket1 + costTicket2 + costTicket3 + costTicket4 + costTicket5 + costTicket6 + costTicket7 + costTicket8 + costTicket9 + costTicket10 + costTicket11 +costTicket12 + costTicket13 + costTicket14 + costTicket15 + costTicket16 + costTicket17 + costTicket18 + costTicket19;
        int mathServiseFeeDelite = (int) (sumTicketsDelite * 0.03);
        System.out.println(mathServiseFeeDelite + "сумма сервисного сбора после удаления билета");
        int sumResultServiseeDelite = Integer.parseInt(driver.findElement(serviseeFee).getText());
        Assert.assertEquals(sumResultServiseeDelite,mathServiseFeeDelite,"Значения не сошлись");
        int sumResultTicketServiseFeeDelite = mathServiseFeeDelite + sumTickets;
        Assert.assertEquals(sumResultTicketServiseFeeDelite,price,"Сумма разная");
        return this;
    }
    public  WidgetVkKassa24 checkResultServiseeClickPlace3() throws InterruptedException {
        int costTicket1 = Integer.parseInt(driver.findElement(ticketPrice1).getText());
        int costTicket2 = Integer.parseInt(driver.findElement(ticketPrice2).getText());
        int costTicket3 = Integer.parseInt(driver.findElement(ticketPrice3).getText());
        int costTicket4 = Integer.parseInt(driver.findElement(ticketPrice4).getText());
        int costTicket5 = Integer.parseInt(driver.findElement(ticketPrice5).getText());
        int costTicket6 = Integer.parseInt(driver.findElement(ticketPrice6).getText());
        int costTicket7 = Integer.parseInt(driver.findElement(ticketPrice7).getText());
        int costTicket8 = Integer.parseInt(driver.findElement(ticketPrice8).getText());
        int costTicket9 = Integer.parseInt(driver.findElement(ticketPrice9).getText());
        int costTicket10 = Integer.parseInt(driver.findElement(ticketPrice10).getText());
        int costTicket11 = Integer.parseInt(driver.findElement(ticketPrice11).getText());
        int costTicket12 = Integer.parseInt(driver.findElement(ticketPrice12).getText());
        int costTicket13 = Integer.parseInt(driver.findElement(ticketPrice13).getText());
        int costTicket14 = Integer.parseInt(driver.findElement(ticketPrice14).getText());
        int costTicket15 = Integer.parseInt(driver.findElement(ticketPrice15).getText());
        int costTicket16 = Integer.parseInt(driver.findElement(ticketPrice16).getText());
        int costTicket17 = Integer.parseInt(driver.findElement(ticketPrice17).getText());
        int costTicket18 = Integer.parseInt(driver.findElement(ticketPrice18).getText());
        int costTicket19 = Integer.parseInt(driver.findElement(ticketPrice19).getText());



        driver.findElement(place19).click();
        Thread.sleep(1000);

        int sumTicketsClick = costTicket1 + costTicket2 + costTicket3 + costTicket4 + costTicket5 + costTicket6 + costTicket7 + costTicket8 + costTicket9 + costTicket10 + costTicket11 +costTicket12 + costTicket13 + costTicket14 + costTicket15 + costTicket16 + costTicket17 + costTicket18 + costTicket19;
        int mathServiseFeeClick = (int) (sumTicketsClick * 0.03);
        System.out.println(mathServiseFeeClick + " " + "сумма сервисного сбора после удаления билета");
        int sumResultServiseeDelite = Integer.parseInt(driver.findElement(serviseeFee).getText());
        Assert.assertEquals(sumResultServiseeDelite,mathServiseFeeClick,"Значения не сошлись");
        int price = Integer.parseInt(driver.findElement(priceTotal).getText());
        System.out.println(price + " " + "Сумма заказа");
        int sumResultTicketServiseFeeDelite = mathServiseFeeClick + sumTicketsClick;
        Assert.assertEquals(sumResultTicketServiseFeeDelite,price,"Сумма разная");
        return this;
    }

    public WidgetVkKassa24 checkResultServiceFee0(){
        int costTicket1 = Integer.parseInt(driver.findElement(ticketPrice1).getText());
        int costTicket2 = Integer.parseInt(driver.findElement(ticketPrice2).getText());
        int costTicket3 = Integer.parseInt(driver.findElement(ticketPrice3).getText());
        int costTicket4 = Integer.parseInt(driver.findElement(ticketPrice4).getText());
        int costTicket5 = Integer.parseInt(driver.findElement(ticketPrice5).getText());
        int costTicket6 = Integer.parseInt(driver.findElement(ticketPrice6).getText());
        int costTicket7 = Integer.parseInt(driver.findElement(ticketPrice7).getText());
        int costTicket8 = Integer.parseInt(driver.findElement(ticketPrice8).getText());
        int costTicket9 = Integer.parseInt(driver.findElement(ticketPrice9).getText());
        int costTicket10 = Integer.parseInt(driver.findElement(ticketPrice10).getText());
        int costTicket11 = Integer.parseInt(driver.findElement(ticketPrice11).getText());
        int costTicket12 = Integer.parseInt(driver.findElement(ticketPrice12).getText());
        int costTicket13 = Integer.parseInt(driver.findElement(ticketPrice13).getText());
        int costTicket14 = Integer.parseInt(driver.findElement(ticketPrice14).getText());
        int costTicket15 = Integer.parseInt(driver.findElement(ticketPrice15).getText());
        int costTicket16 = Integer.parseInt(driver.findElement(ticketPrice16).getText());
        int costTicket17 = Integer.parseInt(driver.findElement(ticketPrice17).getText());
        int costTicket18 = Integer.parseInt(driver.findElement(ticketPrice18).getText());
        int costTicket19 = Integer.parseInt(driver.findElement(ticketPrice19).getText());
        int costTicket20 = Integer.parseInt(driver.findElement(ticketPrice20).getText());

        int sumTickets  = costTicket1 + costTicket2 + costTicket3 + costTicket4 + costTicket5 + costTicket6 + costTicket7 + costTicket8 + costTicket9 + costTicket10 + costTicket11 +costTicket12 + costTicket13 + costTicket14 + costTicket15 + costTicket16 + costTicket17 + costTicket18 + costTicket19 + costTicket20;

        int price = Integer.parseInt(driver.findElement(priceTotal).getText());
        Boolean serviseFee = driver.findElements(fieldServiseeFee).size() > 0;

        Assert.assertFalse(serviseFee,"Сервисный сбор присутствует");
        Assert.assertEquals(sumTickets,price, "Сумма не сходится");
        return this;
    }
}
