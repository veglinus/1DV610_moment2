package Parser;
import java.util.ArrayList;

import Tokenizer.*;

public class Document {
    public Sentences sentences;
    Tokenizer tokenizer;
    Grammar WordAndDotGrammar = new Grammar();

    public Document() {
        WordAndDotGrammar.add(new TokenType("WORD", "[A-ZÅÄÖa-zåäö]+"));
        WordAndDotGrammar.add(new TokenType("DOT", "[.]")); 
        WordAndDotGrammar.add(new TokenType("EXCLAMATION", "[!]")); 
        WordAndDotGrammar.add(new TokenType("QUESTION", "[?]")); 
    }

    public void parse(String input) {
        try {
            this.tokenizer = new Tokenizer(WordAndDotGrammar, input);
            var endNotReached = true;

            Sentences sentences = new Sentences();
            Sentence currentData = new Sentence();

            do {
                Token token = tokenizer.getActiveToken();
                currentData.add(token);

                if (token.type == "DOT" || token.type == "EXCLAMATION" || token.type == "QUESTION") {
                    // Add currentData to a SENTENCES object as a SENTENCE and clear currentData
                    sentences.add(currentData);
                    currentData = new Sentence(); // Clear currentData
                }

                if (token.type == "END") {
                    endNotReached = false;
                }

                tokenizer.next();

            } while (endNotReached);

            this.sentences = sentences;
        } catch (Exception e) {
            throw new RuntimeException("Could not parse input: " + e);
        }
    }

    public ArrayList<Sentence> getSentencesList() {
        return sentences.sentences;
    }

    public Sentences getEndsWithDot() {
        return getSentencesEndingWith("DOT");
    }

    public Sentences getEndsWithExclamation() {
        return getSentencesEndingWith("EXCLAMATION");
    }

    public Sentences getEndsWithQuestion() {
        return getSentencesEndingWith("QUESTION");
    }

    private Sentences getSentencesEndingWith(String ending) {
        try {
            Sentences sentencesWithoutDot = new Sentences();
            ArrayList<Sentence> sentences = getSentencesList();
            for (int i = 0; i < sentences.size(); i++) {
                Sentence current = sentences.get(i);
                
                if (current.tokens.get(current.tokens.size() - 1).type == ending) {
                    sentencesWithoutDot.add(current);
                }
                
            }
            return sentencesWithoutDot;
        } catch (Exception e) {
            throw new RuntimeException("Couldn't get sentences ending with " + ending + ": " + e);
        }

    }
}
