package Lec10_Abstraction.Interface.MultiInterface;

public class Circle implements IShape, IColor {

    public void drawShape() {
        System.out.println("Drawing a circle");
    }

    public void fillColor() {
        System.out.println("Filling the circle with green");
    }
}
