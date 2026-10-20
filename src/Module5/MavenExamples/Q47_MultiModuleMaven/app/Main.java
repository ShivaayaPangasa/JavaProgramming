package Module5.MavenExamples.Q47_MultiModuleMaven.app;

import Module5.MavenExamples.Q47_MultiModuleMaven.sharelib.GreetingService;

public class Main {
    public static void main(String[] args) {

        // Create an object from the shared library
        GreetingService service = new GreetingService();

        // Call the method from the shared module
        System.out.println(service.getGreeting());

        System.out.println("Multi-module Maven project works!");
    }
}
