package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.Calculator;

import static org.junit.Assert.*;


class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		int expectedResult = 2+3;
		int actualResult = calculator.add(2,3);
		assertEquals(expectedResult, actualResult);
	}

	@ParameterizedTest
	@CsvSource({"2,3"})
	public void Should_add_two_numbers_and_return_result_parameterized(int valueOne, int valueTwo) {
		int expectedResult = 2+3;
		int actualResult = calculator.add(valueOne,valueTwo);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Should_substract_two_numbers_and_return_result() {
		int expectedResult = 2-3;
		int actualResult = calculator.sub(2,3);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		int expectedResult = 2*3;
		int actualResult = calculator.multiply(2,3);
		assertEquals(expectedResult, actualResult);	}
	
	@Test
	public void Should_divide_two_numbers_and_return_result() {
		float expectedResult = 6/3;
		float actualResult = calculator.divide(6,3);
		Assertions.assertEquals(expectedResult, actualResult);
	}

	
	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		Exception excep =  assertThrows(ArrayIndexOutOfBoundsException.class, () -> {calculator.divide(3,0);});
		String expected = "ZeroDivisionError";
		String actual = excep.getMessage();
		assertEquals(actual, expected);
	}
}
