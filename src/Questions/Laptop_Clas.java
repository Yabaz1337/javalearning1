package src.Questions;

import java.util.Scanner;

public class Laptop_Clas {
    public static void main(String[] args) {

        Scanner Itemcode = new Scanner(System.in);
        System.out.println("Enter item Code");
        int itemCode = Itemcode.nextInt();

        itemCode  = 001;
        switch (itemCode) {

            case 001,002,003:
                System.out.println("Its Apple Laptop");
                break;

            case 004,005:
                System.out.println("Its Samsung Laptop");
                break;

            default:
                System.out.println("Please enter the number between 001 to 005");
        }
    }
}
