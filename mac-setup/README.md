# Installation guide Enterprise Services development environment
These installation instructions are for Mac.

## Homebrew
Get Homebrew from [brew.sh](http://brew.sh/).

## Git
1. Check if you have git installed with `git -v`.  
2. If you dont have git installed
`brew install git`

### git-credential-osxkeychain
Follow instruction [here](https://tech.lds.org/wiki/Git_Credential_Caching_on_Mac_OS_X) to install and/or verify that you have credential-osxkeychain

## Groovy
Check if you have groovy installed with `groovy -v`.  
If you dont have groovy installed
`brew install groovy`

## Maven
Check if you have maven installed with `maven -v`.  
If you dont have maven installed
`brew install maven`

### Maven settings
Maven has to be configured with a settings file. Download maven/settings.xml file from
[here](https://cusobitbucket.evry.com/projects/ENMI/repos/environment.development/browse/maven?at=refs%2Fheads%2Fdevelop) to ~/.m2/settings.xml
Remove the override of `<localRepository>` in the settings.xml file. If you dont know your home folder (~/) type 'echo ~' into your favorit terminal.

## IntelliJ
If you don't have IntelliJ,

1. Download [Intellij Ultimate Edition](http://www.jetbrains.com/idea/download/)
1. Follow installation instructions
1. Use cuso licence server
    1. Choose Help->Register in IntelliJ IDEA menu bar
    1. Click Enter license server address and paste http://cuso.edb.se/licenseServer
    1. Click OK

## Setup IntelliJ

### Minimal setup

1. Open IntelliJ
1. Select File->Import Project
    1. Select lf\es\git\modules
    1. Select "Import project from external model"
    1. Select Maven
    1. Click Next
    1. Check "Import Maven projects automatically"
    1. Click Next
    1. Select profile "minimal"
    1. Click Next
    1. Click Next
    1. Click Next
    1. Click Finish
    1. Click New Window
1. Select IntelliJ Preferences->Maven
    1. Check Override User settings file
    1. Write lf\es\git\environment\development\maven\settings.xml (or the path to your settings.xml file)
    1. Click Apply
    1. Click OK
    
#### Ladda ned koden
 1. Gå till: https://cusobitbucket.evry.com/users/e605363/repos/fundamental-java/browse (om du inte redan är där)
 2. Clona git länken för repot genom att trycka på "ladda ned"-ikonen under din profilbild längst upp till vänster.
 3. Öppna din favoritteminal, navigera till en lämplig mapp, förslagsvis under "C:/DevTools", och skriv kommandot:
            
        git clone [länken från stash]

#### Öppna kod-projektet i IntelliJ
1. Öppna intelli J
2. Gå till file > open _(eller tryck på open direkt)_
3. Leta upp vår POM.xml-fil.
4. Dra filen till maven-paletten som du hittar längst till vänster i intelliJ.

Detta skall göra att intelliJ hämtar koden för de beroenden vi har, och kompillerar allt åt oss.

#### Testa att köra testerna
1. Öppna _src > test > control.flow_
2. Högerklicka på mappen _'control.flow'_ och välj _'Run tests in 'control.flow''_.

    2a. Om alternativet inte finns, välj 'Mark directory as > Test', och testa igen.

Testerna bör nu smälla, ni trodde väll inte att vi hade skrivit svaren åt er? 
_(om in så kan vi behöva markera mappen för test och src)_

#### Let the coding beguin
1. Om du känner dig ringrostig på Java kan du börja på 'Lession 1 - control flow', det behandlar enklare java-koncept såsom if-satser, loopar och switchsatser. Annars får man börja direkt på 'Lession 2 & 3 - Java features'.
