package Module1.Q30_ArrayBinarySearch;

public class ArrayBinarySearch {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60,70};

        int target = 60;

        int left = 0;

        int right = numbers.length - 1;

        boolean found = false;

        while (left <= right){
            int mid = (left + right)/2;

            if(numbers[mid] == target){
                System.out.println("Element found at index: " + mid);
                found = true;
                break;

            }

            else if (numbers[mid]<target){
                left = mid+1;
            }

            else{
                right = mid-1;
            }
        }

        if (!found) { //If not found

            System.out.println("Element Not Found");
        }
    }
}