package src.String_Builder;

public class Replase {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("My name is George Sydney");
        str.replace(18,24, " Kaseri");
        System.out.println(str);


        StringBuilder Office= new StringBuilder("Overseas Consultancy");
        Office.replace(19,24,     "Visas");
        System.out.println(Office);

    }
}
