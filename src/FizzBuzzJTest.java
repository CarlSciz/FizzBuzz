import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FizzBuzzJTest {

private int toConvertToFizzBuzz;

	@Test
	public void fizzBuzzConvertorLeavesNormalNumberAlone() {
	FizzBuzzConvertor fizzbuzz = new FizzBuzzConvertor();
	Assert.assertEquals( "1", fizzbuzz.convert(toConvertToFizzBuzz));
	Assert.assertEquals( "2", fizzbuzz.convert(toConvertToFizzBuzz));
	}
	
	@Test
	public void fizzBuzzConvertorMultiplesOfThree() {
		FizzBuzzConvertor fizzbuzz = new FizzBuzzConvertor();
		Assert.assertEquals("Fizz", fizzbuzz.convert(toConvertToFizzBuzz));
	}
	
	@Test
	public void fizzBuzzConvertorMultiplesOfFive() {
		FizzBuzzConvertor fizzbuzz = new FizzBuzzConvertor();
		Assert.assertEquals("Buzz", fizzbuzz.convert(toConvertToFizzBuzz));
	}
	
	
}
