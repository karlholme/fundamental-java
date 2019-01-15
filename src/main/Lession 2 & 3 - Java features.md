# Lektion 2 & 3 - Java features

Tanke på upplägg: Sitt två och två, alt. tre och tre. Läs uppgifterna tillsammans, försök förstå vad som menas med de, **lös uppgifterna på egen hand** och diskutera därefter era lösningar och hur det ni just gjort relaterar till rubriken för uppgiften. Om någon hinner klart föra kan den givetvis hjälpa den andra. Det går såklart också bra att lösa uppgifterna själv.

Vissa av uppgifterna kommer att vara lite luddiga. Och det är meningen. Ibland kommer det heller inte vara helt tydligt hur frågan relaterar till dess rubrik, men tanken är att det alltid skall finnas en koppling. Försök att lägga lite tid på att förstå koncepten i ett lite bredare perspektiv, snarare än att bara lösa uppgiften och gå vidare. Förstår ni inte tanken bakom en uppgift, diskutera med er kamrat eller fråga någon annan!

### Access modifiers
1. Använd javas access modifiers (public, private, protected) för att enkapsulera de olika formernas instans-varibabler. Ge samtidigt dessa en konstruktor, getters och setters.

2. Att enkapsulera en klass instansvariabel ger oss mer kontroll över dessa. Till exempel är det lätt att kontrollera vilka värden som får sättas. Se nu till att triangeln bara tillåter jämna tal som bas. Returnera ett fel med felkod 1 om fel värde försöker sättas. Använd SystemException-klassen.

3. Triangeln bör ha två konstruktorer. En som tar både basen och höjden, och en som bara tar bas. Om den senare används skall höjden sättas till basen * 2.

4. Se nu till att ingen av formerna får ha ett värde under 0. Om detta sker så skall ett fel, med felkod 2, kastas.

5. Flytta klassen ’SomeHelperClass’ till ett nytt paket och och ge paketet och klassen namn som ni tycker passar.

### Wrapperklasser & autoboxing
1. Se till så att alla instansvariabler är av en rimlig typ. Tumregeln är att använda de primitiva typerna i den utsträckning som det går då wrappade typer generellt tar upp mer minne. En annan skillnad är att de, till skillnad från de primitiva typerna, kan vara null.

2. Se nu till att figurerna har setters som klarar av olika typ av input. Dessa skall klara av att få in Integer, Double och värdet som en sträng. Till exempel: setBase(String base), setBase(Integer base), setBase(Double base). Wrapperklasserna har en valueOf()-metod som kan komma till användning. Se till att fånga upp eventuella fel som kan tänkas uppkomma, som till exempel om en sträng innehåller annat än bara siffror och punkter eller är null. Lägg märke till att det inte krävs någon speciell omvandling mellan en primitiv typ och dess wrapperklass. Detta löser Java åt oss och det kallas autoboxing alt. unboxing.

3. Se över så att valideringen ni lade till i de olika set-metoderna fortfarande fungerar. Tänk på att det bara är primitiva typer som kan jämföras med ’==’, annars får man använda metoder som finns i wrapperklasserna.

### Magic numbers
Magic numbers, som ni bekantat er med i kursen om kodkvalité, är kort och gott siffror som används i koden för att uppfylla ett visst syfte, men vars syfte är svårt att förstå genom att enbart läsa koden. Därför är det trevligt att bryta ut dessa till konstanter, och ge dem ett namn som ger en hint om dess syfte. Här är ett exempel:

    public class RequestTranslator {  
            
         private String translatePaymentFrequency(OriginalRequest request) {
             switch (request.getPaymentFrequency()) {
                 case "1":
                     return "3";
                 case "2":
                     return "5":
                 default:
                     return "0";
             }
         }
    }

För oss ät detta svårt att förstå. Ger vi istället de magiska nummerna en kontext blir det betydligt mycket mer läsbart:

    public class RequestTranslator {        
              
         private static final String MONTHLY = "1";
         private static final String YEARLY = "2";
          
         private static final String MONTHLY_PAYMENT_FREQUENCY = "3";
         private static final String YEARLY_PAYMENT_FREQUENCY = "5";
         private static final String WEEKLY_PAYMENT_FREQUENCY = "0";
     
         private String translatePaymentFrequency(OriginalRequest request) {
             switch (request.getPaymentFrequency()) {
                case MONTHLY:
                     return MONTHLY_PAYMENT_FREQUENCY;
                case YEARLY:
                     return YEARLY_PAYMENT_FREQUENCY:
                default:
                     return WEEKLY_PAYMENT_FREQUENCY;
             }
         }
    }

