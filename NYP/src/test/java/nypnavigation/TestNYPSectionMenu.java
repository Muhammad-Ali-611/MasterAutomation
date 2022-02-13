package nypnavigation;

import Pages.SectionMenuPage;
import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestNYPSectionMenu extends CommonApi {

    @Test
    public void sectionMenu(){
        SectionMenuPage sectionMenuPage = PageFactory.initElements(driver, SectionMenuPage.class);
        sectionMenuPage.clickOnSectionMenu();
        sectionMenuPage.goToMetroPage(driver).getHeadLineNewsText();
    }
}
