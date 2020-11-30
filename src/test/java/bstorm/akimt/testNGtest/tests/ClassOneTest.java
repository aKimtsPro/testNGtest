package bstorm.akimt.testNGtest.tests;

import bstorm.akimt.testNGtest.ClassOne;
import bstorm.akimt.testNGtest.InterfaceOne;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.*;

import static org.testng.Assert.*;

@SpringBootTest
@Test(groups = "group1")
public class ClassOneTest {

    private InterfaceOne service;
    private int cpt = 0;

    @BeforeTest
    public void setup(){
        System.out.println("before tests");
        service = new ClassOne();
    }

    @AfterTest
    public void showCpt(){
        System.out.println("after tests");
    }


    @BeforeClass
    public void beforeClass(){
        System.out.println(" - - before Class 1");
    }

    @AfterClass
    public void afterClass(){
        System.out.println(" - - after Class 1");
    }


    @Test(dependsOnMethods = "testDummyMethodCase2")
    public void testDummyMethodCase1() {
        System.out.println(" - - - test 1 from Class 1 [group 1]");
        String param = "case 1";
        int rslt = service.dummyMethod(param);
        assertEquals(rslt, 1);
    }

    @Test(dependsOnGroups = "group2")
    public void testDummyMethodCase2() {
        System.out.println(" - - - test 2 from Class 1 [group 1]");
        String param = "case 2";
        int rslt = service.dummyMethod(param);
        assertEquals(rslt, 2);
    }

    @Test(enabled = false)
    public void testDummyMethodCase3() {
        System.out.println(" - - - test 3 from Class 1 [group 1]");
        String param = "case 3";
        int rslt = service.dummyMethod(param);
        assertEquals(rslt, 3);
    }

    @Test
    @Parameters("param1")
    public void testDummyMethodCaseDefault(String param) {
        System.out.println(" - - - test 4 from Class 1 [group 1] | with parameter : " + param);
        int rslt = service.dummyMethod(param);
        assertEquals(rslt, -1);
    }
}