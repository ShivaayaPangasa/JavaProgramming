/* 
A Maven goal is a specific task performed by a plugin. A Maven phase is a stage within a lifecycle that organizes
the build process.
A phase can have one or more plugin goals bound to it. When a phase is executed, Maven runs the goals bound to that 
phase and the preceding phases. A goal may also be executed directly without running the complete lifecycle up to its 
associated phase.

Example commands
Execute a lifecycle phase: 
mvn compile
This executes the default lifecycle up to the compile phase.

Execute a plugin goal directly:
mvn compiler:compile
This directly invokes the compile goal of the Maven Compiler Plugin. Unlike mvn compile, it does not automatically 
execute all the preceding default-lifecycle phases.

Main difference is that a phase represents when a build task occurs, while a goal represents what specific task is 
performed.
*/