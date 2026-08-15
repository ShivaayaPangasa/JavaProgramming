package Module1.Q15_Prime_While;

public class prime_while{
    public static void main(String[] args){

        int number = 13;

        boolean isPrime = true;

        int i =2;

        if (number <= 1){
            isPrime = false;
        }

        else {

            while (i<number){

                if(number%i ==0){
                    isPrime = false;
                    break;
                }   
                i++;
            }

        }

        if(isPrime){  //Is isPrime true?
            System.out.println(number + " is a prime number");
        }
        else{
            System.out.println(number + " is not a prime number:");
        }

    }

}