# Q41 — Dependency mediation

This POM demonstrates how `<dependencyManagement>` pins a selected version. Use `mvn dependency:tree -Dverbose` to inspect the resolved graph and version selection. Maven's nearest-definition rule still matters for versions that are not centrally managed.
