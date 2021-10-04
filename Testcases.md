# Tester

| Namn | Testfall              | Indata                |  Förväntat resultat | PASS/FAIL |
|------|-----------------------|-----------------------|---------------------|-----------|
|TC1| Hittar varje mening   | "a. b."  |  getSentences() ger två objekt ifrån sig | PASS |
|TC2| Korrekt antal ord senare mening  | "a! b c?"  | två WORD objekt i andra meningen | PASS |
|TC3| Mening ett är ett utrop   | "a!"  |  Första meningen är av typen EXCLAMATION. | PASS |
|TC4| Senare ord har rätt bokstäver   | "a bc."  |  andra ordet i första meningen är "bc" | PASS |
|TC5| PrettyPrint styliserar | "a? b! c." | Punkt ger italic, exclamation bold och fråga röd text. | PASS |
|TC6| Hittar varje mening | "Hello world. I am Linus! How are you?" | 3 meningar, styling korrekt | PASS |
|TC7| Stega igenom ord | "Hello world." [>>>] | DOT() | PASS |
|TC8| Stega igenom ord | "Hello world." [>>><<] | Word(Hello) | PASS |
|TC9| Stega igenom ord | "Hello" [<] | Exception | PASS |
