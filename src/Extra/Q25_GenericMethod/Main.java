package Extra.Q25_GenericMethod;

public class Main {
    static <T> void printArray(T[] values){
        for (T value: values){
            System.out.println(value);
        }
    }
    public static void main(String[] args){
        Integer[] numbers = {10,20,30};
        String[] names = {"Shivaaya", "Ajay", "Rasika"};

        printArray(numbers);
        printArray(names);
    }
}