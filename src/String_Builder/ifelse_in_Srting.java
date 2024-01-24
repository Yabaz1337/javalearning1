package src.String_Builder;

public class ifelse_in_Srting {
    public static void main(String[] args) {

        // Equal Ignore case

        String Expectresult = "password@123";
        String Actualresult = "Password@123";
        if (Expectresult.equalsIgnoreCase(Actualresult));{
            System.out.println("Yes you can");
        }

        String Expectedresult1 = "Hasan";
        String Actualresult2 = "hasan";

        if (Expectresult.equalsIgnoreCase(Actualresult));{
            System.out.println("Yes uou can");
        }


    }
}
