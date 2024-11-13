import java.util.HashSet;
import java.util.Set;

public class EmailStore {
	private Set<String> emailAddresses = new HashSet<String>();
	
	
	/**
	 * Add an email address to the emailAddresses HashSet
	 * @param email - the email to add
	 * @return false if the email is already present and true if it gets added
	 */
	public boolean addEmail(String email) {
		
		if (this.emailAddresses.contains(email)) {
			return false;
		}
		
		this.emailAddresses.add(email);
		return true;
	}
	
	/**
	 * Checks if an email address exists in the emailAddresses HashSet
	 * @param email - the email address to check
	 * @return true if it is in the set and false if not
	 */
	public boolean hasEmail(String email) {
		
		if (this.emailAddresses.contains(email)) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Print all emails in the emailAddresses HashSet to the console
	 */
	public void displayEmails() {
		
		System.out.println("Email addresses in the set:");
		for (String email: this.emailAddresses) {
			System.out.println(email);
		}
	}
}
