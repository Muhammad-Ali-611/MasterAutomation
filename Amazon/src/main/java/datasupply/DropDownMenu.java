package datasupply;



import base.CommonApi;

import java.util.List;

public class DropDownMenu extends CommonApi {

    public void fetchDropDownMenu(){
        List<String> expectedMenuItems = getListOfTest(".nav-search-dropdown.searchSelect option");
        //making api call in the back end to fetch menu text
        List<String> actualMenuItems = expectedMenuItems;
//        Assert.assertEquals(actualMenuItems,expectedMenuItems);
        for(String menu:expectedMenuItems){
            System.out.println(menu);
        }
    }
}
