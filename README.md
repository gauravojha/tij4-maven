# Thinking In Java 4 Source Code. 
### Updated to JDK8, and shifted to Maven.

### Note: For the 'annotations' package

Bruce's code uses the legacy `apt` tool, which has been [deprecated in Java 7](http://docs.oracle.com/javase/7/docs/technotes/guides/apt/), and [removed in Java 8](http://openjdk.java.net/jeps/117). 

In order to remove the compilation errors you would see in Eclipse, please add the "External Jar" - tools.jar provided in the "lib" folder to your Eclipse project. (Taken from OpenJDK 7u51)

### Installation
Simply download the source code (clone the project) and import this project as a new Maven project into your IDE.

Please note that as mentioned on the author's website, you need to add the following 4 libraries to successfully build the whole code:
1. XOM
2. Javaassist
3. swt.jar
4. javaws.jar

XOM and Javaassist have been placed as a maven dependency in  pom.xml. 

As for swt.jar and javaws.jar, javaws.jar can found in your JRE installation at inside the 'lib' folder. Example: C:\Program Files\Java\jre1.8.0_77\lib

swt.jar can be found at: http://download.eclipse.org/eclipse/downloads/
Just choose the latest version, scroll down to "SWT Binary and Source", and download the corresponding binary for your platform.

After you download these two libraries, place them inside the "jre/lib/ext" of the Java Runtime that is set up when you install the JDK.

(As explained by the author Bruce Eckel on the source code page)

**Also, do not forget to add the external 'tools.jar' to your Eclipse project** (Read the note above for annotations package)

Tested on Eclipse.

### Motivation
The book 'Thinking in Java' is an excellent resource for learning Java. This github project simply aims to move the Source Code for the book to a Maven project, thereby making it very easy for learners to import it into their IDEs and begin exploring. 
Personally, I wasn't able to get the Ant build to work, because the build xmls inside the packages had all restrictions that they would only get built if Java SE 5 was present. I had SE7 to start, and like me, I believe most of the learners would have updated their JDK to updated versions.
So instead of modifying the build xmls, I thought it would be better to simply migrate the code to a Maven project.
