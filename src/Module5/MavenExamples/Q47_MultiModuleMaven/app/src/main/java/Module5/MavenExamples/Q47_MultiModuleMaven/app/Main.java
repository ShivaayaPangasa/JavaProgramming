package Module5.MavenExamples.Q47_MultiModuleMaven.app;

import Module5.MavenExamples.Q47_MultiModuleMaven.sharelib.GreetingService;

public class Main {
    public static void main(String[] args) {
        GreetingService service = new GreetingService();
        System.out.println(service.getGreeting());
        System.out.println("Multi-module Maven project works!");
    }
}
