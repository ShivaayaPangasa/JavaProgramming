package Module1.Q20_LargestThreeNumbers;

import java.util.Scanner;

public class LargestThreeNumber {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        System.out.print("Enter third number: ");
        int c= input.nextInt();

        if(a>b && a>c){
            System.out.println(a+ " is the greatest");
        }

        else if(b>a && b>c){
            System.out.println(b + " is the greatest");
           }

        else{
            System.out.println(c + " is the greatest");
       }

       input.close();
    }
}