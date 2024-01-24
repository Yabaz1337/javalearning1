package src.String_Builder;

public class SB_Insert {
    public static void main(String[] args) {


        StringBuilder S1 = new StringBuilder("Hasan");
        S1.insert(4,123);
        System.out.println(S1);

        StringBuilder Immi = new StringBuilder("Visa Centra");
        Immi.insert(4,"s");
        Immi.insert(12,"l");
        System.out.println(Immi);

        StringBuilder City = new StringBuilder("Hyderabad");
        City.insert(9,"Telangana");
        System.out.println(City);

    }
}
