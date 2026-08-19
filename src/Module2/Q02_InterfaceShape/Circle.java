package Module2.Q02_InterfaceShape;

import Module2.Q02_InterfaceShape.shapes.Shape;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    
}