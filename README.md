# HBV202G AudioPlayer
A project that can make you "login" with your name and then make you chose between a few playlist, and after choosing one you can play the song that 
are on that playlist. Making the song stop and start, while also seeing the progress of how much of the song has played.

## Installation

This project is a Maven project, i.e. it uses the standard Maven project structure that your IDE should understand
when you `git clone` it. The provided Maven POM includes the JUnit4 dependency.

## Project Structure

Design pattern [here](src/markdown/Skjámynd%202024-04-16%20134747.png)


Both the implementation and the testa are in Java package 'AudioPlayer.src', but in the 'src' directories:

-'src/java/v/vidmot':
    -


-'src/test/java':
    -

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


## License
[MIT](LICENSE)

## Usage

### Executing the Main Method

To be able to load the program there are a few ways, one with maven where you go to Maven -> Plugins
-> javafx -> javafx:run

The second way is through PlayerApplication and pressing the run current file in the top right corner. PlayerApplication is the main Class.

Another one is using the jar!!!  