package mainFacebook;

import base.CommonAPI;

public class CreateAccount extends CommonAPI {
    public void createAccount(){

        typeByXpath("//*[@id='u_0_o']]","Team6");
        typeByXpath("//*[@id='u_0_q']","abcd");
        typeByXpath("//*[@id='u_0_t']", "abcd@gmail.com");
    }
}
