# Q47 - Multi-Module Maven Project

## Aim
To demonstrate how to create a multi-module Maven project.

## Theory
A multi-module Maven project contains a parent POM
and two or more related child modules.

The parent lists the modules and defines shared configuration.
The child modules contain their own code and POM files.

## Modules

1. shared-lib: Contains the reusable GreetingService class.
2. app: Uses GreetingService from the shared-lib module.

## Files

- pom.xml: Parent Maven configuration.
- shared-lib/pom.xml: Shared library configuration.
- shared-lib/src/main/java/com/example/shared/GreetingService.java:
  Reusable greeting service.
- app/pom.xml: Application configuration.
- app/src/main/java/com/example/app/Main.java:
  Main application.
- README.md: Project information and commands.

## Build

Run this from the folder containing the parent pom.xml:

mvn clean install

## Run

mvn -pl app exec:java

## Expected Output

Hello from the shared library!
Multi-module Maven project works!