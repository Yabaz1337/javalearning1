package src.String_Builder.Delete;

public class string {
    public static void main(String[] args) {

        StringBuilder Jav = new StringBuilder("Hello My World");

        System.out.println(Jav.length());

        Jav.delete(6,8);

        System.out.println(Jav);
    }
}
