package src.Questions;

import java.util.SortedMap;

public class Pratice_001 {
    public static void main(String[] args) {



        /*
        Salary Basics
        -----------------
        Yasmeen Sal 15000
        Irshad Sal 12000
        Pooja Sal 10000
        Hasan Sal 25000
        Shifali Sal 8000
        Rashed  Sal 18000

        January Deduction
        -----------------
        Yasmeen 3 Days off
        Irshad 1 Day off
        Pooja 5 Days off
        Hasan 2 Days off
        Shifali 8 Days off
        Rashed 5 Days off

        January Sales
        -----------
      yasmeeen 80000
      irshad  123000
      pooja  970000
      hasan =85000
      hifali  90000
      rashed  1000

      January Refund
      -------------
      Yasmeen 5000
      Irshad 8000
      Hasan 25000
      Pooja 8000
      Shifali 2000
      Rashed 3000

      January Incetives
      -----------------
      Yasmeen 5%
      Irshad 5%
      Hasan 11%
      Pooja 1%
      Shifali 2%
      Rashed 8$


      January Office Expences

      Rent 40000
      Light 5000
      Water 2000
      Adwords 25000

      Personal Expences
      Cigrette 15000
      Petrol 10000
      Tea and Food 10000
   */


        // January Sales for Visas Central

        int yasmeeen = 80000;
        int irshad = 123000;
        int pooja = 970000;
        int hasan = 85000;
        int shifali =  90000;
        int rashed = 1000;

        int January_sales = yasmeeen + irshad + pooja + hasan + shifali +rashed ;

        System.out.println(" Total sales for the month of January is " + January_sales);

        //January Incetives

        double yasmeeen1 = 80000 * 3/100;
        double irshad1 = 123000 * 5/100;
        double pooja1= 970000 * 2/100;
        double hasan1 = 85000 * 11/100;
        double shifali1 =  90000 *2/100;
        double rashed1 = 1000 * 8/100;

        double January_Incentives = yasmeeen1 + irshad1 + pooja1 + hasan1 + shifali1 + rashed1;

        System.out.println( "Total Incentives for all team members is " +  January_Incentives);


        // January Refund

        int Yasmeen = 5000;
        int Irshad = 8000;
        int Hasan = 25000;
        int Pooja = 8000;
        int Shifali = 2000;
        int Rashed = 3000;

        int Refund = Yasmeen + Irshad + Hasan + Pooja + Shifali + Rashed;

        System.out.println( " Total fefund for jan is " +  Refund );



        //System.out.println(" Total Earnings for Jan " + January_Incentives + January_sales);


        //january Office Expences

        int Rent = 40000;
        int Light= 5000;
        int Water = 2000;
        int Adwords =  25000;

        int Offexpences = Rent + Light + Water + Adwords;

        System.out.println( " Monthly expences for jan is " + Offexpences);


        //Personal Expences for jan
        int Cigrette = 15000;
        int Petrol = 10000;
        int tea_food =  10000;

        int personal_exp = Cigrette + Petrol + tea_food;

        System.out.println( " Person expences of mine is " + personal_exp);

        System.out.println( " Total Deduction from earning is " + (January_sales + January_Incentives - personal_exp - Offexpences - Refund) );


        int Yasmeen3 = 15000;
        int Irshad3 =  12000;
        int Pooja3 = 10000;
        double Hasan3 = 25000D;
        int Shifali3 = 8000;
        int Rashed3 = 18000;

        int salpay_perday = Yasmeen3/31;

        int grosspay_yasmeen = salpay_perday *28;

        int Incentive_for_yasmeen = 5*grosspay_yasmeen / 100 ;

        int total_sal_of_yasmeen = grosspay_yasmeen + Incentive_for_yasmeen;

        System.out.println(" Final pay for yasmeen is "+ total_sal_of_yasmeen);


        int salary_per_day = Irshad3/31;
        int gross_pay_irshad = salary_per_day * 30;
        int incentivfor_irshad = 2*gross_pay_irshad/100;
        int net_pay_irshaddd = gross_pay_irshad + incentivfor_irshad;

        System.out.println("Final pay cheque for irshad is " + net_pay_irshaddd);

        //int salary  = Hasan3/31;
        //int daily_pay_hasan = Daily_pay_for_hasannn * 29;
        //int inct_for_hasan = 11*daily_pay_hasan/100;
        //int final_pay= daily_pay_hasan + inct_for_hasan ;

        //System.out.println( " Hasan ali Pay cheque is " + final_pay);


        //double yasmeeen2 = 80000 * 3/100;

        //System.out.println( yasmeeen2);
























    }
}
