# Installation guide
These installation instructions are for Windows, if you are using a Mac go to folder 'mac-setup'.

## Git
Check if git is installed:

1. Press Start
1. All programs
1. Check if you have a Git folder containing a Git Bash program

If not, install git:

1. Download [git](http://git-scm.com/downloads)
1. Install git from file
    1. Choose **Next** at the first pop up (here you can also add shortcuts to git)
    1. Choose **Use Git and optional Unix tools from the windows command prompt** at the second pop up
    1. Choose **Checkout Windows-style, commit Unix-style line endings** at the third pop up

1. Verify your installation by checking if git is installed (see above)

Post installation configuration:

* Add a new user environment variable called HOME. The value should be %USERPROFILE%. If this is not done, git will save configuration files to H:\ (which, for some, might be a network drive).
    1. Press Start
    2. Write Environment variables
    3. Environment variables
    4. Add new variable
* The following needs to be configured from either Bash (if *Bash only* was selected) or your favorite terminal:

		git config --global user.name "Firstname Lastname"
		git config --global user.email "firstname.lastname@evry.com"

	To support long paths/file names in Windows when cloning repos/checking out branches, issue the following command (long paths might still break other programs):

		git config --global core.longpaths true
  
## Git Credential Manager for Windows (previous git-credential-winstore)
If not installed..., install Git Credential Manager for Windows: 

1. Browse to [Git Credential Manager for Windows](https://github.com/Microsoft/Git-Credential-Manager-for-Windows/releases)
1. Download GCMW-1.10.0.exe
1. Run the installation file (accept licence agreement and then hit next. Then Finish.
 
installera windows environment installer  
 
## Java
Check if you have java 1.8 installed:
  
1. Press Start
1. Command Prompt
1. Write "java -version" and press enter

If you see something like "java version 1.8...", also make sure you have a JDK installed. 

1. Write "javac -version" and press enter. (In order for this to work, path to JDK bin needs to have been added to the PATH in System variables.)

If you get the message "javac is not recognized as an internal or external command, operable program or batch file.", or if in the previous step you didn't see something like "java version 1.7...", install java:


1. Download [JDK 1.8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
    1. Select Windows x64
    1. Click the "Run" button to install the dowmloaded file
    1. Click "Yes" and follow installation instructions (go with default options, i.e. press next until complete)
1. Verify your installation by checking if java is installed (se above - remember to restart Command Prompt)
1. Set the environment variable JAVA_HOME:
    1. Press Start
    1. Write Environment variables
    1. Environment variables
    1. Press "New" button below System variables
    1. Write JAVA_HOME as variable name
    1. Write the path to where you have installed java as the variable value, typically "C:\Program Files\Java\jdk1.7.0_51."  (Without citations)

## Maven
Check if maven is installed:

1. Press Start
1. Command Prompt
1. Write "mvn --version" and press enter

If you see something like "Apache Maven 3.6.0. .." skip down to "2. Setup Maven settings.xml"

If you did not see something like "Apache Maven 3.6.0. ..", install mvn:

1. Download [maven](http://maven.apache.org/download.cgi)
    1. Select Maven 3.6.0. (Binary zip)
    1. Follow installation instructions on download page
	
## IntelliJ
Check if IntelliJ is installed:

1. Press Start
1. All programs
1. Check if you have a Jetbrains folder containing a IntelliJ IDEA
  
If not, install IntelliJ:

1. Download [Intellij Ultimate Edition](http://www.jetbrains.com/idea/download/)
1. Follow installation instructions
1. Use cuso licence server
    1. When you first start Intellij, it will ask you for a licence
    1. Click "Use licence server" 
    1. In the server address field, paste the address http://cuso.edb.se/licenseserver
	1. Click OK (don't click "discover server")

## Setup IntelliJ

### Add quick buttons and Maven projects to Intellij GUI

1. Open IntelliJ 
1. Click View -> Tool Windows -> Maven Projects
1. Click View -> Tool Buttons

#### Ladda ned koden
 1. Gå till: http://cuso.edb.se/stash/users/e605363/repos/fundamental-java/browse (om du inte redan är där)
 2. Clona git länken för repot genom att trycka på "ladda ned"-ikonen under din profilbild längst upp till vänster.
 3. Öppna din favoritteminal, navigera till en lämplig mapp, förslagsvis under "C:/DevTools", och skriv kommandot:
       		
        git clone [länken från stash]

#### Öppna projektet i IntelliJ
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

#### Let the coding beguin
1. Öppna MD-filen Lession 1 och följ instruktionerna. Om du tycker att det är för lätt kan du gå vidare till lektion
 2 & 3.
