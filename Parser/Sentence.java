package Parser;
import java.util.ArrayList;
import Tokenizer.Token;

// A sentence is an ArrayList of Tokens, consisting of words and a dot
public class Sentence {

    public ArrayList<Token> tokens = new ArrayList<Token>();
    public int activeToken = -1;
    
    Sentence(ArrayList<Token> t) {
        this.tokens = t;
    }

    Sentence() {}

    void add(Token t) {
        tokens.add(t);
    }

    // Kunna stega igenom WORD-objekt som meningen består av.
    public void next() {
        if (activeToken + 1 > tokens.size()) {
            throw new IndexOutOfBoundsException("Can't step forward further.");
        } else {
            activeToken++;
            printToken(activeToken);
        }
    }

    public void back() {
        if (activeToken == 0) {
            throw new IndexOutOfBoundsException("Can't step back further.");
        } else {
            activeToken--;
            printToken(activeToken);
        }
    }
    private void printToken(int i) {
        System.out.println(tokens.get(i).toString());
    }

    // Få hela meningen som en enda sträng med “rätt” avslutande tecken(.?!)
    // de enskilda orden separeras med ett enda mellanslag oavsett vilka whitespace som användes i orginaltexten.
    public String prettyPrint() {
        String prettyPrinted = "";

        for (int i = 0; i < tokens.size(); i++) {
            prettyPrinted += tokens.get(i).value;
            if (i + 2 < tokens.size()) { // Prevents adding space before last token and after
                prettyPrinted += " ";
            }
        }

        return prettyPrinted;
    }

    @Override
    public String toString() {
        String data = "";

        data += "SENTENCE(";
        for (int i = 0; i < tokens.size(); i++) {
            data += tokens.get(i).toString();
            if (i + 1 < tokens.size()) { // Prevents adding space after last token
                data += " ";
            }
        }
        data += ")";

        return data;
    }
}
