package lab2;
interface Counter {
    default int countWords(String sentence) {
        System.err.println("Error! You did not implement countWords()!!");
        return 1;
    }
    /** Counts the number of words*/
    default int countLetters(String sentence) {
        System.err.println("Error! You did not implement countLetters()!!");
        return 1;
    }
    /** Counts the number of letters*/
    default int getLength(String sentence) {
        System.err.println("Error! You did not implement getLength()!!");
        return 1;
    }    
    /** Counts the length*/

}