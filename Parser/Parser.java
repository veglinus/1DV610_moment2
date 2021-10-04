package Parser;
import Tokenizer.*;

public class Parser {

    public Sentences parse(Tokenizer t) {
        var endNotReached = true;

        Sentences sentences = new Sentences();
        Sentence currentData = new Sentence();

        do {
            Token token = t.next();
            currentData.add(token);

            if (token.type == "DOT") {
                // Add currentData to a SENTENCES object as a SENTENCE and clear currentData
                sentences.add(currentData);
                currentData = new Sentence(); // Clear currentData
            }

            if (token.type == "END") {
                endNotReached = false;
            }
        } while (endNotReached);

        return sentences;
    }

    
}
