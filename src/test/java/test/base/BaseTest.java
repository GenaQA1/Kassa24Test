package test.base;

import Common.CommonAction;
import Page.Base.BasePage;
import Page.Category.Category;
import Page.ChangeCity.ChangeCity;
import Page.LoginPasset.LoginPasset;
import Page.OplataTickets.OplataTickets;
import Page.RegistrForm.RegistForm;
import Page.Sticker.Sticker;
import Page.WidgetAppWlogo.WidgetAppwlogo;
import Page.WidgetVkKassa24.WidgetVkKassa24;
import Page.firstKassa24.Firstpage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;


public class BaseTest {


    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected Firstpage firstPage = new Firstpage(driver);
    protected LoginPasset loginPasset = new LoginPasset(driver);
    protected RegistForm registrForm = new RegistForm(driver);
    protected Category category = new Category(driver);
    protected Sticker sticker = new Sticker(driver);
    protected ChangeCity changeCity = new ChangeCity(driver);
    protected OplataTickets oplataTickets = new OplataTickets(driver);
    protected WidgetVkKassa24 widgetVkKassa24 = new WidgetVkKassa24(driver);
    protected WidgetAppwlogo widgetAppwlogo = new WidgetAppwlogo(driver);


    //Постоянные действия
    private final By loginAdmin = By.xpath("//*[@id='loginform-username']");
    private final By passAdmin = By.xpath("//*[@id='loginform-password']");
    private final By btnAdmin = By.xpath("//*[@id='login-form']/div[4]/button");
    private final By ulUsers = By.xpath("//*[@id='w1']/li[3]/a");
    private final By listUsers = By.xpath("//a[text()='Список']");
    private final By loginUsers = By.xpath("//*[@id='w0-filters']/td[3]/input");
    private final By deleteUsers = By.xpath("//*[@id='w0']/table/tbody/tr/td[11]/a[3]");
    private final By btnDeleteUsers = By.xpath("/html/body/div[2]/div/div/div[2]/button[2]");
    private final By btnDeleteUsersUr = By.xpath("/html/body/main/article/section/div[1]/nav/ul/li[6]/a");
    private final By content = By.xpath("//*[@id='w1']/li[2]");
    private final By events = By.xpath("//*[@id='w2']/li[10]/a");
    private final By filtersName = By.xpath("//input[@name = 'Search[title]']");
    private final By changeEvent = By.xpath("//*[@id='w0-container']/table/tbody/tr/td[14]/a[3]");
    private final By fieldServiseFee = By.xpath("//*[@id='event-fee']");
    private final By btnAcceptEvent = By.xpath("//*[@id='w0']/div[60]/button");

    public BaseTest() throws MalformedURLException {
    }


    public BaseTest sendKeyLoginAdmin() {
        try {
            driver.findElement(loginAdmin).click();
            driver.findElement(loginAdmin).sendKeys("admin2");
        } catch (Exception e) {
            System.out.println("Элемент не найден");
        }
        return this;
    }

    public BaseTest sendKeyPassAdmin() {
        try {
            driver.findElement(passAdmin).click();
            driver.findElement(passAdmin).sendKeys("qwerty123");
        } catch (Exception e) {
            System.out.println("Элемент не найден");
        }
        return this;
    }

    public BaseTest clickBtnAdmin() {
        try {
            driver.findElement(btnAdmin).click();
        } catch (Exception e) {
            System.out.println("Элемент не найден");
        }
        return this;
    }

    public BaseTest clickContent() throws InterruptedException {
        Thread.sleep(5000);
        try {
            driver.findElement(content).click();
        } catch (Exception e) {
            System.out.println("Элемент не найден");
        }
        return this;
    }

    public BaseTest clickEvent(){
        try {
            driver.findElement(events).click();
        } catch (Exception e) {
            System.out.println("Элемент не найден");
        }
        return this;
    }
    public BaseTest fieldFiltersName(){
        driver.findElement(filtersName).click();
        driver.findElement(filtersName).sendKeys("Дракула. Ледовый мюзикл");
        driver.findElement(filtersName).sendKeys(Keys.ENTER);
        return this;
    }
    public BaseTest clickChangeEvent(){
        driver.findElement(changeEvent).click();
        return this;
    }
    public BaseTest changeServise5() {
        driver.findElement(fieldServiseFee).click();
        driver.findElement(fieldServiseFee).clear();
        driver.findElement(fieldServiseFee).sendKeys("5");
        return this;
    }
    public BaseTest changeServise0() {
        driver.findElement(fieldServiseFee).click();
        driver.findElement(fieldServiseFee).clear();
        driver.findElement(fieldServiseFee).sendKeys("0");
        return this;
    }
    public BaseTest changeServise2(){
        driver.findElement(fieldServiseFee).click();
        driver.findElement(fieldServiseFee).clear();
        driver.findElement(fieldServiseFee).sendKeys("2");
        return this;
    }
    public BaseTest changeServise3(){
        driver.findElement(fieldServiseFee).click();
        driver.findElement(fieldServiseFee).clear();
        driver.findElement(fieldServiseFee).sendKeys("3");
        return this;
    }
    public BaseTest changeServise1(){
        driver.findElement(fieldServiseFee).click();
        driver.findElement(fieldServiseFee).clear();
        driver.findElement(fieldServiseFee).sendKeys("1");
        return this;
    }
    public BaseTest clickBtnAcceptEvent() throws InterruptedException {
        driver.findElement(btnAcceptEvent).click();
        Thread.sleep(5000);
        return this;
    }

    public BaseTest clickUlUsers() {
        driver.findElement(ulUsers).click();
        return this;
    }

    public BaseTest clickListUsers() {
        driver.findElement(listUsers).click();
        return this;
    }


    public BaseTest sendKeyLoginUsers() {
        driver.findElement(loginUsers).click();
        driver.findElement(loginUsers).sendKeys("22-18");
        driver.findElement(loginUsers).sendKeys(Keys.ENTER);
        return this;
    }

    public BaseTest clickDeleteUsers() {
        driver.findElement(deleteUsers).click();
        driver.findElement(btnDeleteUsers).click();
        return this;
    }

    public BaseTest clickDeleteUsersUr(){
        driver.findElement(btnDeleteUsersUr).click();
        return this;
    }


    //@AfterSuite(alwaysRun = true)
    public void clear() {
        basePage.open("http://admin.ticket.bestit.com.ua/");
        sendKeyLoginAdmin();
        sendKeyPassAdmin();
        clickBtnAdmin();
        clickUlUsers();
        clickListUsers();
        sendKeyLoginUsers();
        clickDeleteUsers();
        System.out.println("Аккаунт удален");
    }

//    @AfterTest
//    public void quite() {
//        driver.quit();
//    }
}

