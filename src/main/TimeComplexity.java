package main;

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
	 * the number of executions of the statement "arr[i] == number" gets bigger also
	 * by 1.
	 * 
	 * @param arr:    the array to find the number in
	 * @param number: the number to be found
	 * @return: number of the execution of the statement "arr[i] == number"
	 */
	public int findNumber(int[] arr, int number) {

		int numberOfExecutedStatments = 0;

		for (int i = 0; i < arr.length; i++) {

			numberOfExecutedStatments++;
			if (arr[i] == number)
				break;
		}
		return numberOfExecutedStatments;
	}
}