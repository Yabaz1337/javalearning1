package src;

public class Logical_opperator {
    public static void main(String[] args) {
        /*

              && Logical and         Returns true if both statements are true               x < 5 &&  x < 10
             ||Logical or         Returns true if one of the statements is true          x < 5 || x < 4
             !Logical not        Reverse the result, returns false if the result is true    !(x < 5 && x < 10

       */

        int yasmeenSales = 60000;
        int hasanSales = 45000;

        boolean hightSales = yasmeenSales > hasanSales && hasanSales > yasmeenSales;

        System.out.println( hightSales);

        int a= 125;
        int b = 150;

        boolean c = a < b && b > a ;

        System.out.println( c);



    }
}
