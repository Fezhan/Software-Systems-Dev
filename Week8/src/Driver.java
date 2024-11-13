public class Driver {
	
	/**
	 * Tests the classes
	 * @param args
	 */
    public static void main(String[] args) {
        // Create an instance of EmailStore
        EmailStore emailStore = new EmailStore();

        // Test the addEmail method
        System.out.println("Adding emails...");
        System.out.println("Adding 'test@example.com': " + emailStore.addEmail("test@example.com")); // Expected: true
        System.out.println("Adding 'user@example.com': " + emailStore.addEmail("user@example.com")); // Expected: true
        System.out.println("Adding 'test@example.com' again: " + emailStore.addEmail("test@example.com")); // Expected: false

        // Test the hasEmail method
        System.out.println("\nChecking if emails exist...");
        System.out.println("Checking 'test@example.com': " + emailStore.hasEmail("test@example.com")); // Expected: true
        System.out.println("Checking 'notfound@example.com': " + emailStore.hasEmail("notfound@example.com")); // Expected: false

        // Display all emails in the set
        System.out.println("\nDisplaying all emails:");
        emailStore.displayEmails();
        
        System.out.println("\n");
        
        WordCounter wc = new WordCounter();
        
        wc.addSentence("This sentence has the word has in it twice");
        wc.addSentence("The quick brown fox jumps over the lazy dog");
        
        wc.outputResults();
    }
}

