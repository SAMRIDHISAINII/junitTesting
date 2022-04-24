package TestPackage;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestAddNumber {

	@Test
	public void test() {
		JUnitFunctions junit = new JUnitFunctions();
		int result = junit.addnumber(100, 500);
		assertEquals(600,result);
		}

}
