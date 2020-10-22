----
#Lektion 2 & 3 - Java features

Tanke på upplägg: Sitt två och två, alt. tre och tre. Läs uppgifterna tillsammans, försök förstå vad som menas med
 dem, **lös uppgifterna på egen hand** och diskutera därefter era lösningar och hur det ni just gjort relaterar till
 rubriken för uppgiften. Om någon hinner klart före kan den givetvis hjälpa den andra.

Uppgifterna är uppdelade i olika koncept som alla har en parallell till Objekt-orienterad programmering och Java. Försök
att ta er tiden och förstå koncepten bakom frågorna, snarare än att bara lösa uppgifterna.

Under den här lektionen kommer ni arbeta i mappen **object.oriented.java**.

### Access modifiers
1. Använd Javas access modifiers (public, private, protected) för att enkapsulera de olika formernas (Rectangle
, Square och Triangle) instans-variabler. Det vill säga, gör instansvariablerna privata och ge dessa publika getters och
 setter. Ge också klassen en konstruktor som tar in värden för de olika instansvariablerna. (Skriv gärna dessa själv
  i en av formerna, sedan kan ni autogenerera dessa genom att högerklicka och välja generate (alt+insert || ^N)).

2. Att enkapsulera en klass instansvariabel gör att vi får bättre kontroll över dessa. Ett exempel på detta är att vi
 kan kontrollera vilka värden som faktiskt sätts. Se nu till att triangeln och rektangeln som bas inte får ha ett värde
  under 1 och inte över 256, detta är det högsta värdet som vår applikation anses klara av. Om något annat värde
 kommer in skall metoden inte sätta något värde!

3. Ge triangeln två konstruktorer. En som tar både basen och höjden, och en som bara tar basen. Om den senare används
 skall höjden sättas till basen * 2.

4. Se nu till att fyrkanten (Rectangle) bara får ha jämna värden som höjd.

5. Flytta klassen ’SomeHelperClass’ till ett nytt paket, och döp paketet till något som ni tycker är lämpligt. Rätta
 till felen i someHelperClass så att de följer figurernas nya gränssnitt.
 
6. Fixa så att someHelperClass använder sig av de nya konstruktor-APIerna för figurerna.
 
7. Fundera på om ni kan göra något för att ge TestCase-klassen tillgång till getFigure-metoden i someHelperClass (om
 ni inte redan gjort detta).

### Wrapperklasser & autoboxing
1. Se till så att alla instansvariabler är av vad ni anser vara en rimlig typ. Se även till att era setters, getters
 och konstruktorer tar in värden av rimliga typer. Tumregeln är att använda de primitiva typerna i den utsträckning
 som det går då wrappade typer generellt tar upp mer minne. Tänk på att de primitiva typerna inte kan vara null. Gl
 öm inte att kika så att allt fortfarande stämmer i SomeHelperClass.
 
2. Se nu till att figurerna har flera olika setters som klarar av olika typ av input. Dessa skall klara av att få in
 Integers, Doubles och värden i form av strängar.
 
 _Till exempel: setBase(String base), setBase(Integer base), setBase(Double base)_.

Wrapperklasserna har en valueOf()-metod som kan komma till användning. Det kan även komma att bli nödvändigt att
  casta typer på andra vis. Se till att fånga upp eventuella fel som kan tänkas uppkomma, som till exempel om en str
  äng innehåller annat än bara siffror och punkter, eller är null.
 
3. Lägg märke till att det inte krävs någon speciell omvandling mellan en primitiv typ och dess wrapperklass. Detta l
öser Java åt oss och det är det som kallas för **autoboxing**, dvs när en primitiv typ görs om till en _wrapper-typ_
, eller _unboxing_ som är motsatsen.

4. Skaffa ett kortkommando ('Comment with line comment'). för att kommentera eller avkommentera kod (eller använd
 default-kommandot, om det fungerar).

5. Se till så att logiken ni lade till i de olika set-metoderna fungerar genom att avkommentera enhetstesterna för de
 olika figurerna och se till så att dessa går igenom.

