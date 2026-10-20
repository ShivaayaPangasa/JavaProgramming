
# Q3 - Custom Annotations with Maven

## Aim
To develop a core Java application using custom annotations
and Maven for dependency management.

## Concepts Used
- Custom annotations using @interface
- @Retention and RetentionPolicy.RUNTIME
- Annotation default values
- Applying annotations to classes
- Reflection
- Maven dependencies

## Dependency
Apache Commons Lang 3.17.0

## Description
The program creates a custom CourseInfo annotation to store
course information. It retrieves annotation values using
reflection and uses Apache Commons Lang to capitalize a
student's name.

Maven manages the external library and builds the application.

## Commands
mvn clean compile
mvn exec:java
mvn dependency:tree

## Result
The program displays the student name, course information,
and the result of checking for an annotation on a method.
