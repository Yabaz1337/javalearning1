package src.Operators;

public class lab001variables {
    private static Object Total_amount;

    public static void main(String[] args) {
        /*
                          List of Variables
                          ------------------
  byte            from    -128         to      127
  short           from    -32768       to      32767
  int             from    -2147483648  to      2147483647
  long            from    -2           to      2147483647
  float           from    1.4E-45      to      3.40E38
  double          from    4.9E-324     to      1.79E308
  char            from    0            to      65535

*/

        short ashirvad = 457;
        short salt = 156;
        short pepsodent = 556;
        byte soap = 90;

        int total_bill = ashirvad + salt + pepsodent + soap;

        float tax = total_bill * 2 /100;



        System.out.println("total bill is " + (total_bill - tax) );









    }
}
