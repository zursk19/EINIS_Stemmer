package stemmer;

public class StemmerText {

    String input;
    String wordStringArray[];
    StemmerWord stemmedWords[];

    public StemmerText (String input) {
        this.input = input;
        stripChars();
        wordStringArray = getWordStringArray();
        stemmedWords = new StemmerWord[wordStringArray.length];
        convertToStemmerWord();
    }

    // Strip characters that are not important to our Stemmer
    private void stripChars() {
        input = input.replaceAll("[^a-zA-Z]*[^a-zA-Z]", " ");
    }

    // Takes a string and returns a String array of words (based on spaces)
    public String[] getWordStringArray () {
        return input.split(" ");
    }

    // Takes word array and converts it into StemmerWord array
    private void convertToStemmerWord () {
        for (int i = 0; i < wordStringArray.length; i++) { stemmedWords[i] = new StemmerWord(wordStringArray[i]);
        }
    }

    // Get StemmerWords array
    public StemmerWord[] getStemmerWords(){
        return stemmedWords;
    }

    // Calls for StemmerWord array to become converted in that class. Replaces existing array set
    private void stemWords () {
        for (StemmerWord word : stemmedWords) {
            word.convert();
        }
    }

    // Use this method for testing purposes
    public void test () {
        //System.out.println(words.length);
        //for (int i = 0; i < words.length; i++) {
        //    System.out.println(words[i].getWord());
        //}
    }
}
