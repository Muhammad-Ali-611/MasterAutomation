package datasupply;

import base.CommonApi;

import java.util.List;


public class SearchItems extends CommonApi {

//  public void itemsSearch() throws InterruptedException{
//        List<String> items = SuppleData.getTestData();
//        for(String item:items) {
//            typeOnWebElement("twotabsearchtextbox",item);
//            Thread.sleep(1000);
//            clearInputBox("twotabsearchtextbox");
//        }
//    }

    public void itemsSearch() throws Exception {
        SuppleData suppleData = new SuppleData();
        List<String> items = suppleData.getItemListFromDB();
        for(String item:items) {
            typeOnWebElement("twotabsearchtextbox",item);
            Thread.sleep(500);
            clearInputBox("twotabsearchtextbox");
        }
    }
}
