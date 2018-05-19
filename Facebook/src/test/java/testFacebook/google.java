package testFacebook;

import org.testng.annotations.Test;
import spreadsheetAutiomation.Google;

import java.io.IOException;

public class google extends Google{
    @Test
    public void test2() throws IOException, InterruptedException {
        searchByName();
    }
}
