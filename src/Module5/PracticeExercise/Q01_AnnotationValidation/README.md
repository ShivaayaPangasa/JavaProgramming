
# Q1 - Maven Project Using Annotations for User Input Validation

## Aim
To create a Maven project that validates user input using annotations.

## Concepts Used
- Maven dependencies
- Java annotations
- Jakarta Bean Validation
- @NotBlank
- @Email
- @Min
- @Max
- Validator and ConstraintViolation

## Description
The program validates a user's name, email address, and age.
It uses validation annotations to define rules and prints errors
when the supplied data does not satisfy those rules.

## Run
mvn clean compile
mvn exec:java

## Result
The program displays validation errors for invalid user input.
