package bstorm.akimt.testNGtest.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class AssertionDemo {

    public void test(){
        Assert.assertEquals("a","a"); // utilise equals
        Assert.assertEquals("a","a", "message"); // chaque assertion possède une surcharge avec message
        Assert.assertSame("a", "a"); // meme objet ou pas
        Assert.assertNotEquals("a", "b");
        Assert.assertNotSame("a",new String("a"));
        Assert.assertFalse(false);
        Assert.assertTrue(true);
        Assert.assertNotNull("object");
        Assert.assertNull(null);
        Assert.assertThrows(() -> {throw new Exception();});
        Assert.assertThrows(Exception.class, () -> {throw new Exception();});
    }
}
