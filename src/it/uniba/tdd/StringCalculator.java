package it.uniba.tdd;

public class StringCalculator {
	public int add(String numbersStr) {
		int result;

		if (hasTwoNumbers(numbersStr)) {
			result = getSum(numbersStr.split(","));
		} else if (numbersStr.equals("")) {
			result = 0;
		} else {
			result = Integer.parseInt(numbersStr);
		}

		return result;
	}

	private boolean hasTwoNumbers(String numbersStr) {
		boolean result = false;
		String[] numbers = numbersStr.split(",");

		if (numbers.length == 2) {
			result = true;
		}

		return result;
	}

	private int getSum(String[] numbers) {
		return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
	}
}