import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Parser.*;

public class Tests {
    
    Document d = new Document();

    @Test
    public void TC1() {
        d.parse("a. b.");
        Assertions.assertEquals(2, d.getSentencesList().size());
    }

    @Test
    public void TC2() {
        d.parse("a! b c?");
        var second = d.getSentencesList().get(1);
        Assertions.assertEquals("WORD(b)", second.tokens.get(0).toString());
        Assertions.assertEquals("WORD(c)", second.tokens.get(1).toString());
    }

    @Test
    public void TC3() {
        d.parse("a!");
        Sentences sentences = d.getEndsWithExclamation();
        Assertions.assertEquals("SENTENCE(WORD(a) EXCLAMATION(!))", sentences.sentences.get(0).toString());
    }

    @Test
    public void TC4() {
        d.parse("a bc.");
        String expected = "WORD(bc)";
        Assertions.assertEquals(expected, d.getSentencesList().get(0).tokens.get(1).toString());
    }

    // TC5 and TC6 were checked manually

    @Test
    public void TC7() {
        d.parse("Hello world.");
        Sentence c = d.getSentencesList().get(0);
        c.next();
        c.next();
        c.next();
        Assertions.assertEquals("DOT(.)", c.tokens.get(c.activeToken).toString());
    }

    @Test
    public void TC8() {
        d.parse("Hello world.");
        Sentence c = d.getSentencesList().get(0);
        c.next();
        c.next();
        c.next();
        c.back();
        c.back();
        Assertions.assertEquals("WORD(Hello)", c.tokens.get(c.activeToken).toString());
    }

    @Test
    public void TC9() {
        d.parse("Hello world.");
        Sentence c = d.getSentencesList().get(0);
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            c.back();
        });
    }
}
