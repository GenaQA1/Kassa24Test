package test.category;

import org.testng.annotations.Test;
import test.base.BaseTest;

import java.net.MalformedURLException;

public class category extends BaseTest {


    public category() throws MalformedURLException {
    }

    //Проверка Категории "Театр"
    @Test
    public void checkCountTheatre(){
    basePage.open("https://kassa24.ru/");

    category
            .clickCategoryTheatre()
            .checkResultTheatre();

}

    @Test
    public void checkCountAll(){
        basePage.open("https://kassa24.ru/");

        category
                .clickCategoryAll()
                .checkResultAll();

    }

    @Test
    public void checkCountClub(){
        basePage.open("https://kassa24.ru/");

        category
                .clickCategoryClub()
                .checkResultClub();

    }

    @Test
    public void checkCountConcert(){
        basePage.open("https://kassa24.ru/");

        category
                .clickConcert()
                .checkResultConcert();

    }

    @Test
    public void checkCountShow(){
        basePage.open("https://kassa24.ru/");

        category
                .clickShow()
                .checkResultShow();

    }

    @Test
    public void checkNew_Year(){
        basePage.open("https://kassa24.ru/");

        category
                .clickNew_Year()
                .checkResultNew_Year();
    }

    @Test
    public void checkPeregrinandum(){
        basePage.open("https://kassa24.ru/");

        category
                .clickPeregrinadum()
                .checkResultPeregrinadum();
    }

    @Test
    public void CheckId8(){
        basePage.open("https://kassa24.ru/");

        category
                .clickElementId8()
                .checkResultId8();
    }

    @Test
    public void CheckId9(){
        basePage.open("https://kassa24.ru/");

        category
                .clickElementId9()
                .checkResultId9();
    }

    @Test
    public void CheckId10(){
        basePage.open("https://kassa24.ru/");

        category
                .clickElementId10()
                .checkResultId10();
    }
    @Test
    public void CheckId11(){
        basePage.open("https://kassa24.ru/");

        category
                .clickElementId11()
                .checkResultId11();
    }

}
