package Module5.Annotations.Q04_SuppressWarnings;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        @SuppressWarnings("unchecked")
        List names = new ArrayList();

        names.add("Shivaaya");
        names.add("Ajay");

        System.out.println(names);
    }
}

/*The @SuppressWarnings annotation tells the compiler to suppress specified warnings in the annotated scope.
For example, "unchecked" suppresses unchecked-operation warnings. It does not fix the underlying problem, so it 
should be used carefully.
*/