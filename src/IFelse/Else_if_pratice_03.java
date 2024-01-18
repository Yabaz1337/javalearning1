package src.IFelse;

import java.util.Scanner;

public class Else_if_pratice_03 {
    public static void main(String[] args) {

        Scanner Brand = new Scanner(System.in);
        System.out.println( "Enter Cigrette Name");
        String name_of_cigg = Brand.next();

        if (name_of_cigg == "Charminar") {
            System.out.println( "Charminar was one of the most popular brands during the 70s and 80s in India. Charminar name was given as the company was situated in Hyderabad");

        } else if (name_of_cigg == "Davidoff") {
            System.out.println("Pall Mall, Camel, Benson & Hedge, Dunhill, Parliament, Davidoff, Marlboro are the best menthol filtered cigarettes brands in India");

        } else if (name_of_cigg == "Gold Flake") {
            System.out.println("Gold Flake (small) is the largest selling brand closely followed by Navy Cut. Brands like Scissors, Four square are also pretty huge.");

        } else if (name_of_cigg == "Benson & Hedges") {
            System.out.println("Benson & Hedges is a British brand of cigarettes owned by American conglomerate Altria");

        }else {
            System.out.println("This brand of cigg is not Avilable try to quit smoking");
        }


    }

    public static class Mobilnumber_ifelse {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Mobil Number");
            long num = sc.nextLong();

            if (num==9700234005l){
                System.out.println("Its Hasan Mobile Number");

            } else if (num== 9908313594l) {
                System.out.println("Its Azra's Mobil Number");

            } else if (num==9885746643l) {
                System.out.println("Its Hasan Mon Mobil Number ");

            } else if (num==9395395395l) {
                System.out.println("Its Hasan Grand mother number");

            } else if (num == 9966661511l) {
                System.out.println("Its Rashed Mobil Number");
            } else {
                System.out.println("404 Not found");
            }

        }
    }
}
