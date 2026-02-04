package Lec11_Encapsulation.AccessModifier.SamePackage;

public class AccessModifier2 extends
        AccessModifier1 {

    @Override
    public void display() {

        System.out.println(df);
        System.out.println(pro);
        System.out.println(pbl);
    }

    public static void main(String[] args) {
        AccessModifier2 obj = new AccessModifier2();
        obj.display();
    }
}
