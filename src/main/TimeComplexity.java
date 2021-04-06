package main;

import java.util.Arrays;

/**
 * 
 * @author aboud
 * 
 *         Examples of the time complexity of algorithms. The time complexity of
 *         algorithms is measured by the number of times statements are being
 *         executed in the algorithm, not by the time the algorithm takes to end
 *         the execution.
 * 
 *         Big O notation is used to describe the time complexity of an
 *         algorithm. it describes the relationship between "n", the input into
 *         the algorithm, and the number of executions of statements in that
 *         algorithm. an algorithm might consist of one or more statements.
 */
public class TimeComplexity {

	/**
	 * Linear time complexity O(n), where "n" is the length of the array given in
	 * parameter in this example.
	 * 
	 * That means the proportion between the size of the input "n" and the number of
	 * executions of the statement is linear. that means if "n" gets bigger by 1,
	 * the number of executions of the statement "if(arr[i] == number)" gets bigger
	 * also by 1.
	 * 
	 * @param arr:    the array to find the number in
	 * @param number: the number to be found
	 * @return: number of the execution of the statement "if(arr[i] == number)"
	 */
	public int findNumber(int[] arr, int number, int numberOfExecutedStatment) {

		for (int i = 0; i < arr.length; i++) {

			numberOfExecutedStatment++;
			if (arr[i] == number)
				break;
		}
		return numberOfExecutedStatment;
	}

	/**
	 * Logarithmic time complexity. O(log"n"), where "n" is the input in the
	 * algorithm. The time complexity of this algorithm increases slowly, while the
	 * input increases fast. the number of the executions of the statement "if (mid
	 * == number)" is proportional to the logarithm of the size of "n".
	 * 
	 * Example, to find a number in a sorted array.
	 * 
	 * @param arr:    a sorted array of integers
	 * @param number: the number to be found
	 * @return: the number of the executions of the statement "if (mid == number)"
	 */
	public int findNumberLogarithmically(int[] arr, int number, int numberOfExecutedStatment) {

		int mid = arr[arr.length / 2];
		numberOfExecutedStatment++;
		if (mid == number) {
			return numberOfExecutedStatment;
		}

		if (number < mid) {

			int[] firstHalfArray = new int[arr.length / 2];
			for (int i = 0; i < arr.length / 2; i++) {
				firstHalfArray[i] = arr[i];
			}
			return findNumberLogarithmically(firstHalfArray, number, numberOfExecutedStatment);

		} else {
			int[] secondHalfArray = new int[arr.length / 2];
			for (int i = arr.length / 2; i < arr.length; i++) {
				secondHalfArray[i - (arr.length / 2)] = arr[i];
			}
			return findNumberLogarithmically(secondHalfArray, number, numberOfExecutedStatment);
		}
	}
}