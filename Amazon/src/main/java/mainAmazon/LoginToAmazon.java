package mainAmazon;

import base.CommonAPI;
import reporting.TestLogger;

public class LoginToAmazon extends CommonAPI {

    public void mainAmazonLogin(){
        clickByXpath("//div[@id='nav-tools']//a[@class='nav-a nav-a-2']");
        TestLogger.log("clicked Signed"); //test logger
        typeByXpath("//input[@id='ap_email']","test@email.com");
        TestLogger.log("entering email address"); //test logger
        clickByXpath("//input[@id='continue']");
        TestLogger.log("clicked Continue"); //test logger
        typeByXpath("//input[@id='ap_password']","abcd1234");
        TestLogger.log("entering password"); //test logger
        clickByXpath("//input[@id='signInSubmit']");
        TestLogger.log("clicked Submit"); //test logger
    }
}
