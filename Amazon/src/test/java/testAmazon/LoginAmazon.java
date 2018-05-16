package testAmazon;

import mainBestBuy.LoginToAmazon;
import org.testng.annotations.Test;

public class LoginAmazon extends LoginToAmazon {

    @Test
    public void loginAmazon(){
        mainAmazonLogin();
    }
}
