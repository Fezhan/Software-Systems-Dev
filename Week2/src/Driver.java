package lab2;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter whatever your heart desires... ");
        String sentence = scanner.nextLine();

        Wordprocessor processor = new Wordprocessor();

        if (sentence.isEmpty()) {
            System.out.println("\n");
            processor.textGetter();
            System.out.println("\nNo. of words: " + processor.countWords(processor.text));
            System.out.println("No. of letters: " + processor.countLetters(processor.text));
            System.out.println("Length: " + processor.getLength(processor.text));
            System.exit(0);
        }

        System.out.println("No. of words: " + processor.countWords(sentence));
        System.out.println("No. of letters: " + processor.countLetters(sentence));
        System.out.println("Length: " + processor.getLength(sentence));

        scanner.close();
    }
}
