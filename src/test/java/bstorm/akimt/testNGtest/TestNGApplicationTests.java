package bstorm.akimt.testNGtest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;

@SpringBootTest
class TestNGApplicationTests {

	@Autowired
	private ClassOne classOne;

	@Test
	void contextLoads() {
		Assert.assertNotNull(classOne);
	}

}
