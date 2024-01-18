package src.Arrys;

import java.util.Scanner;

public class Arrayinput_usingscaner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What your Three fev Cig Brand");


        String [] Cigrett = new String[3];
        Cigrett[0] = scan.next();
        Cigrett[1] = scan.next();
        Cigrett[2] = scan.next();

        System.out.println(Cigrett[0]);
        System.out.println(Cigrett[1]);
        System.out.println(Cigrett[2]);











    }
}
