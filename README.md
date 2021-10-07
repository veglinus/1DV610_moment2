# 1DV610_moment2 Parser

Parser för tokenizer i 1DV610_moment1

Logik:

Sentence = Word + Dot
Sentences = Flera sentences eller noll(om det inte finns några meningar)
Document = Sentences END

Exempel:
DOCUMENT
    SENTENCES
        SENTENCE (WORD(“I”), WORD(“love”), WORD(“parsers”), DOT(“.”))
        SENTENCE (WORD(“They”), WORD(“are”), WORD(“fun”), DOT(“.”))
END


TODO:
Verifiera så document stämmer (har end, inget kommer efter)
Sentence faktiskt har en ändelse som punkt, utrop- eller frågetecken