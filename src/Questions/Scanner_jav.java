package src.Questions;

import src.IFelse.Else_if_pratice_02;

import java.util.Scanner;

public class Scanner_jav {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers ill tell you which number is greater");

        int Num1 = sc.nextInt();
        int Num2 = sc.nextInt();

        if (Num1 == Num2) {
            System.out.println("Both the numbers are equal");
        } else if (Num1 > Num2) {
            System.out.println("Its greater" +    Num1 );
        } else if (Num1 < Num2) {
            System.out.println("Its Smaller Number" + Num1);
        }


    }
}
