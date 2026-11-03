package Extra.Q23_RegexBasics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        String text = "Order 123 has 45 items and costs 900 rupees.";

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}