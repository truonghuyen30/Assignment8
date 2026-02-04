package Lec11_Encapsulation.Example;

public class EncapsulationExist {

    public static void main(String[] args) {
        Person a = new Person();
        a.name = "Trang";
        a.setWeight(-10);
        System.out.println(a.getWeight());
    }

}
