package src.IFelse;

import java.util.Scanner;

public class Else_if_pratice_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println( "Hight Runs Scored");
        int Score = sc.nextInt();


        if (Score >=150 && Score <= 250) {

            System.out.println("India made the Highest score");

        } else if (Score >= 149 && Score <= 100) {
            System.out.println( "Australia Made the top score");

        } else if (Score >= 50 && Score <= 99) {
            System.out.println("Srilanka Score the runs");

        }
        else {
            System.out.println("Enter correct score");
        }





    }

}
