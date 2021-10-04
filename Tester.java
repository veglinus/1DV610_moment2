import Parser.*;

public class Tester {
    public static void main(String[] args) {

        Document d = new Document();
        d.parse("Hello world. I am Linus!");
        Sentences sentences = d.getSentences();

        for (Sentence currentSentence : sentences.sentences) {
            System.out.println(currentSentence.toString());;
        }        
    }
}
