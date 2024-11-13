import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Maps words to their occurrence count.
 */
public class WordCounter {
	private final Map<String, Integer> wordMap = new HashMap<String, Integer>();
	
	/**
	 * Adds a word and its occurence number to the HashMap
	 * @param word value to add
	 */
	public void addWord(String word) {
		if (this.wordMap.containsKey(word)) {
			this.wordMap.put(word, this.wordMap.get(word) + 1);
		} else {
			this.wordMap.put(word, 1);
		}
	}
	
	/**
	 * Adds a sentence to the HashSet recursively
	 * @param sentence
	 */
	public void addSentence(String sentence) {
		String[] temp = sentence.split("\\s+");
		
		for (String word: temp) {
			this.addWord(word.toLowerCase());
		}
	}
	
	/**
	 * Outputs the results to the console.
	 */
	public void outputResults() {
		for (Entry<String, Integer> results : this.wordMap.entrySet()) {
			String word = results.getKey();
			Integer number = results.getValue();
			
			System.out.println(word + " : " + number);
		}
	}
}
