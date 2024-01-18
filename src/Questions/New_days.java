package src.Questions;

import java.util.Scanner;

public class New_days {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number betwwn 1 to 7 i will tell you which day it is ");
        int num = sc.nextInt();

        if (num == 1 ) {
            System.out.println("THis is Monday");

        } else if (num == 2) {
            System.out.println("This is Tuedsy");

        } else if (num == 3) {
            System.out.println("This is Wedndsay");


        } else if ( num==4) {
            System.out.println("This is thursday");

        } else if (num==5) {
            System.out.println( "labbik Friday");

        } else if (num==6) {
            System.out.println("Its Saturday No daru day");

        } else if (num==7) {
            System.out.println("Its Sunday");

        } else {
            System.out.println("Please enter numbeer btwn 1 to 7");
        }
    }
}
