package pageFactory;

import commonApi.Base;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by JK on 1/21/2016.
 */
public class Homepage extends Base {

    @Test
    public void linksValidation() throws InterruptedException, IOException

    {
        clickByXpath(".//*[@id='toplinks']/ul[1]/li[1]/a");

        validateByCSS("#banner", "2X Result link");
        screenShot();






    }

}

