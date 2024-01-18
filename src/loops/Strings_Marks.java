package src.loops;

import java.util.Scanner;

public class Strings_Marks {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        int[] Marks = new int[5];
        System.out.println("Enter Hindi Marks");
        Marks[0] = Sc.nextInt();
        System.out.println("Enter Telugu Marks");
        Marks[1] = Sc.nextInt();
        System.out.println("Enter English Marks");
        Marks[2] = Sc.nextInt();
        System.out.println("Enter MAths Marks");
        Marks[3] = Sc.nextInt();
        System.out.println("Enter Science Marks");
        Marks[4] = Sc.nextInt();
        System.out.println("Enter Social Marks");

        for (int i = 0; i < Marks.length; i++){
            if ( Marks [i] < 30) {
                System.out.println("You passed in the subject ");

            }
            else {
                System.out.println("You failed in subject");
            }
            System.out.println(Marks[i]);
        }

        Sc.close();







    }
}
