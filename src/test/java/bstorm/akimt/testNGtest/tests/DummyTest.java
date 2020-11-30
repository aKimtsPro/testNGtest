package bstorm.akimt.testNGtest.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DummyTest {

    @Test
    public void dummyTest(){
        System.out.println("dummy test 1");
    }

    @Test(expectedExceptions = Exception.class)
    public void dummyExceptionTest() throws Exception {
        System.out.println("test exception");
        throw new Exception();
    }

    @Test
    @Parameters({"param", "second_param"})
    public void dummyParameterizedTest(String parameter, String secondParameter){
        System.out.println("test avec param : " + parameter +" - "+ secondParameter);
    }

    @Test(timeOut = 1000) // en ms
    public void dummyTimedTest(){
        System.out.println("timeout test");
        while(true);
    }


}
