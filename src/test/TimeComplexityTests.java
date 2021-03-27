package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import main.TimeComplexity;

public class TimeComplexityTests {

	TimeComplexity timeComplexity = new TimeComplexity();

	@Test
	void findNumber() {
		int[] worstCaseArray = new int[] { 2, 4, 5, 7, 3, 1, 6, 9 };
		int[] bestCaseArray = new int[] { 9, 4, 5, 7, 3, 1, 6, 2 };

		assertEquals(8, timeComplexity.findNumber(worstCaseArray, 9));
		assertEquals(1, timeComplexity.findNumber(bestCaseArray, 9));

	}
}
