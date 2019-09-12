# Lektion 1 - control flow

#### Control flow - Vad är det?
Under det första tillfället kommer vi gå igenom vad vi kallar för control flow, dvs de mest basic komponenterna inom 
Java som vi använder för att styra kodens flöde. Detta innefattar if-satser, switch-satser och olika loopar.

#### Ladda ned koden
 1. Gå till: http://cuso.edb.se/stash/users/e605363/repos/fundamental-java/browse (om du inte redan är där)
 2. Clona repot genom att trycka på "ladda ned"-ikonen under din profilbild längst upp till vänster.
 3. Öppna din favoritteminal, navigera till en lämplig mapp, förslagsvis under "C:/DevTools", och skriv kommandot:
       		
        git clone [länken från stash]
       
#### Öppna projektet i IntelliJ
1. Öppna intelli J
2. Gå till file > open _(eller tryck på open direkt)_
3. Välj projektets map.
4. Intellij brukar nu själv förstå att det är ett mavenprojekt och sätta upp projektet efter det. Om intellij själv
 inte gör detta, leta upp POM.xml och dra filen till Maven-paletten till höger i IDE:n.

#### Testa att köra testerna
1. Öppna _src > test > control.flow_
2. Högerklicka på mappen _'control.flow'_ och välj _'Run tests in 'control.flow''_.

    2a. Om alternativet inte finns, välj 'Mark directory as > Test', och testa igen.

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
