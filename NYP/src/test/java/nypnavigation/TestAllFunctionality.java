package nypnavigation;

import Pages.AllFunctionality;
import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestAllFunctionality extends CommonApi {

    @Test
    public void newsFeatures() throws IOException, InterruptedException {
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AllFunctionality featureNews = PageFactory.initElements(driver, AllFunctionality.class);
        featureNews.runAllTheFeatureTest(driver);
    }


}
