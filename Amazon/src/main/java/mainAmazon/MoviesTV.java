package mainAmazon;

import base.CommonAPI;

public class MoviesTV extends CommonAPI {
    public void CategoriesMovies(){
        clickByXpath("//option[@value='search-alias=movies-tv']");
        typeByCssNEnter("#twotabsearchtextbox", "Movies & TV");
    }
}
