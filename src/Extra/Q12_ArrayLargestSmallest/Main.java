package Extra.Q12_ArrayLargestSmallest;

public class Main {
    public static void main(String[] args){

        int[] numbers = {30,80,70,20};

        int largest = numbers[0];
        int smallest = numbers[0];

        for(int i = 1; i < numbers.length; i++){
            if (numbers[i] > largest){
                largest = numbers[i];
            }

            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}