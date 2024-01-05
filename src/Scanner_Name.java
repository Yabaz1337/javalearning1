package src;

import java.util.Scanner;

public class Scanner_Name {
    public static void main(String[] args) {
        Scanner NewScanner = new Scanner(System.in);

        System.out.println("Enter Monthly Expences");

        System.out.println("Add Salary");
        int AddSalary = NewScanner.nextInt();

        System.out.println("Rent Recieved");
        int Rentincome = NewScanner.nextInt();

        System.out.println("Enter your monthly Petrol exp ");
        int petrolExp = NewScanner.nextInt();

        System.out.println("Enter monthly Grocery");
        int GroceryExp = NewScanner.nextInt();

        System.out.println("Enter Monthly Electricity Bill");
        int ElectricityBill = NewScanner.nextInt();

        System.out.println("Enter Monthly Water Bill");
        int WaterBill = NewScanner.nextInt();

        System.out.println("Enter Office Rent");
        int OfficeRent = NewScanner.nextInt();

        int grossincome = AddSalary + Rentincome;
        System.out.println("Total Monthly Income " + grossincome);

        int MonthlyExp = petrolExp + GroceryExp + ElectricityBill + WaterBill + OfficeRent;
        System.out.println("Total Monthly Expenses " + MonthlyExp);

        int netcome = grossincome - MonthlyExp;
        System.out.println("Monthly saving " + netcome);


    }
}
