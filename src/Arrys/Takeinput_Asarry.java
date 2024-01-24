package src.Arrys;

import java.util.Scanner;

public class Takeinput_Asarry {
    public static void main(String[] args) {

        //Take user input as arry !!

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int n= sc.nextInt();
        int [] int_arry = new int[n];

        System.out.println("Enter the elements");
        for (int i = 0; i <n; i++) {
            int_arry[i] = sc.nextInt();

        }

        System.out.println("*-------------------OUTPUT");
        for (int i = 0; i < n; i++) {
            System.out.println(int_arry[i]);

        }
        sc.close();
    }
}
