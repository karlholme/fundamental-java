# Lektion 1 - control flow

#### Control flow - Vad är det?
Under det första tillfället kommer vi gå igenom vad vi kallar för control flow, dvs de mest basic komponenterna inom 
Java som vi använder för att styra kodens flöde. Detta innefattar if-satser, switch-satser och olika loopar.

#### Ladda ned koden
 1. Gå till: https://cusobitbucket.evry.com/users/e605363/repos/fundamental-java/browse (om du inte redan är där)
 2. Clona repot genom att trycka på "ladda ned"-ikonen under din profilbild längst upp till vänster.
 3. Öppna din favoritteminal, navigera till en lämplig mapp, förslagsvis under "C:/DevTools", och skriv kommandot:
       		
  Fasttrack: ställ dig i mappen och skriv "cmd" i url eller högerklicka och kör "Git Bash Here"
  
        git clone [länken från stash]
        
#### Öppna projektet i IntelliJ
1. Öppna intelli J
2. Gå till file > open _(eller tryck på open direkt)_
3. Välj projektets map.
4. Intellij brukar nu själv förstå att det är ett mavenprojekt och sätta upp projektet efter det. Om intellij själv
 inte gör detta, leta upp POM.xml och dra filen till Maven-paletten till höger i IDE:n.
5. Se till att din "Test"-mapp är markerad som Test Sources Root (genom att högerklicka på Test-mappen och välja "Mark Directory as").
6. På samma sätt se till att "src"-mappen är markaderad som "Generated Sources Root" 

### Skapa en feature-branch
Innan vi börjar skall alla skapa var sin feature-branch. Detta är eran egen branch där ni kan ha era ändringar. Efter
 att ni slutfört alla uppgifter i en fil så skall dessa commitas och sen pushas, det bör ni även göra innan kurs
 -tillfället avslutas. Längre fram i kursen kommer vi att göra en pull request i en annan branch, som en kollega sen kommer att få godkänna.

1. Navigera till rätt mapp i din favoritterminal. Detta kan du till exempel göra genom att dra ner pom-filen i
 intellijs integrerarde terminal.
2. _git branch -a_ (ger dig alla brancher, lokala såsom remota)
3. Skriv _git checkout feature/{namn_på_din_branch} -b_. -b-flaggan gör att du direkt kommer stå i den nya branchen
 och få med dig eventuella ändringar du har lokalt.
4. Kolla att du nu är i rätt branch genom att skriva _git branch_.

#### Testa att köra testerna
1. Öppna _src > test > control.flow_
2. Högerklicka på mappen _'control.flow'_ och välj _'Run tests in 'control.flow''_.

Testerna bör nu smälla, ni trodde väll inte att vi hade skrivit svaren åt er?

#### Koda på!
Försök nu att fylla på koden i de tomma metoderna, vars korresponderande tester smäller, tills de går igenom.
Börja med IfStatements, gå sedan över till SwitchStatements och avsluta med Loops!

Det kan vara till hjälp att tjuvkika på testerna.

#### IDEA-HACKS som kan vara trevliga att känna till
1. Öppna två fönster bredvid varandra. (högerklicka på flik > 'split verticaly').
2. Go to definition (ctrl+click).
3. Find usages (högerklicka > 'find usages').
4. Multicursors?
5. ctrl + alt + o = rensa importer (cmd + option + o för mac)
6. ctrl + alt + l = pretty-print (cmd + option + l för mac)
7. Get suggestions to fix error (Alt+Enter)
8. Remove row (Ctrl + y) 
9. Highlight paragrath/words (Ctrl + Shift + Left/Right/Up/Down pointer)
10. Refactor varible name (rename)  Highlight varilble and (Shift + F&)
