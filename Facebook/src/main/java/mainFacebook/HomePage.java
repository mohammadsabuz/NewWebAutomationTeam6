package mainFacebook;

import base.CommonAPI;

public class HomePage extends CommonAPI {

    public void goHome(){
        typeByXpath("//*[@id='email']", " Team6.selenium@gmail.com");
        typeByXpath("//*[@id='pass']", "team612345");
        typeByXpath("//*[@id='u_0_4']", "login");
        typeByXpath("//*[@id='u_0_c']/a","Home");
    }
}
