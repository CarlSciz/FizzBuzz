import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzz_Application {

	@Test
	public void outputForApplication() {
		
		
		FizzBuzzConvertor fizzbuzz = new FizzBuzzConvertor();
		for(int i=1 ; i <= 100; i++) {
			System.out.println(fizzbuzz.convert(i));
		}
	}

}
