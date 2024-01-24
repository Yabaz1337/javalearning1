package src;

import java.util.Scanner;

public class Swap_2Numbers {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of A");
        int A = scanner.nextInt();
        System.out.println("Enter the value of B");
        int B = scanner.nextInt();
        int temp = A;
        A=B;
        B=temp;

        System.out.println("the value of A, B,is " +  A +" -  " + B );
    }

}
