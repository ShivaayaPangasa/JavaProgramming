import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        String name = "   Alex   ";

        System.out.println("Module A");
        System.out.println("Original name: [" + name + "]");
        System.out.println("Clean name: " + StringUtils.trim(name));
        System.out.println("Is name blank? " + StringUtils.isBlank(name));
    }
}