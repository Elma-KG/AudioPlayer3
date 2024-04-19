# HBV202G AudioPlayer
By Elma Karen Gunnarsdóttir and Jóhannes Jóhannesson

A project that can make you "login" with your name and then make you chose between a few playlist, and after choosing one you can play the song that 
are on that playlist. Making the song stop and start, while also seeing the progress of how much of the song has played.

## Installation

### System requirements
Have the following installed on your system
- Java Development Kit (JDK)

## Project Structure

UML Class diagram: [here](src/markdown/Skjámynd%202024-04-16%20134747.png)

## Building

### Maven:
<b>Maven Compiler Plugin:</b>
Maven source 21, version 3.11.0.

<b>JavaFX Maven Plugin:</b>
Version 0.0.8. (Group ID: org.openjfx) <br>

- `mvn compile` compiles all implementation classes.
- `mvn test` runs all test cases (i.e. all classes with a name that either starts with `Test` or ends with `Test`).
As long as you have not finished implementing all packages, it is better to use the IDE to
  run individual test cases or package-level test suites.
- `mvn package`creates a jar file so it can convert to another format
- `mvn site` generates documentation which later can be open in a browser, generated into a target folder
- `mvn exec:java` executes the system from the maven command

## Usage

### Executing the Main Method

To be able to load the program there are a few ways, one with maven where you go to Maven -> Plugins
-> javafx -> javafx:run

The second way is through PlayerApplication and pressing the run current file in the top right corner. PlayerApplication is the main Class.

If users do not have Maven, the they can run it as the following:
- Package classes and create jar file with: .\creatjar.cmd
- Run the jar file:    .\runjar.cmd


## License
[MIT](LICENSE)
