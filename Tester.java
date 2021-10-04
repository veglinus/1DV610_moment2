import Parser.*;
import PrettyPrinter.PrettyPrinter;

public class Tester {
    public static void main(String[] args) {

        Document d = new Document();
        d.parse("Hello world. I am Linus! How are you?");
        PrettyPrinter p = new PrettyPrinter(d);
        p.print();
        /*
        for (Sentence currentSentence : sentences.sentences) {
            System.out.println(currentSentence.toString());;
        } */       
    }
}
