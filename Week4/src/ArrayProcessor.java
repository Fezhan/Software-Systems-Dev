
public class ArrayProcessor {
	/**
	 * 
	 * @param a name of the array that gets checked
	 * @return returns the number of items in the object
	 */
	int getArrayLength(Object[] a) {
		int count = 0;
		try {
			while(true) {
				@SuppressWarnings("unused")
				Object t = a[count];
				count++;
			}
		} catch (Exception e) {}
		
		return count;
	}
}
