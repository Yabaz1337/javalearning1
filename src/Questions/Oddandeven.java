package src.Questions;

import java.util.Scanner;

public class Oddandeven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num = sc.nextInt();

        if (num%2 == 0 ) {
            System.out.println("THis is even number");

        }
        else if (num%2 != 0 ) {
            System.out.println("THis is odd number");

        }

    }
}
