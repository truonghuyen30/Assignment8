package Lec10_Abstraction.Interface.Example2;

public class Circle implements IColor {

    public void drawShape() {
        System.out.println("Drawing a circle");
    }

    public void fillColor() {
        System.out.println("Filling the circle with green");
    }
}
