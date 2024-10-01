package lab2;

public class Wordprocessor implements Counter {
    @Override



    public int countWords(String sentence) {
        String[] words = sentence.split("\\s+");
        return words.length;
    }

    @Override
    public int countLetters(String sentence) {
        int total = 0;
        sentence = sentence.toLowerCase(); // Ensure you assign the modified string back
        char[] characters = sentence.toCharArray();

        for (char letter : characters) {
            if (isLetter(letter)) {
                total++;
            }
        }
        return total;
    }

    @Override
    public int getLength(String sentence) {
        return sentence.length(); // You can simplify it
    }


    public boolean isLetter(char letter) {
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('a' + i);
        }

        for (char character : alphabet) {
            if (letter == character) {
                return true;
            }
        }
        return false;
    }

    protected String text = "The quick brown fox jumps over the lazy dog.";

    protected void textSetter(String input) {
        this.text = input;
    }

    protected void textGetter() {
        System.out.println("The preset text is " + this.text);
    }

}
