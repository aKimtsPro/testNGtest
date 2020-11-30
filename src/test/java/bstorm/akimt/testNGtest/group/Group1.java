package bstorm.akimt.testNGtest.group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

@Test(groups = "group1") // facultatif
public class Group1 {

    @BeforeGroups(groups = "group1")
    public void beforeGroup1(){
        System.out.println(" - before group 1");
    }

    @AfterGroups(groups = "group1")
    public void afterGroup1(){
        System.out.println(" - after group 1");
    }

}
