package src;

import java.util.Scanner;

public class Mobilnumber_ifelse {
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
