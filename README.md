# 1DV610_moment2 Parser & PrettyPrinter

## Parser

The parser parses a document and then holds sentences.
Create a new document:
```Document d = new Document();```

Then use parse on an input:
```d.parse("Hello world. I am Linus! How are you?");```

Now you can use a number of functions to get the sentences from the document, such as:
```Sentences sentences = d.getSentences();```
which you then can iterate over to print every sentence.

You can also get sentences ending with dot, exclamation or questionmark. Or an ArrayList containing every sentence:
```
Sentences sentences1 = d.getEndsWithDot();
Sentences sentences2 = d.getEndsWithExclamation();
Sentences sentences3 = d.getEndsWithQuestion();
ArrayList<Sentence> list = d.getSentencesList();
```

Or, pass the document into the pretty printer to print it nicely in the console:
```PrettyPrinter p = new PrettyPrinter(d);```
