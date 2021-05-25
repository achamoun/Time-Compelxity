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
	 * Example, to find a number in an unsorted list.
	 * 
	 * Linear time complexity O(n), where "n" is the length of the array given in
	 * parameter in this example. we are going to measure the time complexity of the
	 * algorithm by counting how many time we check the statement "if (arr[i] ==
	 * number)".
	 * 
	 * That means the proportion between the size of the input "n" and the number of
	 * executions of the statement is linear. that means the bigger n gets, the
	 * bigger gets the time complexity.
	 * 
	 * @param arr:    the array to find the number in
	 * @param number: the number to be found
	 * @return: number of the execution of the statement "if(arr[i] == number)"
	 */
	public int findNumberLinear(int[] arr, int number, int numberOfExecutedStatment) {

		for (int i = 0; i < arr.length; i++) {

			numberOfExecutedStatment++;
			if (arr[i] == number)
				break;
		}
		return numberOfExecutedStatment;
	}

	/**
	 * Example Binary search, to find a number in a sorted array.
	 * 
	 * Logarithmic time complexity. O(log"n"), where "n" is the input in the
	 * algorithm. we are going to measure the time complexity of the algorithm by
	 * the number of calls of the method. This method will be called recursively in
	 * a proportion to log"n". Which means finding a number in the sorted array
	 * given in parameters has the time complexity O(log n)
	 * 
	 * Notice the number of calls of the method increases slowly, if the size of n
	 * increases.
	 * 
	 * @param arr:    a sorted array of integers
	 * @param number: the number to be found
	 * @return: the number of the executions of the statement (calls of the method)
	 */
	public int findNumberlogarithmic(int[] arr, int number, int numberOfcalledMethods) {

		int mid = arr[arr.length / 2];
		numberOfcalledMethods++;

		if (mid == number) {
			return numberOfcalledMethods;
		} else if (number < mid) {
			return findNumberlogarithmic(splitArray(arr, 0, arr.length / 2), number, numberOfcalledMethods);
		} else {
			return findNumberlogarithmic(splitArray(arr, arr.length / 2, arr.length), number, numberOfcalledMethods);
		}
	}

	private int[] splitArray(int[] arr, int fromIndex, int toIndex) {

		int[] splitArray = new int[arr.length / 2];
		int y = 0;
		for (int i = fromIndex; i < toIndex; i++) {
			splitArray[y++] = arr[i];
		}
		return splitArray;
	}

	/**
	 * Example Bubble Sort
	 * 
	 * Algorithms with a quadratic time complexity are proportional to "n²", where
	 * "n" is the size of the input.
	 * 
	 * Nested loops are a good example of these algorithms. if we nest a loop of
	 * size n in a loop of the same size, the algorithm will run n² times.
	 * 
	 * notice that the inner loop gets smaller while "i" gets bigger in the outer
	 * loop. Which means the algorithm is a little bit faster than n². But we will
	 * consider the inner loop runs complete n times while "i" gets bigger in the
	 * outer loop. which means the algorithm has a time complexity of O(n²).
	 * 
	 * @param arr: unsorted array
	 * @return sorted array
	 */
	public int[] sortBubbleQuadratic(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			for (int y = 0; y < arr.length - i - 1; y++) {

				if (arr[y] > arr[y + 1]) {
					int bigger = arr[y];
					int smaller = arr[y + 1];
					// swap
					arr[y] = smaller;
					arr[y + 1] = bigger;
				}
			}
		}

		return arr;
	}

	/**
	 * Example finding a fibonacci number recursively. Each fibonacci number is the
	 * sum of the two previous fibonacci numbers. the fibonacci sequence
	 * 0,1,1,2,3,5,8,13,21,34... The fibonacci number with index 3 is 2.
	 * 
	 * to find a fibonacci number with a given index "n", we have to call two
	 * methods recursively to find out each fibonacci number. which means 2 power method calls.
	 * 
	 * @param index: index of the fibonacci number to be found
	 * @return the fibonacci number
	 */
	public int findFibonacciExponentialAlgorithm(int index) {

		if (index == 0) {
			return 0;
		} else if (index == 1) {
			return 1;
		} else {
			return findFibonacciExponentialAlgorithm(index - 1) + findFibonacciExponentialAlgorithm(index - 2);
		}
	}

}