
public class Menu {
	/**
	 * 
	 * @param opt menu option to be checked
	 * @throws InvalidOptionException
	 */
	void displayMenuOption(int opt) throws InvalidOptionException{
		if (opt < 1 || opt > 3) {
			throw new InvalidOptionException("Invalid option selected: " + opt);
		}
		
		System.out.println("Menu option " + opt + " selected");
	}
}
