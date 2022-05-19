package test.sticker;

import org.testng.annotations.Test;
import test.base.BaseTest;

public class sticker extends BaseTest {


    @Test
    public void checkResultSticker_fee(){
        basePage.open("https://kassa24.ru/");

        sticker
                .clickSticker_fee()
                .checkResultSticker_fee();
    }

    @Test
    public void checkResultSticker_pushkina(){
        basePage.open("https://kassa24.ru/");

        sticker
                .clickSticker_pushkina()
                .checkResultSticker_pushkina();
    }

    @Test
    public void checkResultSticker_tourist(){
        basePage.open("https://kassa24.ru/");


        sticker
                .clickSticker_tourist()
                .checkResultSticker_tourist();
    }


}
