package mainAmazon;

import base.CommonAPI;
import utility.Xls_Reader;

public class DataDriverSearchExcelSheet extends CommonAPI {

    //Reading data from Excel sheet
    Xls_Reader reader = new Xls_Reader("../testData/ItemsToSearchInAmazon.xlsx");

    String videoGames = reader.getCellData("Sheet1", "VideoGames", 2);




}
