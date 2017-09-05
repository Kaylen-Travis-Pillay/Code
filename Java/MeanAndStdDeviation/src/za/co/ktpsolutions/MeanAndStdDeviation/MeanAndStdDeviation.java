package za.co.ktpsolutions.MeanAndStdDeviation;

public class MeanAndStdDeviation {
	
	public static void main(String[] args){
		/*
		 * Test Case for method
		 * Array: {1, 5, 15, 84, 2, 99}
		 * Expected Mean: 34.33333
		 * Expected Standard Deviation: ~44.80923
		 */
		double[] testArray = new double[]{1, 5, 15, 84, 2, 99};
		double[] resultArray = msd(testArray, testArray.length); 
		
		System.out.println("Mean: " + resultArray[0]);
		System.out.println("Standard Deviation: " + resultArray[1]);
	}
	
	/*
	 * This method calculates the mean and standard deviation of the
	 * array 'array' with 'numberOfElements' elements. The mean and 
	 * standard deviation are returned in an array of length 2 with 
	 * the mean at index 0 and the standard deviation at index 1.
	 */
	public static double[] msd (double[] array, int numberOfElements){
		
		double[] resultArray = new double[2];
		
		//Calculating the mean
		double sumOfElements = 0;
		double mean = 0;
		
		for( int i = 0; i < numberOfElements; i++){
			sumOfElements += array[i];
		}
		mean = sumOfElements / numberOfElements;
		resultArray[0] = mean;
		
		//Calculating the standard deviation
		double sumOfDifferenceSqr = 0;
		double stdDeviation = 0;
		
		for( int j = 0; j < numberOfElements; j++){
			sumOfDifferenceSqr += Math.pow((array[j] - mean), 2);
		}
		stdDeviation = Math.sqrt((sumOfDifferenceSqr / (numberOfElements -1)));
		resultArray[1] = stdDeviation;
		
		return resultArray;
	}
}
