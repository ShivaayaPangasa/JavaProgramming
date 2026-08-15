//14. Implement a program to demonstrate the use of if-else, switch and for loops.

package Module1.Q14_if_else_switch_for;

 public class switches {
    public static void main(String[] args){ //To make class executable 

        int num = 2;

        switch(num){

            case 1:
                System.out.println("The number is one");

            case 2:
                System.out.println("The number is two");

            case 3: 
                System.out.println("The number is three");

            default:
                System.out.println("The number is not one, two or three");

        }

        if (num < 10){
            System.out.println("The number is less than 10");
        }

        else if (num == 10){
            System.out.println("The number is equal to 10");
        }

        else{
            System.out.println("The number is greater than 10");
        }

        for(int i=1; i<=5;i++){
            if (i%2 == 0){
                System.out.println(i + " is an even number");
            }
            else{
                System.out.println(i + " is an odd number");
            }
                
        }

    }

}