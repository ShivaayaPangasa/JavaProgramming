package Module1.Q05_AnimalPolymorphism;

public class AnimalPolymorphism{
    public static void main(String[] args){
        Animal animal; //Creates one parent reference (variable declaration) 
        // reference variable and this container is only allowed to hold things that are of the type Animal

        animal = new Elephant(); //same parent reference - elephant child object
        animal.move();

        animal = new Eagle(); //same parent reference - eagle child object
        animal.move();

        animal = new Dolphin(); //same parent reference - dolphin child object
        animal.move();
    }
}