package Module1.Q18_ArraySmallestLargest; 

public class ArraySmallestLargest{

    public static void main(String args[]){

       int[] arr = {10,20,50,30,5};
       int smallest = arr[0];
       int largest=arr[0];

       for(int i=1; i<arr.length;i++){

           if(arr[i]<smallest){
               smallest = arr[i];
           }

           if(arr[i]>largest){
               largest=arr[i];
           }
        }         
        
        System.out.println("Smallest = " + smallest);
        System.out.println("Largest = " + largest);
    
    }
}