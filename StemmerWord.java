package stemmer;

public class StemmerWord {

    String word;

    public StemmerWord (String word) {
        this.word = stemWord(word);
    }

    // Gets word at current instance
    public String getWord() {
        return word;
    }

    // Starts the conversion process
    protected void convert () {
        word = stemWord(word);
    }

    private String stemWord (String word) {
        return "ThisIsATestStemmedWord";
    }
}
