package mainFacebook;

import base.CommonAPI;

public class CategoriesDropDown extends CommonAPI {

    public void mainCategoriesdrop(){
        clickByXpath("//select[@aria-describedby='searchDropdownDescription']");
    }
}
