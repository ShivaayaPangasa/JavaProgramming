
# Q48 - Maven Dependency Scopes

## Aim
To understand the difference between compile, provided, and runtime
dependency scopes in Maven.

## 1. Compile Scope
- Default scope when no scope is specified.
- Available during compilation and runtime.
- Example: Apache Commons Lang.

## 2. Provided Scope
- Available during compilation and testing.
- Expected to be provided by the runtime environment.
- Not normally included in the application's runtime classpath.
- Example: Jakarta Servlet API in a web application.

## 3. Runtime Scope
- Not available on the normal main-source compilation classpath.
- Available during runtime and testing.
- Example: H2 database driver.

## Commands
mvn clean compile
mvn dependency:tree
mvn exec:java

## Expected Output
Compile scope: Maven dependency scopes
Runtime scope: Student = Alex
Dependency scopes demonstration completed.
