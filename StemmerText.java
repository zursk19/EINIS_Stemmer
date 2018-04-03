package stemmer;

public class StemmerText {

    String input;
    String words[];

    public StemmerText (String input) {
        this.input = input;
        stripChars();
        words = getWords();
    }

    //Strip characters that are not important to our Stemmer
    private void stripChars() {
        input = input.replaceAll("[^a-zA-Z]*[^a-zA-Z]", " ");
    }

    // Takes a string and returns a String array of words (based on spaces)
    public String[] getWords () {
        return input.split(" ");
    }

    private void changeWords () {

        for (String word : words) {
            StemmerWord newWord = new StemmerWord(word);
        }
    }

    // Use this method for testing purposes
    public void test () {
        System.out.println(words.length);
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
