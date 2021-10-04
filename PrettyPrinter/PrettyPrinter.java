package PrettyPrinter;
import Parser.*;
import Tokenizer.Token;

public class PrettyPrinter {
    Document document;

    public PrettyPrinter(Document d) {
        this.document = d;
        print();
    }

    public static String red = "\u001B[31m";
    public static String reset = "\u001B[0m";
    public static String italic = "\033[3m";
    public static String bold = "\033[0;1m";

    public void print() {
        Sentences sentences = document.getSentences();

        for (int i = 0; i < sentences.sentences.size(); i++) {
            Sentence current = sentences.sentences.get(i);
            Token lastToken = current.tokens.get(current.tokens.size() - 1);

            String prefix = stylePrefix(lastToken);
            System.out.println("[" + i + "] " + prefix + current.prettyPrint() + reset);
        }
    }

    private String stylePrefix(Token lastToken) {
        String prefix = "";
        if (lastToken.type == "DOT") {
            prefix = italic;
        } else if (lastToken.type == "EXCLAMATION") {
            prefix = bold;
        } else if (lastToken.type == "QUESTION") {
            prefix = red;
        }
        return prefix;
    }
}
