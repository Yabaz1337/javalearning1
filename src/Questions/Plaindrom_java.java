package src.Questions;

import java.util.Scanner;

import static java.util.Scanner.*;

public class Plaindrom_java {
    public static void main(String[] args) {

        //Plaindrom

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a string and ill check for Plaindrom");
        String user_input = Sc.next();

        boolean result =Plaindrome (user_input);
        if (result) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }

    private static boolean Plaindrome(String userInput) {
        String originalstr = userInput;
        StringBuilder Sb = new StringBuilder(userInput);
        Sb.reverse();
        return originalstr.equalsIgnoreCase(Sb.toString());

    }
}
