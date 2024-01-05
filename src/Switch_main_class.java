package src;

import java.util.Scanner;

public class Switch_main_class {
    public static void main(String[] args) {

        Scanner month = new Scanner(System.in);
        System.out.println("Enter number between 1-12 i will tell you which month it is ");
        int Monthnumber = month.nextInt();

        switch (Monthnumber){
            case 1:
                System.out.println("This is January");
                break;

            case 2:
                System.out.println("This is febuary");
                break;

            case 3:
                System.out.println("This is march");
                break;

            case 4:
                System.out.println("This is April");
                break;

            case 5:
                System.out.println("This is may");
                break;

            case 6:
                System.out.println("This is june");
                break;

            case 7:
                System.out.println("this is julu");
                break;

            case 8:
                System.out.println("This is August");
                break;

            case 9:
                System.out.println("this is Sep");
                break;

            case 10:
                System.out.println("this is OCT");
                break;

            case 11:
                System.out.println("this is November");
                break;

            case 12:
                System.out.println("This is December");
                break;

            default:
                System.out.println("Enter Valid details");
        }
    }
}
