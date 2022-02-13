package testApi;

import JavaEmployeeResources.SingleEmployeeResources;
import org.testng.annotations.Test;

public class TestSingleEmployeeReosources extends SingleEmployeeResources {

    @Test
    public void singleValidEmployeeCall(){
        getValidSingleEmployeeResources();
    }

    @Test
    public void singleInValidEmployeeCall(){
        getInValidSingleEmployeeResources();
    }
}
