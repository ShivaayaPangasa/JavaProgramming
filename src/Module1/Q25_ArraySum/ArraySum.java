package Module1.Q25_ArraySum;

public class ArraySum {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            
            sum = sum + arr[i];

        }
        System.out.println("Sum = " + sum);
    }

}