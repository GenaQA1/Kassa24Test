package Page.Sticker;

import Page.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Sticker extends BasePage {
    public Sticker(WebDriver driver) {
        super(driver);
    }
    //Стикер "Без сервисного сбора"
    private final By sticker_fee = By.xpath("//div[@class = 'sticker-block sticker-wo_fee']");
    private final By resultSticker_fee = By.xpath("/html/body/main/section[1]/ul/li");
    private final By nubmersSticker_fee = By.xpath("//*[@class = 'sticker-block sticker-wo_fee']");

    //проверка вывода правильного кол-во стикеров в результате "Без сервисного сбора"

    public Sticker clickSticker_fee(){
        driver.findElement(sticker_fee).click();
        return this;
    }

    public Sticker checkResultSticker_fee (){
        int nubmersStick_fee = Integer.parseInt(String.valueOf(driver.findElements(nubmersSticker_fee).size()));
        int resultStick_fee = Integer.parseInt(String.valueOf(driver.findElements(resultSticker_fee).size()));
        Assert.assertEquals(nubmersStick_fee,resultStick_fee);
        return this;
    }

    //Стикер "Пушкинская карта"

    private final By sticker_pushkina = By.xpath("//div[@class = 'sticker-block sticker-pushkin']");
    private final By resultSticer_pushkina = By.xpath("/html/body/main/section[1]/ul/li");

    //проверка вывода правильного кол-во стикеров в результате "Пушкинская карта"

    public Sticker clickSticker_pushkina(){
        driver.findElement(sticker_pushkina).click();
        return this;
    }

    public Sticker checkResultSticker_pushkina(){
        int nubmersStick_pushkina = Integer.parseInt(String.valueOf(driver.findElements(sticker_pushkina).size()));
        int resultStick_pushkina = Integer.parseInt(String.valueOf(driver.findElements(resultSticer_pushkina).size()));
        Assert.assertEquals(nubmersStick_pushkina,resultStick_pushkina);
        return this;
    }

    //Стикер "Туристам"
    private final By sticker_tourist = By.xpath("//div [@class = 'sticker-block sticker-tourist']");
    private final By resultSticker_tourist = By.xpath("/html/body/main/section[1]/ul/li");

    //проверка вывода правильного кол-во стикеров в результате "Туристам"

    public Sticker clickSticker_tourist(){
        driver.findElement(sticker_tourist).click();
        return this;
    }
    public Sticker checkResultSticker_tourist(){
        int nubmersStick_tourist = Integer.parseInt(String.valueOf(driver.findElements(sticker_tourist).size()));
        int resultStick_tourist = Integer.parseInt(String.valueOf(driver.findElements(resultSticker_tourist).size()));
        Assert.assertEquals(nubmersStick_tourist,resultStick_tourist);
        return this;
    }


}
