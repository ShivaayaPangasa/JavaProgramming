// 16.	Create a program to calculate the factorial of a number using recursion
package Module1.Q21_Factorial_Recursion;
public class fact{

    public static int factorial(int num){

        if (num== 0 || num ==1){
            return 1;
        }
        else{
            return num * factorial(num-1);
        }
    }
    public static void main(String[] args){
        int num = 5;
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }

}