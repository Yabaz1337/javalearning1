package src;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Marks");
        int Marks = sc.nextInt();

        if (Marks >= 90 && Marks <= 100) {
            System.out.println("Your Score is Merit");

        } else if (Marks >= 80 && Marks <= 89) {
            System.out.println("Your Score is A");

        } else if (Marks >= 70 && Marks <= 79) {
            System.out.println("Your Score is A");

        } else if (Marks >= 50 && Marks <= 69) {
            System.out.println("Your Score is B");

        } else if (Marks >= 30 && Marks <= 49) {
            System.out.println("Your Score is C");


        } else if (Marks >= 0 && Marks <= 29) {
            System.out.println("Pardlo salo");

        } else if (Marks >= 101 && Marks <= 500) {
            System.out.println("seeda likh");


        }
    }
}

            




