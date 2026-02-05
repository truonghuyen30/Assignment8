
package Lec11_Encapsulation.AccessModifier.DifferentPackageSubClass.Text2;

import Lec11_Encapsulation.AccessModifier.DifferentPackageSubClass.Text1.AccessModifier1;

public class AccessModifier2 extends AccessModifier1 {

    public static void main(String[] args) {
        AccessModifier2 obj = new AccessModifier2();

        // System.out.println(obj.pvt); //  private
        // System.out.println(obj.df);  //  default (khác package)

        System.out.println(obj.pro); 
        System.out.println(obj.pbl); 
    }
}

