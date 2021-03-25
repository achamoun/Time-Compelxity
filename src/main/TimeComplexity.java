package main;

public class TimeComplexity {

	/**
	 * Linear time complexity O(n), where "n" is the length of arr. 
	 * 
	 * @param arr: the array to find the number in
	 * @param number: the number to be found
	 * @return: number of the execution of the statement "arr[i] == number"
	 */
	public int findNumber(int[] arr, int number) {

		int numberOfExcutedStatments = 0;

		for (int i = 0; i < arr.length; i++) {

			numberOfExcutedStatments++;
			if (arr[i] == number)
				break;
		}
		return numberOfExcutedStatments;
	}
}