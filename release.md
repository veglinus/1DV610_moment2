# Mall för inlämning laboration 1, 1dv610

## Checklista
  - [x] Jag har skrivit all kod och reflektioner själv. Jag har inte använt mig av andras kod för att lösa uppgiften.
  - [x] Mina testresultat är skrivna utifrån utförd testning ( och inte teoretiskt, "det bör fungera" :) )
  - [x] De enda statiska metoder eller funktioner utanför klasser som jag har är för att starta upp min testapplikation ex main(java).
  - [x] De enda bibliotek och färdiga klasser som används är sådana som måste användas (eller som används för att testa modulen).

## Egenskattning och mål
  - [ ] Jag är inte klar eftersom jag vet att jag saknar något. Då skall du inte lämna in!
  - [x] Jag eftersträvar med denna inlämning godkänt betyg (E-D)
    - [x] De flesta testfall fungerar (enstaka testfall kan misslyckas, tydligt vilka)
    - [x] Koden är förberedd på återanvändning
    - [x] All kod samt historik finns i git 
    - [x] Reflektionerna är skrivna
    - [x] Koden är läsbar
  - [ ] Jag eftersträvar med denna inlämning högre betyg (C) och anser mig uppfylla alla extra krav för detta. 
    - [ ] Jag är noga i min testning
    - [ ] En del av testfallen är automatiserade (Tokenizer/Parser/PP), viss del kan vara manuellt testad.
    - [ ] Det finns en tydlig beskrivning i hur mina moduler skall användas. 
    - [ ] Mina reflektioner visar tydligt att jag förstått bokens koncept.
  - [ ] Jag eftersträvar med denna inlämning högsta betyg (A-B) 
    - [ ] Sammanhängande reflektion som ger ett gott helhetsintryck och visar detaljerad förståelse för kodkvalitet.
    - [ ] Min kod är ... (pussar fingrar och gör smackljud)
    - [ ] Extrauppgift parser finns med som egen modul(er)


Förtydligande: Examinator kommer sätta betyg oberoende på vad ni anser. Att ha "saker" från högre betygsnivåer verkar positivt och kan väga upp brister i inlämningen.

## Länk till reflektion

https://docs.google.com/document/d/1Xlf7ejDqDQAfwgxhE6-smbvm8phJpHAhunTOytMzyNQ/edit?usp=sharing

## Hur jag testat
Beskriv hur du kommit fram till om din kod fungerar. Beskriv de olika delarna och hur de testats. Screenshots från manuell testning.

### Testfall
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


Screenshots från automatisk testning.