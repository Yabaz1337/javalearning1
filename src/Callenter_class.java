package src;

import java.util.Scanner;

public class Callenter_class {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Callender 1-12");
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println("Its january, and its contain 30 days,720 hours,43,200 Minutes ");

        } else if (num==2) {
            System.out.println("Its Feb,and it contains 29 days, 796 Hours ");

        } else if (num==3) {
            System.out.println("Its March and it contails 30 days,720 hours,43,200 Minutes");

        } else if (num==4) {
            System.out.println("Its April and it contains 31 days 744 hours ");

        } else if (num==5) {
            System.out.println("Its May and its contain 30 days,720 hours,43,200 Minutes");

        } else if (num==6) {
            System.out.println("Its June and its contain 31 days,744 hours");

        } else if (num== 7) {
            System.out.println("Its July and nd its contain 30 days,720 hours,43,200 Minutes");

        } else if (num== 8) {
            System.out.println("Its August and all");

        } else if (num==9) {
            System.out.println("Its September");

        } else if (num==10) {
            System.out.println("Its October");
        } else if (num==11) {
            System.out.println("Its November");
        } else if (num==12) {
            System.out.println("its Decembeeeer");
        } else {
            System.out.println("404 Not found");
        }
    }
}
