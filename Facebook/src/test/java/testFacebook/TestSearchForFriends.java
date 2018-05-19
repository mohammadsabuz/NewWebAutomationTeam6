package testFacebook;

import mainFacebook.SearchForFriends;
import org.testng.annotations.Test;

public class TestSearchForFriends extends SearchForFriends{

    @Test
    public void searchForFriends(){
        searchFriends();
    }
}
