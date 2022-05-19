package Page.Category;

import Page.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Category extends BasePage {
    public Category(WebDriver driver) {
        super(driver);
    }

    //Категория "Все"
    private final By categoryAll = By.xpath("/html/body/header/section[2]/div[1]/ul/li[1]/a");
    private final By nubmersAll = By.xpath("/html/body/header/section[2]/div[1]/ul/li[1]/span");
    private final By resultAll = By.xpath("/html/body/main/section[1]/ul/li");

    //Проверка категории "Все"
    public Category clickCategoryAll(){
        driver.findElement(categoryAll).click();
        return this;
    }
    public Category checkResultAll(){
        int countAll = Integer.parseInt(String.valueOf(driver.findElements(resultAll).size()));
        int numberAll = Integer.parseInt(String.valueOf(driver.findElement(nubmersAll).getText()));
        if (numberAll == countAll){
            System.out.println("Правильное кол-во"+" " + numberAll + " " + countAll);
        }else {
            System.out.println("Кол-во не сходится" + " " + numberAll + " "+ countAll);
        }
        return this;
    }

    //Категория "Театр"
    private final By categoryTheatre = By.xpath("/html/body/header/section[2]/div[1]/ul/li[2]/a");
    private final By nubmersTheatre = By.xpath("/html/body/header/section[2]/div[1]/ul/li[2]/span");
    private final By resultTheatre = By.xpath("/html/body/main/section[1]/ul/li");

    //Проверка категории "Театр"
    public Category clickCategoryTheatre() {
        driver.findElement(categoryTheatre).click();
        return this;
    }

    public Category checkResultTheatre() {
        int countTheatre = Integer.parseInt(String.valueOf(driver.findElements(resultTheatre).size()));
        int numberTheatre = Integer.parseInt(String.valueOf(driver.findElement(nubmersTheatre).getText()));
        if (numberTheatre == countTheatre){
            System.out.println("Правильное кол-во"+ " " + countTheatre + " " + numberTheatre);
        }else {
            System.out.println("Кол-во не сходится"+ " " +countTheatre + " " + numberTheatre);
        }
        return this;
    }

    //Категория "Клуб"
    private final By categoryClub = By.xpath("/html/body/header/section[2]/div[1]/ul/li[3]/a");
    private final By nubmersClub = By.xpath("/html/body/header/section[2]/div[1]/ul/li[3]/span");
    private final By resultClub = By.xpath("/html/body/main/section[1]/ul/li");

    //Проверка категории "Клуб"

    public Category clickCategoryClub(){
        driver.findElement(categoryClub).click();
        return this;
    }

    public Category checkResultClub(){
        int countClub = Integer.parseInt(String.valueOf(driver.findElements(resultClub).size()));
        int numberClub = Integer.parseInt(String.valueOf(driver.findElement(nubmersClub).getText()));
        if (numberClub == countClub){
            System.out.println("Правильное кол-во"+ " " + countClub + " " + numberClub);
        }else {
            System.out.println("Кол-во не сходится"+ " " +countClub + " " + numberClub);
        }
        return this;
    }

    //Категория "Концерт"
    private final By categoryСoncert = By.xpath("/html/body/header/section[2]/div[1]/ul/li[4]/a");
    private final By nubmersConcert = By.xpath("/html/body/header/section[2]/div[1]/ul/li[4]/span");
    private final By resultConcert = By.xpath("/html/body/main/section[1]/ul/li");

    //Проверка Категории "Концерт"

    public Category clickConcert(){
        driver.findElement(categoryСoncert).click();
        return this;
    }
    public Category checkResultConcert(){
        int countConcert = Integer.parseInt(String.valueOf(driver.findElements(resultConcert).size()));
        int numbersConcert = Integer.parseInt(String.valueOf(driver.findElement(nubmersConcert).getText()));
        if (numbersConcert == countConcert){
            System.out.println("Правильное кол-во"+ " " + countConcert + " " + numbersConcert);
        }else {
            System.out.println("Кол-во не сходится"+ " " +countConcert + " " + numbersConcert);
        }
        return this;
    }


    //Категория "Шоу"
    private final By categoryShow = By.xpath("/html/body/header/section[2]/div[1]/ul/li[5]/a");
    private final By numbersShow = By.xpath("/html/body/header/section[2]/div[1]/ul/li[5]/span");
    private final By resultShow = By.xpath("/html/body/main/section[1]/ul/li");

    //Проверка категории "Шоу"

    public Category clickShow(){
        driver.findElement(categoryShow).click();
        return this;
    }
    public Category checkResultShow(){
        int countShow = Integer.parseInt(String.valueOf(driver.findElements(resultShow).size()));
        int nubmersShow = Integer.parseInt(String.valueOf(driver.findElement(numbersShow).getText()));
        Assert.assertEquals(countShow,nubmersShow);
        return this;
    }

    //Категории "Новый год"

    public final By categoryNew_Year = By.xpath("/html/body/header/section[2]/div[1]/ul/li[6]/a");
    private final By nubmersNew_Year = By.xpath("/html/body/header/section[2]/div[1]/ul/li[6]/span");
    private final By resultNew_Year = By.xpath("/html/body/main/section[1]/ul/li");

    //Проверка категории "Новый год"

    public Category clickNew_Year(){
        driver.findElement(categoryNew_Year).click();
        return this;
    }
    public Category checkResultNew_Year(){
        int countNew_Year = Integer.parseInt(String.valueOf(driver.findElements(resultNew_Year).size()));
        int nubmerNew_Year =Integer.parseInt(String.valueOf(driver.findElement(nubmersNew_Year).getText()));
        Assert.assertEquals(countNew_Year,nubmerNew_Year);
        return this;
    }

    //Категории "Экскурсия"

    public final By category7 = By.xpath("/html/body/header/section[2]/div[1]/ul/li[7]/a");
    public final By nubmers7 = By.xpath("/html/body/header/section[2]/div[1]/ul/li[7]/span");
    public final By result7 = By.xpath("/html/body/main/section[1]/ul/li");

    //Проверка категории "Экускурсия"

    public Category clickPeregrinadum(){
        driver.findElement(category7).click();
        return this;
    }

    public Category checkResultPeregrinadum (){
        int count7 = Integer.parseInt(String.valueOf(driver.findElements(result7).size()));
        int nubmer7 =Integer.parseInt(String.valueOf(driver.findElement(nubmers7).getText()));
        Assert.assertEquals(count7,nubmer7);
        return this;
    }

    //Проверка id8

    public final By category8 = By.xpath("/html/body/header/section[2]/div[1]/ul/li[8]/a");
    public final By nubmers8 = By.xpath("/html/body/header/section[2]/div[1]/ul/li[8]/span");
    public final By result8 = By.xpath("/html/body/main/section[1]/ul/li");

    //Проверка категории id8

    public Category clickElementId8(){
        try {
            driver.findElement(category8).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    public Category checkResultId8(){
        try {
            int count8 = Integer.parseInt(String.valueOf(driver.findElements(result8).size()));
            int nubmer8 =Integer.parseInt(String.valueOf(driver.findElement(nubmers8).getText()));
            Assert.assertEquals(count8, nubmer8);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return this;
    }

    //Проверка id9

    public final By category9 = By.xpath("/html/body/header/section[2]/div[1]/ul/li[9]/a");
    public final By nubmers9 = By.xpath("/html/body/header/section[2]/div[1]/ul/li[9]/span");
    public final By result9 = By.xpath("/html/body/main/section[1]/ul/li");

    //Проверка категории id9

    public Category clickElementId9(){
        driver.findElement(category9).click();
        return this;
    }
    public Category checkResultId9(){
            int count9 = Integer.parseInt(String.valueOf(driver.findElements(result9).size()));
            int nubmer9 = Integer.parseInt(String.valueOf(driver.findElement(nubmers9).getText()));
            Assert.assertEquals(count9, nubmer9);
            return this;
    }

    //Проверка id10

    public final By category10 = By.xpath("/html/body/header/section[2]/div[1]/ul/li[10]/a");
    public final By nubmers10 = By.xpath("/html/body/header/section[2]/div[1]/ul/li[10]/span");
    public final By result10 = By.xpath("/html/body/main/section[1]/ul/li");

    //Проверка категории id10

    public Category clickElementId10(){
        driver.findElement(category10).click();
        return this;
    }

    public Category checkResultId10(){
        int count10 = Integer.parseInt(String.valueOf(driver.findElements(result10).size()));
        int nubmer10 = Integer.parseInt(String.valueOf(driver.findElement(nubmers10).getText()));
        Assert.assertEquals(count10, nubmer10);
        return this;
    }

    //Проверка id11

    public final By category11 = By.xpath("/html/body/header/section[2]/div[1]/ul/li[11]/a");
    public final By nubmers11 = By.xpath("/html/body/header/section[2]/div[1]/ul/li[11]/span");
    public final By result11 = By.xpath("/html/body/main/section[1]/ul/li");

    public Category clickElementId11(){
        driver.findElement(category11).click();
        return this;
    }

    public Category checkResultId11(){
        int count11 = Integer.parseInt(String.valueOf(driver.findElements(result11).size()));
        int nubmer11 = Integer.parseInt(String.valueOf(driver.findElement(nubmers11).getText()));
        Assert.assertEquals(count11, nubmer11);
        return this;
    }
}
