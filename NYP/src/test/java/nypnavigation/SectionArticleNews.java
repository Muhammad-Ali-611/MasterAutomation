package nypnavigation;

import base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class SectionArticleNews extends CommonApi {

    @Test
    public void getSectionNews(){
        driver.findElement(By.cssSelector("#sections span.menu-icon .menu-icon-svg")).click();
        List<WebElement> elements = driver.findElements(By.cssSelector(".menu.menu-main-menu li a"));
        for(WebElement element:elements) {
            System.out.println(element.getText());
        }
    }
}