### Magic numbers
Magic numbers är kort och gott siffror (eller i vissa fall strängar) vars syfte är svårt att förstå genom att enbart
 se de i koden. Därför är det trevligt att bryta ut dessa till konstanter, och ge dem ett namn som förklarar dess
  mening. Här är ett exempel från en DSL bank-tjänst:

    public class RequestTranslator {
            
         private String translatePaymentFrequency(OriginalRequest request) {
             switch (request.getPaymentFrequency()) {
                 case "1":
                     return "3";
                 case "2":
                     return "5":
                 default:
                     return "0";
             }
         }
    }

För oss är detta svårt att förstå. Ger vi istället de magiska nummerna en kontext blir det betydligt mycket mer läsbart:

    public class RequestTranslator {
              
         private static final String MONTHLY = "1";
         private static final String YEARLY = "2";
          
         private static final String MONTHLY_PAYMENT_FREQUENCY = "3";
         private static final String YEARLY_PAYMENT_FREQUENCY = "5";
         private static final String WEEKLY_PAYMENT_FREQUENCY = "0";
     
         private String translatePaymentFrequency(OriginalRequest request) {
             switch (request.getPaymentFrequency()) {
                case MONTHLY:
                     return MONTHLY_PAYMENT_FREQUENCY;
                case YEARLY:
                     return YEARLY_PAYMENT_FREQUENCY:
                default:
                     return WEEKLY_PAYMENT_FREQUENCY;
             }
         }
    }

1. Diskutera om det finns några nummer i er kod som skulle kunna brytas ut till konstanter för att göra koden mer l
äsbar. Om ni hittar några sådana exempel, gör om dessa, annars är det bara att fortsätta.

### Abstrakta klasser & Interfaces
1.	En fördel med abstrakta klasser är att man kan definiera beteenden som alla sub-klasser får. Gör nu om Figure
-interfacet till en abstrakt klass och se om det är någon logik som implementerats fler än en gång, som går att bryta
 ut och lägga i er nya superklass.
2. Se till så att testerna fortfarande går igenom.
3. Interfaces är någon som kan upplevas som krångligt, men som egentligen är ett ganska enkelt koncept. Det ett
 interface gör är att definiera ett antal metod-signaturer med inparametrar, namn och returtyp som en klass som
  implementerar ett interface **MÅSTE** ha. Det är en garanti på att gränssnittet ser ut på ett visst sätt, och låter den
   som konsumerar det vara säker på att vissa nyckelsaker alltid finns, och kan användas på ett visst sätt. **Som ett
    kontrakt.** Det påminner lite om en abstrakt klass, men ett interface innehåller ingen logik, utan specificerar
     endast metodsignaturer.
4. Ett ofta använt interface är Comparator<>-interfacet. Det är också ett bra exempel på hur simpelt, men kraftfullt
, ett interface kan vara. Vi vill nu kunna sortera våra figurer utefter Area. Men, för att kunna använda redan
 inbyggda sorteringsmetoder så måste vi tala om för sorterings-funktionen hur våra figurer skall jämföras. Det gör vi
  genom att skapa en klass som använder sig av Comparator-interfacet:
    1. Skapa en ny klass som skall jämföra figurer efter dess area. Försök att hitta ett passande namn!
     
    2. Låt klassen implementera interfacet Comparator<>.
    
    3. Använd alt+enter när du står på den nu rödmarkerade klassignaturen, välj 'implement methods' och ta det första
     alternativet. Då kommer IntelliJ skapa skalet till alla metoder som Comparator-interfacet har definierat, som
      alltså nu krävs.
    
    4. Comparator-interfacet, om implementerat korrekt, gör att vi kan jämföra olika former, och i förlängningen
     sortera olika typer av datasamlingar. För oss gäller det nu att berätta för den nu tomma metoden hur den skall j
     ämföra våra två figurer. Såhär säger interfacets beskrivning om metoden:
    
    _Compares its two arguments for order. Returns a negative integer, zero, or a positive integer as the first
     argument is less than, equal to, or greater than the second._
   
 5. Sortera listan i Main-klassen i TestCase genom att använda Collections sort-metod. Skriv sedan ut den sorterade
  listan och säkerställ att figurerna nu skrivs ut i storleksordning.


