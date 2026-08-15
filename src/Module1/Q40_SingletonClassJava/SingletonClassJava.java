package Module1.Q40_SingletonClassJava;

class Singleton {

    private static Singleton obj = new Singleton();

    private Singleton() {

        System.out.println("Singleton Object Created");

    }

    public static Singleton getInstance() {

        return obj;

    }

    void display() {

        System.out.println("Hello from Singleton Class");

    }

}

public class SingletonClassJava{
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();

        Singleton s2 = Singleton.getInstance();

        s1.display();

        if (s1 == s2) {

            System.out.println("Both variables refer to the same object.");

        }

    }

}

// private - Only this class can access the object directly.

// static - There is only one copy of this variable for the whole class.

// Singleton obj - Creates a variable named obj.

// new Singleton() - Creates the only object.