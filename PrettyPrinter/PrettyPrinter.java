package PrettyPrinter;
import Parser.*;

public class PrettyPrinter {
    Document document;

    public PrettyPrinter(Document d) {
        this.document = d;
    }

    public static String red = "\u001B[31m";
    public static String reset = "\u001B[0m";
    public static String italic = "\033[3m";
    public static String bold = "\033[0;1m";
    /*
    Skapa sedan en tredje modul som listar innehållet i ett dokument med formatering. Ni väljer själva hur detta sker. Ex HTML+CSS, Console
    Meningsindex-numrering
    Olika färger eller format för frågor, utrop och “vanliga meningar”. Så att det syns tydlig skillnad mellan olika typer.
    Exempelvis skulle utrop kunna vara fetmarkerade!
    Frågor kanske är röda?
    Vanliga meningar är kursiva.
    */

    public void print() {
        Sentences sentences = document.getSentences();

        for (int i = 0; i < sentences.sentences.size(); i++) {
            Sentence current = sentences.sentences.get(i);
            String prefix = "";

            if (current.tokens.get(current.tokens.size() - 1).type == "DOT") {
                prefix = italic;
            } else if (current.tokens.get(current.tokens.size() - 1).type == "EXCLAMATION") {
                prefix = bold;
            } else if (current.tokens.get(current.tokens.size() - 1).type == "QUESTION") {
                prefix = red;
            }

            System.out.println("[" + i + "] " + prefix + current.prettyPrint() + reset);
        }
    }
}
