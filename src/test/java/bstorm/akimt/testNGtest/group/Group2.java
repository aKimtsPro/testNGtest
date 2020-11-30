package bstorm.akimt.testNGtest.group;

import org.testng.annotations.*;

@Test(groups = "group2")
public class Group2 {

    @BeforeGroups(groups = "group2")
    public void beforeGroup2(){
        System.out.println(" - before group 2");
    }

    @AfterGroups(groups = "group2")
    public void afterGroup2(){
        System.out.println(" - after group 2");
    }
}
