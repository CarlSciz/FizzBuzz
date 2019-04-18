import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FizzBuzzJTest {

private int toConvertToFizzBuzz;

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

	@Test
	public void fizzBuzzConvertorLeavesNormalNumberAlone() {
	FizzBuzzConvertor fizzbuzz = new FizzBuzzConvertor();
	Assert.assertEquals( "1", fizzbuzz.convert(toConvertToFizzBuzz));
	
	}
	
}
