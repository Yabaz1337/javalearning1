package src.Questions;

import java.util.Random;
import java.util.Scanner;

public class Tringle {
    public static void main(String[] args) {


        Scanner SE = new Scanner(System.in);
        System.out.println("Enter Length 1,length 2 lengh 3 ill tell you which tringle it is");

        int length1 = SE.nextInt();
        int Length2 = SE.nextInt();
        int Length3 = SE.nextInt();

        if ((length1 == Length2) && (Length2 == Length3) && (length1==Length3)){
            System.out.println("its Equilateral tringle ");
            
        } else if ((length1==Length2) && (length1==Length3)) {
            System.out.println("Its isocelrs tringle");
        } else {
            System.out.println("Its Scaleane");
            
        }


    }
}
