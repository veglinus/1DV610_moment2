package Parser;
import java.util.ArrayList;
import Tokenizer.Token;

// A sentence is an ArrayList of Tokens, consisting of words and a dot

// TODO: Kunna stega igenom WORD-objekt som meningen består av.
// TODO: Få hela meningen som en enda sträng med “rätt” avslutande tecken(.?!)
// de enskilda orden separeras med ett enda mellanslag oavsett vilka whitespace som användes i orginaltexten.
public class Sentence {

    ArrayList<Token> tokens = new ArrayList<Token>();
    
    Sentence(ArrayList<Token> t) {
        this.tokens = t;

        // TODO: Implement checking of token type, to only allow word or dot
    }

    Sentence() {}

    void add(Token t) {
        tokens.add(t);
    }

    @Override
    public String toString() {
        String data = "";

        data += "SENTENCE(";
        //System.out.println("Size is: " + tokens.size());
        for (int i = 0; i < tokens.size(); i++) {
            data += tokens.get(i).toString();
            //System.out.println(tokens.get(i).toString());
            if (i + 1 < tokens.size()) {
                data += " ";
            }
        }
        data += ")";

        return data;
    }
}
