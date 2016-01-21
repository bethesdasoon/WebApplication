package account;

import commonApi.Base;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by JK on 1/19/2016.
 */

public class SignIn extends Base{

    @Test
    public void signPage() throws InterruptedException, IOException

    {    // click signin button
        clickByXpath(".//*[@id='toplinks']/ul[1]/li[7]/a/img");

        // validate signin image
        validateByCSS(".header-sign-in-text","SignIn");
        screenShot();
    }



}
