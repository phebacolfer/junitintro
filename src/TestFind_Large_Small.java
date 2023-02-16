import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestFind_Large_Small {

@Test
	void testSorted() {
	int[] outputArray = {4,1};
	int[] inputArray = new int[]{1,2,3,4};
	Find_Large_Small defaultArray = new Find_Large_Small();
	int[] results = defaultArray.getResults(inputArray);
	Assert.assertArrayEquals(outputArray, results);
	} 

@Test
void testReverseSorted() {
	int[] outputArray = {4,1};
	int[] inputArray = new int[] {4,3,2,1};
	Find_Large_Small defaultArray = new Find_Large_Small();
	int[] results = defaultArray.getResults(inputArray);
	Assert.assertArrayEquals(outputArray, results);
	}

@Test
void testUnSorted() {
	int[] outputArray = {6,0};
	int[] inputArray = new int[]{2,5,6,4,3,0,4,5,6,3,1,1,1,2,5};
	Find_Large_Small defaultArray = new Find_Large_Small();
	int[] results = defaultArray.getResults(inputArray);
	Assert.assertArrayEquals(outputArray, results);
	}

@Test
void testSameNums() {
	int[] outputArray = {1,1};
	int[] inputArray = new int[]{1,1,1,1};
	Find_Large_Small defaultArray = new Find_Large_Small();
	int[] results = defaultArray.getResults(inputArray);
	Assert.assertArrayEquals(outputArray, results);
	}

@Test
void testTwoNums() {
	int[] outputArray = {3,1};
	int[] inputArray = new int[]{1,3};
	Find_Large_Small defaultArray = new Find_Large_Small();
	int[] results = defaultArray.getResults(inputArray);
	Assert.assertArrayEquals(outputArray, results);
	}
}
