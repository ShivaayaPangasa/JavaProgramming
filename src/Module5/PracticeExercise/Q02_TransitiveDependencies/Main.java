package Module5.PracticeExercise.Q02_TransitiveDependencies;

import com.google.common.collect.ImmutableList;

public class Main {

    public static void main(String[] args) {

        ImmutableList<String> names =
                ImmutableList.of("Alex", "Priya", "Rahul");

        System.out.println("Names: " + names);
        System.out.println("First name: " + names.get(0));
        System.out.println("Total names: " + names.size());

        System.out.println(
                "This project demonstrates Maven dependencies."
        );
    }
}
