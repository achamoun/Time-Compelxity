package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import main.TimeComplexity;

public class TimeComplexityTests {

	TimeComplexity timeComplexity = new TimeComplexity();

	@Test
	void findNumberConstantComplexityTest() {

		int[] worstCaseArray1 = new int[] { 2, 4, 5, 7, 3, 1, 6, 9 };
		int[] worstCaseArray2 = new int[] { 9, 11, 13, 14, 15, 3, 7, 10, 15, 88 };

		assertEquals(7, timeComplexity.findNumberConstantComplexity(3, worstCaseArray1));
		assertEquals(14, timeComplexity.findNumberConstantComplexity(3, worstCaseArray2));
		assertNotEquals(3, timeComplexity.findNumberConstantComplexity(3, worstCaseArray1));
	}

	/**
	 * Notice the linear proportion between the expected value of each test (in
	 * worst case) with the size of the array in the test.
	 */
	@Test
	void findNumberLinearTest() {

		int[] worstCaseArray1 = new int[] { 2, 4, 5, 7, 3, 1, 6, 9 };
		int[] worstCaseArray2 = new int[] { 2, 4, 5, 7, 3, 1, 6, 9, 11, 13, 14, 15 };
		int[] worstCaseArray3 = new int[] { 2, 4, 5, 7, 3, 1, 6, 9, 11, 13, 14, 15, 77, 45, 33, 24, 56, 98, 12 };

		assertEquals(8, timeComplexity.findNumberLinear(worstCaseArray1, 9, 0));
		assertEquals(12, timeComplexity.findNumberLinear(worstCaseArray2, 15, 0));
		assertEquals(19, timeComplexity.findNumberLinear(worstCaseArray3, 12, 0));

	}

	/**
	 * Notice how the expected value in each test (in worst case) is proportional to
	 * the logarithm of the size of the array used in that test in the worst case.
	 */
	@Test
	void findNumberLogarithmicTest() {
		int[] arrLog2 = new int[] { 1, 2 };
		int[] arrLog4 = new int[] { 1, 2, 3, 4 };
		int[] arrLog8 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] arrLog16 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
		int[] arrLog32 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,
				24, 25, 26, 27, 28, 29, 30, 31, 32 };

		assertEquals(1, timeComplexity.findNumberlogarithmic(arrLog2, 2, 0));
		assertEquals(2, timeComplexity.findNumberlogarithmic(arrLog4, 4, 0));
		assertEquals(3, timeComplexity.findNumberlogarithmic(arrLog8, 8, 0));
		assertEquals(4, timeComplexity.findNumberlogarithmic(arrLog16, 16, 0));
		assertEquals(5, timeComplexity.findNumberlogarithmic(arrLog32, 32, 0));
	}

	@Test
	void sortBubbleQuadraticTest() {

		int[] arr = new int[] { 5, 4, 3, 6, 8, 2, 9, 7, 1 };
		int[] arr1 = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] arr2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, timeComplexity.sortBubbleQuadratic(arr));
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, timeComplexity.sortBubbleQuadratic(arr1));
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, timeComplexity.sortBubbleQuadratic(arr));
	}

	@Test
	void printFibonacciExponentialAlgorithmTest() {

		assertEquals(233, timeComplexity.findFibonacciExponentialAlgorithm(13));

	}
}
