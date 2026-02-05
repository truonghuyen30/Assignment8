package Lec11_Encapsulation.AccessModifier.SamePackageNonSubClass;

public class AccessModifier2 {

    public static void main(String[] args) {
        AccessModifier1 object = new AccessModifier1();
        // System.out.println(object.pvt);  private → không truy cập trực tiếp

        // Truy cập private thông qua getter
        System.out.println(object.getPvt());
        System.out.println(object.df);
        System.out.println(object.pro);
        System.out.println(object.pbl);
    }

}

