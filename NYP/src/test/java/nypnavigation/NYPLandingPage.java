package nypnavigation;

import Pages.LandingPage;
import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NYPLandingPage extends CommonApi {

    //@Test
    public void getLandingPageTitle()throws InterruptedException{
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
    }

    //@Test
    public void clickOnSectionMenuTab(){
        LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
        landingPage.clickOnSectionMenu();
    }

    //@Test
    public void clickOnSearch(){
        LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
        landingPage.clickOnSearch();
    }
    @Test
    public void clickOnLogIn(){
        LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
        landingPage.clickOnLogIn();
    }
}
