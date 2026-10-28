public class Main {

    public static void main(String[] args) {
        GreetingService service = new GreetingService();

        System.out.println(
            service.createGreeting("Shivaaya")
        );
    }
}
