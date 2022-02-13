package nypnavigation;

import base.CommonApi;
import org.testng.annotations.Test;


public class NewsPage extends CommonApi {

    @Test
    public void home(){
        System.out.println(driver.getTitle());
    }
}
