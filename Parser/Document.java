package Parser;
import Tokenizer.*;

public class Document {
    Sentences sentences;
    Tokenizer tokenizer;
    Grammar WordAndDotGrammar = new Grammar();

    public Document() {
        WordAndDotGrammar.add(new TokenType("WORD", "[A-ZÅÄÖa-zåäö]+"));
        WordAndDotGrammar.add(new TokenType("DOT", "[.]")); 
        WordAndDotGrammar.add(new TokenType("EXCLAMATION", "[!]")); 
        WordAndDotGrammar.add(new TokenType("QUESTION", "[?]")); 
    }

    public void parse(String input) {
        this.tokenizer = new Tokenizer(WordAndDotGrammar, input);
        var endNotReached = true;

        Sentences sentences = new Sentences();
        Sentence currentData = new Sentence();

        do {
            Token token = tokenizer.next();
            currentData.add(token);

            if (token.type == "DOT" || token.type == "EXCLAMATION" || token.type == "QUESTION") {
                // Add currentData to a SENTENCES object as a SENTENCE and clear currentData
                sentences.add(currentData);
                currentData = new Sentence(); // Clear currentData
            }

            if (token.type == "END") {
                endNotReached = false;
            }

        } while (endNotReached);

        this.sentences = sentences;
    }

    // TODO: Vi kan be om samtliga meningar oavsett typ. Vi får dem i samma följd som dokumentet 
    public Sentences getSentences() {
        return sentences;
    }

    // TODO: Vi kan be om alla vanliga meningar (som avslutas med punkt).
    // TODO: Vi kan be om alla frågor (som avslutas med frågetecken).
    // TODO: Vi kan be om alla utrop (som avslutas med utropstecken).
}
