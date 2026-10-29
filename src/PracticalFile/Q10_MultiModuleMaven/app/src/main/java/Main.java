package PracticalFile.Q10_MultiModuleMaven.app.src.main.java;

public class Main {

    public static void main(String[] args) {
        GreetingService service = new GreetingService();

        System.out.println(
            service.createGreeting("Shivaaya")
        );
    }
}