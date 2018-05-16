package testAmazon;

import mainBestBuy.SearchForIteams;
import org.testng.annotations.Test;

public class SearchIteams extends SearchForIteams {

    @Test
    public void searchItem (){
        searchForItems();
    }
}
