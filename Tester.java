import Parser.*;
import Tokenizer.*;

public class Tester {
    public static void main(String[] args) {
        Grammar WordAndDotGrammar = new Grammar();
        WordAndDotGrammar.add(new TokenType("WORD", "[A-ZÅÄÖa-zåäö]+"));
        WordAndDotGrammar.add(new TokenType("DOT", "[.]")); 
        Tokenizer t = new Tokenizer(WordAndDotGrammar, "Hello world. I am Linus.");


        Parser p = new Parser();
        Sentences sentences = p.parse(t);


        for (Sentence currentSentence : sentences.sentences) {
            System.out.println(currentSentence.toString());;
        }        
    }
}
