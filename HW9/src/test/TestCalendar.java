package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import main.Calendar;

class TestCalendar {

	@ParameterizedTest
	@ValueSource(ints = {1904, 1972})
	public void Should_return_true(int year) {
		Calendar test = new Calendar(year);
		Assertions.assertTrue(test.isLeapYear());
	}


	@ParameterizedTest
	@ValueSource(ints = {1971, 1973})
	public void Should_return_false(int year) {
		Calendar test = new Calendar(year);
		Assertions.assertFalse(test.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints = {	1904,	1908,	1912,	1916,	1920,	1924,	1928,	1932,	1936,
			1940,	1944,	1948,	1952,	1956,	1960,	1964,	1968,	1972,	1976,
			1980,	1984,	1988,	1992,	1996})
	public void Should_return_if_year_is_leap(int year) {
		Calendar test = new Calendar(year);
		boolean expected = true;
		boolean actual = test.isLeapYear();
		Assertions.assertEquals(expected, actual);
	}
}
