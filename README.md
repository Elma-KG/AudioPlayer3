# HBV202G AudioPlayer
A project that can make you "login" with your name and then make you chose between a few playlist, and after choosing one you can play the song that 
are on that playlist. Making the song stop and start, while also seeing the progress of how much of the song has played.

## Installation

This project is a Maven project, i.e. it uses the standard Maven project structure that your IDE should understand
when you `git clone` it. The provided Maven POM includes the JUnit4 dependency.

## Project Structure

Both the implementation and the testa are in Java package 'AudioPlayer.src', but in the 'src' directories:

-'src/java/v/vidmot':
    -


-'src/test/java':
    -

## Building

Maven:

- `mvn compile` compiles all implementation classes.
- `mvn test` runs all test cases (i.e. all classes with a name that either starts with `Test` or ends with `Test`,
  `Tests`, or `TestCase`). As long as you have not finished implementing all packages, it is better to use the IDE to
  run individual test cases or package-level test suites.
- `mvn package`
- `mvn site`
- `mvn exec:java`


## License
brackets: [MIT](https://spdx.org/licenses/MIT.html)

## Usage

### Executing the Main Method