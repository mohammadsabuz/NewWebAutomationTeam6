package mainFacebook;

import base.CommonAPI;

public class FacebookLogin extends CommonAPI{
    public void login(){
        typeByXpath("//*[@id='email']", " Team6.selenium@gmail.com");
        typeByXpath("//*[@id='pass']", "team612345");
        typeByXpath("//*[@id='u_0_4']", "login");
    }
}
