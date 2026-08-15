package Module1.Q28_ArrayBubbleSort;

public class ArrayBubbleSort {
    public static void main(String[] args) {

        int[] numbers = {50, 20, 40, 10, 30};

        int temp;

        for (int i = 0; i < numbers.length - 1; i++) {

            for (int j = 0; j < numbers.length - 1 - i; j++) {

                if (numbers[j] > numbers[j + 1]) {

                    temp = numbers[j];

                    numbers[j] = numbers[j + 1];

                    numbers[j + 1] = temp;

                }

            }

        }

        System.out.println("Sorted Array:");

        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i] + " ");

        }

    }

}