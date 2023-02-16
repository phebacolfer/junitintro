import java.lang.reflect.Array;

public class Find_Large_Small {
	public static int[] getResults(int[] inputArray) {
		int[] outputResults = new int[2];
		outputResults[0]=0;
		outputResults[1]=0;
		int largest = 0;
		int smallest = 0;
		int tempLarge;
		int tempSmall;
		if (inputArray.length%2==0) {
			int firstInt = inputArray[0];
			int secInt = inputArray[1];
			if(firstInt>=secInt) {
				largest=firstInt;
				smallest=secInt;
			}
			else {
				largest=secInt;
				smallest=firstInt;
			}
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
		outputResults[0]=largest;
		outputResults[1]=smallest;
		return outputResults;
	}
}