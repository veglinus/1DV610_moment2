import Parser.*;
import PrettyPrinter.PrettyPrinter;

public class Example {
    public static void main(String[] args) {

        Document d = new Document();
        d.parse("Hello world. I am Linus! How are you?");
        
        Sentences sentences = d.getSentences();

        System.out.println(sentences.toString());
        
        //PrettyPrinter p = new PrettyPrinter(d);
        
        /*
        for (Sentence currentSentence : sentences.sentences) {
            System.out.println(currentSentence.toString());;
        } */   




        
    }
}
