package Extra.Q03_GenericBoxClassProgram;

class Box<T>{
    private T item;
    public void addItem(T item){
        this.item = item; 
        //item belonging to current object is equal to the method parameter
        //i.e. Put the parameter item into object's item variable
    }

    public T getItem(){
        return item;
    }
}

public class Main {
    public static void main(String[] args){

        Box<String> stringBox = new Box<>();
        stringBox.addItem("Hello Java");
        System.out.println("String Box: " + stringBox.getItem());
        
        Box<Integer> integerBox = new Box<>();
        integerBox.addItem(100);
        System.out.println("Integer Box: " + integerBox.getItem());
    }
    
}