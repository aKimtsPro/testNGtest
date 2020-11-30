package bstorm.akimt.testNGtest.tests;

import bstorm.akimt.testNGtest.ClassTwo;
import bstorm.akimt.testNGtest.InterfaceTwo;
import org.testng.annotations.*;

public class ClassTwoTest {

    private InterfaceTwo service;

    @BeforeClass
    public void beforeClass(){
        System.out.println(" - - before Class 2");
        service = new ClassTwo();
    }

    @AfterClass
    public void afterClass(){
        System.out.println(" - - after Class 2");
    }

    @Test(expectedExceptions = Exception.class, groups = "group1")
    public void testCheckEqualsZero() throws Exception {
        System.out.println(" - - - test 1 from Class 2 [group 1]");
        service.dummyMethod(5);
    }

    @Test(groups = "group2")
    public void test2(){
        System.out.println(" - - - test 2 from Class 2 [group 2]");
    }

}