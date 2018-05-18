package mainAmazon;

import base.CommonAPI;

public class LoginToAmazon extends CommonAPI {

    public void mainAmazonLogin(){
        clickByXpath("//div[@id='nav-tools']//a[@class='nav-a nav-a-2']");
        typeByXpath("//input[@id='ap_email']","test@email.com");
        clickByXpath("//input[@id='continue']");
        typeByXpath("//input[@id='ap_password']","abcd1234");
        clickByXpath("//input[@id='signInSubmit']");
    }
}
