import java.util.Arrays;


public class Stats {
	
	/**
	 * An array that stores the list of numeric values
	 */
	protected int[] numbers;
	
	/**
	 * The total number of values in the numbers array
	 */
	protected int count;

	/**
	 * Adds a value to the array
	 * 
	 * @param value the value to be added
	 */
	public void addValue(int value) {
		numbers[count] = value;
		count++;
	}
	
	/**
	 * Gets the number of values in the array
	 * 
	 * @return the number of stored values
	 */
	public int getCount() {
		return numbers.length;
	}
	
	/**
	 * Finds the maximum value
	 * 
	 * @return the maximum value
	 */
	public int getMax() {
		int max = numbers[0];	
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}

		return max;
	}
	
	/**
	 * Finds the minimum value
	 * 
	 * @return the minimum value
	 */
	public int getMin() {int min = numbers[0]; 

	for (int i = 1; i < numbers.length; i++) {

		if (numbers[i] < min) {
			min = numbers[i];
			}
		}
	
	return min;
	
	}
	
	/**
	 * Finds the total of all the values
	 * 
	 * @return the sum of the values
	 */
	public int getTotal() {
		
		int total = 0;
		
		// total all values within the array
		for (int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}		return total;
	}
	
	/**
	 * Finds the average of the values
	 * 
	 * @return the average of the values
	 */
	public double getAverage() {
		
		int x = 0;
		for (int i = 0; i < numbers.length; i++) {
			x += numbers[i];
		}
		
		double y = x/(double)numbers.length;
		
		return y;
	}

	@Override
	public String toString() {return Arrays.toString(numbers);
	}
	
	/**
	 * Constructor for Stats
	 * 
	 * @param totalValues the max number of values allowed
	 */
	public Stats(int totalValues) {
		numbers = new int[totalValues];
	}
	
	
	
	
	
	
}