package Module5.MavenExamples.Q37_DefaultPhasesMavenCycle;

public class Main {
    
}
/*
The default Maven lifecycle contains the following phases in their execution order:


Phase                                              	Purpose
validate	                       Checks whether the project is correct and complete.
initialize                         Initializes the build state.
generate-sources	               Generates source code if required.
process-sources	                   Processes the source files.
generate-resources	               Generates resources.
process-resources	               Copies and processes resources.
compile	                           Compiles the main Java source code.
process-classes	                   Processes compiled classes.
generate-test-sources	           Generates test source code.
process-test-sources	           Processes test source files.
generate-test-resources	           Generates test resources.
process-test-resources	           Copies and processes test resources.
test-compile	                   Compiles test source code.
process-test-classes	           Processes compiled test classes.
test	                           Runs unit tests.
prepare-package	                   Performs preparation before packaging.
package	                           Creates the JAR, WAR or configured package.
pre-integration-test	           Prepares the environment for integration tests.
integration-test	               Runs integration tests when configured.
post-integration-test	           Cleans up after integration testing.
verify	                           Performs checks on the packaged artifact.
install	                           Installs the artifact in the local repository.
deploy	                           Publishes the artifact to a remote repository.

Code — Run selected phases

mvn validate
mvn compile
mvn test
mvn package
mvn verify
mvn install
mvn deploy

These are phases of the default lifecycle. The clean and site lifecycles have their own phases. Some phases require 
additional plugin configuration or credentials to perform their full tasks.
*/