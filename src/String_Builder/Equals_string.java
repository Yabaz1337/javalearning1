package src.String_Builder;

import java.util.Scanner;

public class Equals_string {
    public static void main(String[] args) {

        // Equals

        String Name1 = "Hasan";
        String Name2 = new String("Hasan");
        String Name3 = new String("Hasan");
        System.out.println(Name1==Name2);
        System.out.println(Name1.equals(Name2));
        //System.out.println(Name1.equals(Name3)); Case sentivity
        System.out.println(Name1.equalsIgnoreCase(Name3));



    }
}
