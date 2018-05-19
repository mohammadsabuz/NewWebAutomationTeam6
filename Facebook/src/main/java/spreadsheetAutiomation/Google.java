package spreadsheetAutiomation;

import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static utility.GoogleSheetReader.getSheetsService;

public class Google extends CommonAPI{

    public List<List<Object>> getSpreadSheetRecords(String spreadSheetID, String range) throws IOException {
        //build a authorize api client service
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values().get(spreadSheetID,range).execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0){
            return null;
        }else{
            return values;
        }
    }

    public List<String> searchByName() throws IOException, InterruptedException {

        List<List<Object>> values = getSpreadSheetRecords("1cOR_z3Koi0HuWW_4DeKWRf9roDVgJY_jgQtCa7AnpGk","Sheet1!A2:A");
        List<String> actual = new ArrayList<String >();

        for(List row : values){
            sleepFor(2);
            typeByXpath("//*[@id='email']",row.get(1).toString());
            sleepFor(2);
        }return actual;
    }
}
