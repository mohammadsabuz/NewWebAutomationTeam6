package mainAmazon;

import base.CommonAPI;

public class MusicalInstruments extends CommonAPI {

    public void CategoriesMusical(){
        clickByXpath("//option[@value='search-alias=mi']");
        typeByCssNEnter("#twotabsearchtextbox", "Musical Instruments");
    }
}