### Pure functions & mutability
I så hög utsträckning som möjligt vill vi ha metoder som **inte** sparar data i muterbar form. Det ökar risken för att
 data ligger kvar i senare skeden, är svårare att testa och ger upphov till fel som är svåra att identifiera. Istället vill vi ha vad som brukar kallas för ”pure functions”. Utmärkande för dessa är att de endast påverkas av den data de får in. **En viss indata ger alltså alltid samma utdata.**

1. Gör om formernas getArea-metoder så att de blir ”pure”, dvs att de inte sparar någon data.
2. Ett bra sätt att undvika att spara data i en klass är att använda ett designmönster som brukar kallas för builder-pattern. En builder används istället för en klass vanliga konstruktor och fungerar så att den hela tiden returnerar
 sig själv. Det låter oss skriva metoder i en kedja och på så sätt sätta alla värden på builder-objektet. Objektet skapas dock först när man anropar dess Build-funktion.
Vi skall nu använda ett sådant mönster i someHelperClass för att skapa våra figur-objekt:

    1. Ladda ned addon:et InnerBuilder till Intellij
    
    2. Gå in i någon av formerna. Högerklicka > Generate > Builder. Välj sedan alla instansvariabler och skapa. Magi, ni
 har nu implementerat ett builder-pattern.
    
    3. Gör nu om getFigures()-metoden och använd era byggare för att skapa de objekt som skall läggas in i listan.
    
    4. Se till att TestCase fortfarande skriver ut formerna i storleksordning.

## LAMBDA:
Lambda-uttryck är ett sätt att deklarera en funktion direkt i koden. Istället för att behöva skriva en metodsignatur
 på en rad, och sedan metodkroppen på efterföljande rader, kan man nu lösa allt detta på en enstaka rad. Till exempel;

        public String addOne(int number){
            return number + 1;
        } 

Samma metod fast med lambda:

        (number) -> x + 1; 
            
1. Detta är användbart när man använder interfaces som bara kräver en metod. Då kan vi nämligen deklarera den metoden
 direkt, utan att behöva skapa nya filer, eller anonyma klasser. Använd nu lamda-syntaxen istället för figur
 -komparatorn när ni sorterar listan med former och ta bort den gamla figur-komparatorn.

## DATASAMLINGAR
1. Gör nu övningarna i collections-paketet. Där finns instruktioner om hur ni skall lösa uppgifterna. Börja med
 SetInterfaceExercises.

## STREAMS
1. Gör nu övningarna i streams-paketet. Här komemr ni behöva använda er av lambda-uttryck. Löser ni alla uppgifter
 blir jag imponerad! Gör de i ordningen:
    1. Filter
    2. Map
    3. Reduce
    4. Mixed

## IDEA-HACKS:
1. Autogenerera getters, setters, konstruktorer:
    Högerklicka > Generate > välj..
    
2. Autogenerera konstanter, klasser, metoder:
    Högerklicka > Refactor > Extract
    
 Från förra tillfället:
 1. Öppna två fönster bredvid varandra. (högerklicka på flik > 'split verticaly').
 2. Go to definition (ctrl+click).
 3. Find usages (högerklicka > 'find usages').
 4. Multicursors?
 5. ctrl + alt + o = rensa importer (cmd + option + o för mac)
 6. ctrl + alt + l = pretty-print (cmd + option + l för mac)
 7. Get suggestions to fix error (Alt+Enter)
 8. Remove row (Ctrl + y)
 9. Highlight paragrath/words (Ctrl + Shift + Left/Right/Up/Down pointer)
 10. Refactor varible name (rename) Highlight varilble and (Shift + F6)
 11. Alt + insert (auto generate constructor, getters etc)
