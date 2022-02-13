package table;

import base.CommonApi;
import org.openqa.selenium.By;

public class ReadTableData extends CommonApi {

    public void readTableData(){
        String tableData = driver.findElement(By.cssSelector(".ws-table-all.notranslate tr:nth-child(3) td:nth-child(6)")).getText();
        System.out.println(tableData);
    }
}
