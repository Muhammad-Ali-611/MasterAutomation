package home;

import base.CommonApi;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestPageTitle extends CommonApi {

    @Test
    public void pageTitle() throws InterruptedException {
        String actualTitle = "Amazon.com. Spend less. Smile more.";
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
