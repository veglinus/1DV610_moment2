package Parser;
import java.util.ArrayList;

public class Sentences {
    
    public ArrayList<Sentence> sentences = new ArrayList<Sentence>();

    Sentences(ArrayList<Sentence> sentences) {
        this.sentences = sentences;
    }
    Sentences() {}

    void add(Sentence sentence) {
        sentences.add(sentence);
    }

    ArrayList<Sentence> get() {
        return this.sentences;
    }
}
