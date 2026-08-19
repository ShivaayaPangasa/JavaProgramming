package Module2.Q02_InterfaceShape;

import Module2.Q02_InterfaceShape.shapes.Shape;

public class Main{
    public static void main(String[] args){
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(2,3);

        System.out.println("Circle Area = " + circle.area());
        System.out.println("Rectange Perimeter = " + rectangle.perimeter());
    }

}