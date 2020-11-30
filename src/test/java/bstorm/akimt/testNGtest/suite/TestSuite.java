package bstorm.akimt.testNGtest.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

@Test(groups = "group1") // minimum pour externaliser
public class TestSuite {


    @BeforeSuite // pas externalisable
    public void beforeSuite(){
        System.out.println("before suite");
    }

    @AfterSuite // pas externalisable
    public void afterSuite(){
        System.out.println("after suite");
    }

}
