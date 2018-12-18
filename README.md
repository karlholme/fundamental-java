# Installation guide
These installation instructions are for Windows.

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
Check if you have java 1.7 or 1.8 installed:
  
1. Press Start
1. Command Prompt
1. Write "java -version" and press enter

If you see something like "java version 1.7...", also make sure you have a JDK installed. 

1. Write "javac -version" and press enter. (In order for this to work, path to JDK bin needs to have been added to the PATH in System variables.)

If you get the message "javac is not recognized as an internal or external command, operable program or batch file.", or if in the previous step you didn't see something like "java version 1.7...", install java:


1. Download [JDK 1.7](http://www.oracle.com/technetwork/java/javase/downloads/java-archive-downloads-javase7-521261.html#jdk-7u80-oth-JPR)
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

If you see something like "Apache Maven 3.2.3. .." skip down to "2. Setup Maven settings.xml"

If you did not see something like "Apache Maven 3.2.3. ..", install mvn:

1. Download [maven](http://maven.apache.org/download.cgi)
    1. Select Maven 3.2.3. (Binary zip)
    1. Follow installation instructions on download page

1. Setup Maven settings.xml
    1. If you just installed Maven, skip to step 6.
    1. Browse to C:\Program Files\Apache Software Foundation\apache-maven-3.2.3\conf (or the corresponding directory if you have Maven installed somewhere else).
    1. Open the file settings.xml
    1. make sure the node <profiles> has a child node that points to the url "http://cuso.edb.se/artifactory/lfes-snapshot/"
    1. If the node doesn't exist or points to the wrong url, continue with step 6. If it is correct, you are done!
	1. go to [http://cuso.edb.se/stash/projects/ENMI/repos/environment.development/browse/maven?at=refs%2Fheads%2Fdevelop](http://cuso.edb.se/stash/projects/ENMI/repos/environment.development/browse/maven?at=refs%2Fheads%2Fdevelop)
	1. click "settings.xml"
	1. in the top right corner, click "RAW file". This will download the file settings.xml
	1. find the downloaded file on your system. rename it "settings.xml" if the name has changed (for instance it might be named maven-settings.xml)
	1. copy the file and paste it into C:\Program Files\Apache Software Foundation\apache-maven-3.2.3\conf (or into the corresponding directory if you installed Maven somewhere else). Choose to overwrite the existing file.
	1. create a directory under "C" drive called "tools\maven_repo\repository" as follows "C:\tools\maven_repo\repository".
	1. once the folder is created, copy the same "settings.xml" and paste it into the "C:\tools\maven-repo\settings.xml"
	
## IntelliJ
Check if IntelliJ is installed:

1. Press Start
1. All programs
1. Check if you have a Jetbrains folder containing a IntelliJ IDEA 1. .1. version
  
If not, install IntelliJ:

1. Download [Intellij Ultimate Edition](http://www.jetbrains.com/idea/download/)
1. Follow installation instructions
1. Use cuso licence server
    1. When you first start Intellij, it will ask you for a licence
    1. Click "Use licence server" 
    1. In the server address field, paste the address http://cuso.edb.se/licenseserver
	1. Click OK (don't click "discover server")

## Setup IntelliJ

### Minimal setup

1. Open IntelliJ 
1. Select File->Settings->Maven
    1. Next to the field "User settings file", check the box "override" 
    1. Write "C:\tools\maven-repo\settings.xml" (without quotes)
    1. Click Apply
    1. Click OK

## Add quick buttons and Maven projects to Intellij GUI

1. Click View -> Tool Windows -> Maven Projects
1. Click View -> Tool Buttons