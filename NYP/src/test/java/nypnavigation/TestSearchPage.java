package nypnavigation;

import Pages.SearchPage;
import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSearchPage extends CommonApi {

    @Test
    public void search(){
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchIconClickNEnterNewsNSubmit();

    }
}
