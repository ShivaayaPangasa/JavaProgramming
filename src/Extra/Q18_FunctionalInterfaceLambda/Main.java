package Extra.Q18_FunctionalInterfaceLambda;

@FunctionalInterface
interface Operation{
    int calculate(int a, int b);
}

public class Main {
    public static void main(String[] args){
        Operation add = (a,b) -> a+b;
        Operation multiply = (a,b) -> a*b;

        System.out.println(add.calculate(4,3));
        System.out.println(multiply.calculate(4,3));
    }
}