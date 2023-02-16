public class Find_Large_Small {
	public static int[] getResults(int[] inputArray) {
		//output of the program; the largest will be the first int returned, smallest is the second
		int[] outputResults = new int[2];
		//initialize the biggest and smallest as 0
		outputResults[0]=0;
		outputResults[1]=0;
		int largest = 0;
		int smallest = 0;
		//temp variables for comparing next pair of ints
		int tempLarge;
		int tempSmall;
		//if the int array is even, begin the process by comparing the first two ints
		if (inputArray.length%2==0) { 
			int firstInt = inputArray[0];
			int secInt = inputArray[1];
			//make the larger one the current largest and the smaller the current smallest
			if(firstInt>=secInt) {
				largest=firstInt;
				smallest=secInt;
			}
			else {
				largest=secInt;
				smallest=firstInt;
			}
			//iterate through the array and compare each pair to the current high and low of the array
			for(int i=2; i<inputArray.length; i+=2) {
				if(inputArray[i]>=inputArray[i+1]) {
					tempLarge=inputArray[i];
					tempSmall=inputArray[i+1];
				}
				else{
					tempLarge=inputArray[i+1];
					tempSmall=inputArray[i];
				}
				if(tempLarge>largest) {
					largest=tempLarge;
				}
				if(tempSmall<smallest) {
					smallest=tempSmall;
				}
			}
		}
		//if the input array is odd, do the same things but make the current highest and lowest the
		//first value and iterate through pairs starting at array[1]
		else {
			int firstInt = inputArray[0];
			int secInt = inputArray[0];
			largest=firstInt;
			smallest=secInt;
			for(int i=1; i<inputArray.length; i+=2) {
				if(inputArray[i]>=inputArray[i+1]) {
					tempLarge=inputArray[i];
					tempSmall=inputArray[i+1];
				}
				else{
					tempLarge=inputArray[i+1];
					tempSmall=inputArray[i];
				}
				if(tempLarge>largest) {
					largest=tempLarge;
				}
				if(tempSmall<smallest) {
					smallest=tempSmall;
				}
			}
		}
		//put the largest int into the first value of the output array and the smallest second
		outputResults[0]=largest;
		outputResults[1]=smallest;
		return outputResults;
	}
}