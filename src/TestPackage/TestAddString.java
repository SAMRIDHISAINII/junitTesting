package TestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class TestAddString {

	@Test
	public void test() {
		JUnitFunctions junit = new JUnitFunctions();
		String result = junit.addstring("Hello", "Sandy");
		assertEquals("HelloSandy",result);
	}

}
