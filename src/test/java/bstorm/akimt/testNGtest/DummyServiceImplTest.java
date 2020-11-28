package bstorm.akimt.testNGtest;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DummyServiceImplTest {

    private DummyService service;

    @BeforeSuite
    public void setup(){
        service = new DummyServiceImpl();
    }

    @Test
    public void testDummyMethodCase1() {
        String param = "case 1";
        int rslt = service.dummyMethod(param);
        assertEquals(rslt, 1);
    }

    @Test
    public void testDummyMethodCase2() {
        String param = "case 2";
        int rslt = service.dummyMethod(param);
        assertEquals(rslt, 2);
    }

    @Test
    public void testDummyMethodCase3() {
        String param = "case 3";
        int rslt = service.dummyMethod(param);
        assertEquals(rslt, 3);

    }

    @Test
    public void testDummyMethodCaseDefault() {
        String param = "hein?";
        int rslt = service.dummyMethod(param);
        assertEquals(rslt, -1);

    }
}