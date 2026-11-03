package Extra.Q21_ExceptionLogging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    public static void main(String[] args){
        try{
            int result = 10/0;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            LOGGER.log(Level.SEVERE, "Calculation failed", e);
        }
    }
}