package it.uniba.tdd.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import it.uniba.tdd.StringCalculator;

public class StringCalculatorTest {

	@Test
	public void addWillReturnZero() {
		StringCalculator stringCalculator = new StringCalculator();

		assertEquals(stringCalculator.add(""), 0);
	}

	@Test
	public void addWillReturnOne() {
		StringCalculator calculator = new StringCalculator();

		assertEquals(calculator.add("1"), 1);
	}

	@Test
	public void addWillReturnTwo() {
		StringCalculator stringCalculator = new StringCalculator();

		assertEquals(stringCalculator.add("2"), 2);
	}

	@Test
	public void addWillReturnThree() {
		StringCalculator stringCalculator = new StringCalculator();

		assertEquals(stringCalculator.add("3"), 3);
	}

	@Test
	public void addAcceptsTwoNumbers() {
		StringCalculator stringCalculator = new StringCalculator();

		assertEquals(stringCalculator.add("0,1"), 1);
	}

	@Test
	public void addWillReturnTwoWithTwoNumbers() {
		StringCalculator calculator = new StringCalculator();

		assertEquals(calculator.add("1,1"), 2);
	}

	@Test
	public void addWillReturnThreeWithTwoNumbers() {
		StringCalculator calculator = new StringCalculator();

		assertEquals(calculator.add("1,2"), 3);
	}

	@Test
	public void addWillReturnFourWithTwoNumbers() {
		StringCalculator calculator = new StringCalculator();

		assertEquals(calculator.add("2,2"), 4);
	}

	@Test
	public void addCanAcceptCanHandleNewLineBetweenNumbers() {
		StringCalculator calculator = new StringCalculator();

		assertEquals(calculator.add("1\n2"), 3);
	}

	@Test
	public void addCanAcceptCanHandleNewLineBetweenNumbers2() {
		StringCalculator calculator = new StringCalculator();

		assertEquals(calculator.add("2\n2"), 4);
	}
}
