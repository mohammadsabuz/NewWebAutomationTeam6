package testFacebook;

import mainFacebook.MessageReceivce;
import org.testng.annotations.Test;

public class TestMessageReceive extends MessageReceivce{

    @Test
    public void receiveMessage(){
        messageReceive();
    }
}
