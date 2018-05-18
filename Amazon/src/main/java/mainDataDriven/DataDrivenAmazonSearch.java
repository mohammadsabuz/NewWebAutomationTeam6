package mainDataDriven;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

public class DataDrivenAmazonSearch extends CommonAPI {

    @DataProvider(name="inputs")
    public Object[][] getData(){
        return new Object[][]{
                {"laptop"},
                {"games"},
                {"ps4 games"}
        };
    }
}
