
public class Driver {
	/**
	 * Driver class to test the ArrayProcessor and Menu classes
	 * @param args
	 * @throws InvalidOptionException
	 */
	public static void main(String[] args) throws InvalidOptionException {
		ArrayProcessor ap = new ArrayProcessor();
		
		int len = ap.getArrayLength(new String[] {"one", "two", "three"});
		System.out.println("Array length is " + len);
		
		
		Menu menu = new Menu();
		
		int[] options = {1,2,3,4};
		
		try {
			for (int option: options) {
				menu.displayMenuOption(option);
			}
		} catch (InvalidOptionException e) {
			System.err.println(e.getMessage());
		}
	}

}
