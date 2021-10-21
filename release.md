# Mall för inlämning laboration 1, 1dv610

## Checklista
  - [ ] Jag har skrivit all kod och reflektioner själv. Jag har inte använt mig av andras kod för att lösa uppgiften.
  - [ ] Mina testresultat är skrivna utifrån utförd testning ( och inte teoretiskt, "det bör fungera" :) )
  - [ ] De enda statiska metoder eller funktioner utanför klasser som jag har är för att starta upp min testapplikation ex main(java).
  - [ ] De enda bibliotek och färdiga klasser som används är sådana som måste användas (eller som används för att testa modulen).

## Egenskattning och mål
  - [ ] Jag är inte klar eftersom jag vet att jag saknar något. Då skall du inte lämna in!
  - [ ] Jag eftersträvar med denna inlämning godkänt betyg (E-D)
    - [ ] De flesta testfall fungerar (enstaka testfall kan misslyckas, tydligt vilka)
    - [ ] Koden är förberedd på återanvändning
    - [ ] All kod samt historik finns i git 
    - [ ] Reflektionerna är skrivna
    - [ ] Koden är läsbar
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

## Komponenter och återanvändning
 * Länka in URL om du använder olika repositorier för dina olika komponenter. 
 * Beskriv komponenterna och hur de skall användas.
 * Beskriv hur du anpassat din kod och instruktioner för att någon annan programmerare skall kunna använda dina komponenter. Om du skrivit instruktioner för din användare länka till dessa. Om inte beskriv här hur någon skall göra. 
 * Beskriv hur du säkerhetställt att beroendena mellan komponenterna är som beskrivs i laborationen. 


## Länk till reflektion

https://docs.google.com/document/d/1Xlf7ejDqDQAfwgxhE6-smbvm8phJpHAhunTOytMzyNQ/edit?usp=sharing

## Hur jag testat
Beskriv hur du kommit fram till om din kod fungerar. Beskriv de olika delarna och hur de testats. Screenshots från manuell testning.

### Testfall
Lista de enskilda testfallen, eller länka in detta.

| Namn      | Indata | Förväntat Utfall | PASS/FAIL |
| --------- | ------ | ---------------- | --------- |
| TC1       | "a. b."| Sentences size 2 | PASS      |
| TC2       | "a! b c?"| Second sentence, first token = word(b), second token word(c) | PASS      |
| TC3       | "a!"| "SENTENCE(WORD(a) EXCLAMATION(!))" | PASS      |
| TC4       | "a bc."| "word(bc)" | PASS      |
| TC5       | ("Hello world. I am Linus! How are you?"); | Prettyprinted in console | PASS      |
| TC6       | | Prettyprinted in console | PASS      |
| TC7       | "Hello world."| DOT(.) | PASS      |
| TC8       | "Hello world."| WORD(Hello) | PASS      |
| TC9       | "Hello world."| throw | PASS      |


Screenshots från automatisk testning.