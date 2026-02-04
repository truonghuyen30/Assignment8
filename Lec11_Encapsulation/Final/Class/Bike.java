package Lec11_Encapsulation.Final.Class;

public final class Bike {

    void run() {
        System.out.println("running");
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run();
    }
}