1. Gör om alla magiska nummer ni kan hitta i koden till konstanter och ge dem ett namn som beskriver vad dessa faktiskt är.

### Abstrakta klasser & Interfaces
1.	En fördel med abstrakta klasser är att man kan definiera beteenden som alla sub-klasser får. Gör nu om Figure-interfacet till en abstrakt klass och se om det är någon logik som implementerats fler än en gång, som går att bryta ut och lägga i er nya superklass.

2. Interfaces är någon som kan upplevas som krångligt, men som egentligen är ett ganska enkelt koncept. Det ett interface gör är att definiera ett antal metoder, med inparametrar, namn och returtyp som en klass som implementerar ett interface MÅSTE ha. Det är alltså en garanti på att gränssnittet ser ut på ett visst sätt, och låter den som konsumerar det vara säker på att vissa saker finns, och kan användas på ett visst sätt. Som ett kontrakt. Det påminner lite om en abstrakt klass, men ett interface innehåller ingen logik, utan endast en specifikation av metodsignaturer.

3. Ett ofta använt interface är Comparator<>-interfacet. Det är också ett bra exempel på hur simpelt, men kraftfullt, ett interface kan vara. Vi vill ni kunna sortera våra figurer utefter Area. För att kunna använda inbygda sorteringsmetoder så måste vi tala om för sorterings-funktionen hur våra figurer skall jämföras. Det gör vi genom att skapa en klass som använder sig av Comparator-interfacet:
   
    1. Skapa en ny klass som skall jämföra figurer efter dess area. Försök att hitta ett passande namn!
   
    2. Låt klassen implementera interfacet Comparator<>
   
    3. Använd alt+enter när du står på den nu rödmarkerade klassignaturen, välj 'implement methods' och ta det första alternativet. Då kommer IntelliJ skapa skalet till alla metoder som Comparator-interfacet har definerat och som nu krävs.
   
    4. Comparator-interfacet, om implementerat korrekt, gör att vi kan jämföra olika former, och även sortera olika typer av datasamlingar. För oss gäller det nu att berätta för metoden hur den skall jämföra våra två figurer. Såhär säger interfacets beskrivning om metoden:
    
    _Compares its two arguments for order. Returns a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second._
   
 5. Sortera listan i Main-klassen i TestCase genom att använda Collections sort-metod. Skriv sedan ut den sorterade listan för att undersöka om implementationen av jämförelsen blev korrekt.


### Pure functions & mutability
I så hög utsträckning som möjligt vill vi ha metoder som inte sparar data i muterbar form. Det ökar risken för att data ligger kvar i senare skeden, är svårare att testa och ger upphov till fel som är svåra att identifiera. Istället vill vi ha vad som brukar kallas för ”pure functions”. Utmärkande för dessa är att de endast påverkas av den data de får in. **En viss indata ger alltså alltid samma utdata.**

1. Gör om formernas getArea-metoder så att de blir ”pure”, dvs att de inte sparar någon data.

2. Ett bra sätt att undvika att spara data i en klass är att använda ett designmönster som brukar kallas för builder-pattern. En builder används istället för en klass vanliga konstruktor och fungerar så att den hela tiden returnerar sig själv. Det låter oss skriva metoder i en kedja och på så sätt sätta alla värden på builder-obejektet. Objektet skapas först när man anropar dess Build-funktion.
Vi skall nu använda ett sådant pattern i someHelperClass för att skapa våra figur-objekt:
    1.	Till en början skall vi skapa en statisk, nästlad klass i vår Square-klass. Ge den namnet Builder.:
    public static final class Builder {}
    
    2.	Kopiera den yttre klassens instansvariabler till den nya, nästlade, klassen och gör dessa privata.
    
    3.	Skapa en metod för varje instansvariavbel som returnerar Builder, och som heter likadant som instansvariabeln själv.
    
    4.	Låt metoderna sätta värdet på instansvariabeln och sedan returnera this.
    
    5.	Låt först den yttre klassens konstuktor ta in en bulder, och utifrån dennes värden sätta instansvariablerna.
    
    6 .	Skapa sedan build-metoden och låt den skapa en ny Square med sig själv (this) som argument till konstruktorn.

Detta är såklart ingen man måste göra manuellt varje gång, även om det är viktigt att känna till hur de är uppbyggda. Så för de andra klasserna, gör följande:
1. Ladda ned addon:et InnerBuilder till Intellij

2. Gå in i de resterande formerna. Högerklicka > Generate > Builder. Välj sedan alla instansvariabler och skapa. Magi, ni har nu implementerat ett builder-pattern.

3. Gör nu om getFigures()-metoden och använd era byggare för att skapa de objekt som skall läggas in i listan.

