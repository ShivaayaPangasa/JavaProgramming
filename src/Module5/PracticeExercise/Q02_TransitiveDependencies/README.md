
# Q2 - Transitive Dependencies in Maven

## Aim
To demonstrate transitive dependencies in a Maven project.

## Theory
A direct dependency is a library explicitly declared in the project's
pom.xml. A transitive dependency is a library that Maven brings in
automatically because a direct dependency requires it.

## Dependency Used
Google Guava 33.3.1-jre.

## Description
The program uses Guava's ImmutableList to create and display a list.
Maven automatically resolves Guava's required dependencies.

## Commands
mvn clean compile
mvn exec:java
mvn dependency:tree

## Result
The program displays a list of names, and Maven resolves the
project's dependency tree, including transitive dependencies.
