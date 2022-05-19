package Page.ChangeCity;

import Page.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ChangeCity extends BasePage {
    public ChangeCity(WebDriver driver) {
        super(driver);
    }

    //Данные для перехода
    public final By selector = By.xpath("/html/body/header/section[1]/div[4]/div/div");
    public final By index1 = By.xpath("/html/body/header/section[1]/div[4]/div/ul/li[1]");
    public final By index2 = By.xpath("/html/body/header/section[1]/div[4]/div/ul/li[2]");
    public final By index3 = By.xpath("/html/body/header/section[1]/div[4]/div/ul/li[3]");
    public final By index4 = By.xpath("/html/body/header/section[1]/div[4]/div/ul/li[4]");
    public final By sevastopolCity = By.xpath("/html/body/header/section[1]/div[4]/div/ul/li[5]");
    public final By simferopolCity = By.xpath("/html/body/header/section[1]/div[4]/div/ul/li[6]");
    public final By feodociaCity = By.xpath("/html/body/header/section[1]/div[4]/div/ul/li[7]");
    public final By yaltaCity = By.xpath("/html/body/header/section[1]/div[4]/div/ul/li[8]");


    //Получение название города Евпатория
    public final By textCardEvpatory = By.xpath("//p[contains(text(), 'Евпатория,')]");
    public final By resultCardEvpatory = By.xpath("//*[@class = 'grid-block grid-block--event']");

    //Получение название города Керчь
    public final By textCardKerch = By.xpath("//p[contains(text(), 'Керчь,')]");
    public final By resultCardKerch = By.xpath("//*[@class = 'grid-block grid-block--event']");

    //Получение название города Севастополь
    public final By textCardSevastopol = By.xpath("//p[contains(text(), 'Севастополь,')]");
    public final By resultCardSevastopol = By.xpath("//*[@class = 'grid-block grid-block--event']");

    // Получение название города index4

    public final By textCardIndex4 = By.xpath("//p[contains(text(), 'Красноперекопск,')]");
    public final By resultCardIndex4 = By.xpath("//*[@class = 'grid-block grid-block--event']");


    public final By textCardSimferopol = By.xpath("//p[@class = 'text text--place'][contains(text(), 'Симферополь,')]");
    public final By resultCardSimferopol = By.xpath("//*[@class = 'grid-block grid-block--event']");

    //Получение название города Феодосия
    public final By textCardFeodocia = By.xpath("//p[@class = 'text text--place'][contains(text(), 'Феодосия,')]");
    public final By resultCardFeodocia = By.xpath("//*[@class = 'grid-block grid-block--event']");

    //Получение название города Ялта
    public final By textCardYalta = By.xpath("//p[@class = 'text text--place'][contains(text(), 'Ялта,')]");
    public final By resultCardYalta = By.xpath("//*[@class = 'grid-block grid-block--event']");


    //Проверка результат города Евпатория

    public ChangeCity clickSelector() {
        driver.findElement(selector).click();
        return this;
    }




    public ChangeCity clickEvpatoryCity() {
        driver.findElement(index2).click();
        return this;
    }

    public ChangeCity checkResultEvpatory() {
        int resultTextEvpatory = driver.findElements(textCardEvpatory).size();
        int resultCountCardEvpatory = driver.findElements(resultCardEvpatory).size();
        Assert.assertEquals(resultTextEvpatory, resultCountCardEvpatory);
        System.out.println(resultCountCardEvpatory + " " + resultCountCardEvpatory);
        return this;
    }

    // Проверка результат города Керчь
    public ChangeCity clickKerchCity() {
        driver.findElement(index3).click();
        return this;
    }
    public ChangeCity checkResultKerch(){
        int resultTextKerch = driver.findElements(textCardKerch).size();
        int resultCountCardKerch = driver.findElements(resultCardKerch).size();
        Assert.assertEquals(resultTextKerch, resultCountCardKerch);
        System.out.println(resultTextKerch + " " + resultCountCardKerch);
        return this;
    }

    // Проверка результата города "Красноперекопск"

    public ChangeCity clickIndex4(){
        driver.findElement(index4).click();
        return this;
    }

    public ChangeCity checkResultIndex4(){
        int resultTextIndex4 = driver.findElements(textCardIndex4).size();
        int resultCountCardIndex4 = driver.findElements(resultCardIndex4).size();
        Assert.assertEquals(resultTextIndex4, resultCountCardIndex4);
        System.out.println(resultTextIndex4 + " " + resultCountCardIndex4);
        return this;
    }
    //Проверка результта города "Севастополь"

    public ChangeCity clickSevastopolCity(){
        driver.findElement(sevastopolCity).click();
        return this;
    }
    public ChangeCity checkResultSevastopol(){
        int resultTextSevastopol = driver.findElements(textCardSevastopol).size();
        int resultCountCardSevastopol = driver.findElements(resultCardSevastopol).size();
        Assert.assertEquals(resultTextSevastopol, resultCountCardSevastopol);
        System.out.println(resultTextSevastopol + " " + resultCountCardSevastopol);
        return this;
    }

    //Проверка результата города "Симферополь"
    public ChangeCity clickSimferopol(){
        driver.findElement(simferopolCity).click();
        return this;
    }
    public ChangeCity checkResultSimferopol(){
        int resultTextSimferopol = driver.findElements(textCardSimferopol).size();
        int resultCountCardSimferopol = driver.findElements(resultCardSimferopol).size();
        Assert.assertEquals(resultTextSimferopol, resultCountCardSimferopol);
        System.out.println(resultTextSimferopol + " " + resultCountCardSimferopol);
        return this;
    }

    //Проверка результата города "Феодосия"
    public ChangeCity clickFeodocia(){
        driver.findElement(feodociaCity).click();
        return this;
    }
    public ChangeCity checkResultFeodocia(){
        int resultTextFeodocia = driver.findElements(textCardFeodocia).size();
        int resultCountCardFeodocia = driver.findElements(resultCardFeodocia).size();
        Assert.assertEquals(resultTextFeodocia, resultCountCardFeodocia);
        System.out.println(resultTextFeodocia + " " + resultCountCardFeodocia);
        return this;
    }

    //Проверка результата города "Ялта"
    public ChangeCity clickYalta(){
        driver.findElement(yaltaCity).click();
        return this;
    }
    public ChangeCity checkResultYalta(){
        int resultTextYalta = driver.findElements(textCardYalta).size();
        int resultCountCardYalta = driver.findElements(resultCardYalta).size();
        Assert.assertEquals(resultTextYalta, resultCountCardYalta);
        System.out.println(resultTextYalta + " " + resultCountCardYalta);
        return this;
    }
}
