
package Module1.Q31_ArrayDuplicateElements;

public class ArrayDuplicateElements {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 20, 40, 10, 50};

        int[] unique = new int[numbers.length];

        int size = 0;

        for (int i = 0; i < numbers.length; i++) {

            boolean isDuplicate = false;

            for (int j = 0; j < size; j++) {

                if (numbers[i] == unique[j]) {

                    isDuplicate = true;

                    break;

                }

            }

            if (!isDuplicate) {

                unique[size] = numbers[i];

                size++;

            }

        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < size; i++) {

            System.out.print(unique[i] + " ");

        }

    }

}