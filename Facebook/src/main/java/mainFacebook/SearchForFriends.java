package mainFacebook;

import base.CommonAPI;

public class SearchForFriends extends CommonAPI {

    public void searchFriends(){
        typeByXpath("//*[@id='email']", " Team6.selenium@gmail.com");
        typeByXpath("//*[@id='pass']", "team612345");
        typeByXpath("//*[@id='u_0_4']", "login");
        clickById("#findFriendsNav");
    }
}

