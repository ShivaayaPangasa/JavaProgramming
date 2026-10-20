
# Q05 - Maven Multi-Module Project

## Aim
Implement a Maven multi-module project with shared dependencies in the parent pom.xml.

## Modules
- module-a
- module-b

## Shared Dependency
Apache Commons Lang 3.17.0

The dependency is declared in the parent pom.xml and inherited by both modules.

## Commands
- mvn clean
- mvn compile
- mvn package

## Expected Result
Maven successfully builds the parent project and both child modules.
